package com.zhoujc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
@Component
public class SSMPApplication {

  public static void main(String[] args) {
    System.setProperty("spring,devtools.restart.enabled","false");
    SpringApplication.run(SSMPApplication.class);
  }
}
