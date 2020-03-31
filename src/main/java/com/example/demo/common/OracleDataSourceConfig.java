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
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * demo-com.example.demo.common
 *
 * @author zhangrk
 * @date 2020/3/30
 */

    @Configuration
    @MapperScan(basePackages = "com.example.demo.dao.oracle",sqlSessionFactoryRef = "turbsSqlSessionFactory")
    public class OracleDataSourceConfig {

        @Value("${spring.datasource.oradw.druid.driver-class-name}")
        String driverClass;
        @Value("${spring.datasource.oradw.druid.jdbc-url}")
        String url;
        @Value("${spring.datasource.oradw.druid.username}")
        String userName;
        @Value("${spring.datasource.oradw.druid.password}")
        String passWord;


        @Bean(name = "turbsDataSource")
        @ConfigurationProperties("spring.datasource.oradw.druid")
        public DataSource masterDataSource(){
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName(driverClass);
            dataSource.setUrl(url);
            dataSource.setUsername(userName);
            dataSource.setPassword(passWord);
            return dataSource;
        }

        @Bean(name = "turbsSqlSessionFactory")
        public SqlSessionFactory sqlSessionFactory(@Qualifier("turbsDataSource") DataSource dataSource) throws Exception {
            SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
            sessionFactoryBean.setDataSource(dataSource);
            sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResources("classpath:mapper/oracle/*.xml"));

            return sessionFactoryBean.getObject();
        }

        @Bean(name = "turbsSqlSessionFactory")
        public SqlSessionTemplate sqlSessionFactoryTemplate(@Qualifier("turbsSqlSessionFactory")SqlSessionFactory sqlSessionFactory ) throws Exception {
            return new SqlSessionTemplate(sqlSessionFactory);
        }
    }