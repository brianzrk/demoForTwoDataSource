//package com.example.demo.common;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//
///**
// * demo-com.example.demo.common
// *
// * @author zhangrk
// * @date 2020/3/30
// */
//@Configuration
//public class DataSourceConfig {
//
//    /**
//     * 创建test1的DataSource实例
//     * @return
//     */
//    @Primary //配置一个主连接
//    @Bean(name = "test1DataSource")
//    @Qualifier("test1DataSource")
//    @ConfigurationProperties(prefix="spring.datasource.dw.druid")
//    public DataSource test1DataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    /**
//     * 创建test2的DataSource实例
//     * @return
//     */
//    @Bean(name = "test2DataSource")
//    @Qualifier("test2DataSource")
//    @ConfigurationProperties(prefix="spring.datasource.oradw.druid")
//    public DataSource test2aryDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//}