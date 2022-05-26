package com.zhoujc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * @author 25975
 */
@SpringBootApplication
@Component
public class RedisApplication {

  public static void main(String[] args) {
    SpringApplication.run(RedisApplication.class);
  }
}
