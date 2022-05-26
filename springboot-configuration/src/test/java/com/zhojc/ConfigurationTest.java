package com.zhojc;

import com.zhojc.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@SpringBootTest
@Import(MsgConfig.class)
public class ConfigurationTest {

  @Autowired
  private String msg;

  @Test
  void testConfiguration(){
    System.out.println(msg);
  }
}
