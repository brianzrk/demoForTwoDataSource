package com.example.demo.common;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * demo-com.example.demo.common
 *
 * @author zhangrk
 * @date 2020/3/30
 */


    @Configuration
    @MapperScan(basePackages = "com.example.demo.dao.mysql", sqlSessionFactoryRef = "mySqlSqlSessionFactory")
    public class MySQLDataSourceConfig {
        @Value("${spring.datasource.dw.druid.driver-class-name}")
        String driverClass;
        @Value("${spring.datasource.dw.druid.jdbc-url}")
        String url;
        @Value("${spring.datasource.dw.druid.username}")
        String userName;
        @Value("${spring.datasource.dw.druid.password}")
        String passWord;

        @Primary
        @Bean(name = "mySqlDataSource")
        @ConfigurationProperties("spring.datasource.dw.druid")
        public DataSource masterDataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName(driverClass);
            dataSource.setUrl(url);
            dataSource.setUsername(userName);
            dataSource.setPassword(passWord);
            return dataSource;
        }

        @Primary
        @Bean(name = "mySqlSqlSessionFactory")
        public SqlSessionFactory sqlSessionFactory(@Qualifier("mySqlDataSource") DataSource dataSource) throws Exception {
            SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
            sessionFactoryBean.setDataSource(dataSource);
            sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResources("classpath:mapper/mysql/*.xml"));

            return sessionFactoryBean.getObject();
        }

        @Primary
        @Bean(name = "mySqlSqlSessionFactory")
        public SqlSessionTemplate sqlSessionFactoryTemplate(@Qualifier("mySqlSqlSessionFactory")SqlSessionFactory sqlSessionFactory ) throws Exception {
            return new SqlSessionTemplate(sqlSessionFactory);
        }
}