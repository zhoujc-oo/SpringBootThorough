package com.zhoujc;

import com.zhoujc.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {

  @Autowired
  public UserDao userDao;

  @Test
  void contextLoads() {
    System.out.println(userDao.selectById(2));
  }

  @Test
  void testGetAll(){
    System.out.println(userDao.selectList(null));
  }
}
