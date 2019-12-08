/*
package com.ruijie.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig3 {

    @Autowired
    private JdbcProperties prop;

    public JdbcConfig3(JdbcProperties prop) {
        this.prop = prop;
    }

    @Bean
    public DataSource dataSource(JdbcProperties prop) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(prop.getDriverClassName());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUsername());
        dataSource.setPassword(prop.getPassword());
        return dataSource;
    }
}
*/
