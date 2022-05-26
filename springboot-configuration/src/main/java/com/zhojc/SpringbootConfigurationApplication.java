package com.zhojc;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhojc.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootConfigurationApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringbootConfigurationApplication.class, args);

  }

}
