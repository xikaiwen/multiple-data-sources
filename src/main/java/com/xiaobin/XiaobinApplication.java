package com.xiaobin;

import com.xiaobin.config.DynamicDataSourceConfig;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(
		exclude= {
				DataSourceAutoConfiguration.class,
				MybatisAutoConfiguration.class},
		scanBasePackages = "com.xiaobin")
//@MapperScan(basePackages = "com.xiaobin.web.dao")//jar包要用tk的
@Import({DynamicDataSourceConfig.class})
public class XiaobinApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaobinApplication.class, args);
	}

}
