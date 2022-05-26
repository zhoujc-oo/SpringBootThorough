package com.zhojc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */

@Configuration
public class MsgConfig {

  @Bean
  public String msg(){
    return "bean msg";
  }
}
