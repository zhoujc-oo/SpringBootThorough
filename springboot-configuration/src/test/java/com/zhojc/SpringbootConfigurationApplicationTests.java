package com.zhojc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

//properties属性可以为当前属性用例添加临时的属性配置
//@SpringBootTest(properties = {"test.port = length1"})
//args属性可以为当前属性用例添加临时的命令行参数
//@SpringBootTest(args = {"--test.port = length2"})
@SpringBootTest(properties = {"test.port = length1"},args = {"--test.port = length2"})
class SpringbootConfigurationApplicationTests {

  @Value("${test.port}")
  private String mag;
  @Test
  void contextLoads() {
    System.out.println(mag);
  }

}
