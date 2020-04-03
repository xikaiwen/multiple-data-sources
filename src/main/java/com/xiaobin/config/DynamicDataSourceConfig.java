package com.xiaobin.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin
 * @since 2020/4/2 11:56 AM
 */
@Configuration
@Component
public class DynamicDataSourceConfig {
    @Bean
    @ConfigurationProperties("spring.datasource.druid.data-master")
    public DataSource xiaobinMasterDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.data-slave")
    public DataSource  xiaobinSlaveDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public DynamicDataSource dataSource(DataSource xiaobinMasterDataSource, DataSource xiaobinSlaveDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("data-master", xiaobinMasterDataSource);
        targetDataSources.put("data-slave", xiaobinSlaveDataSource);
        return new DynamicDataSource(xiaobinMasterDataSource, targetDataSources);
    }
}
