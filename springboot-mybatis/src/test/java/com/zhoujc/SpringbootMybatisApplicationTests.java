package com.zhoujc;

import com.zhoujc.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {

  @Autowired
  private UserDao userDao;
  @Test
   void contextLoads() {
    System.out.println(userDao.getById(1));
  }

}
