package com.zhoujc.servcie;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhoujc.domain.User;
import com.zhoujc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@SpringBootTest
public class UserServiceTestCase {

  @Autowired
  private UserService userService;

  @Test
  void testGetById() {
    System.out.println(userService.getById(2));
  }

  @Test
  void testSave() {
    User user = new User();
    user.setName("ss");
    user.setUrl("www.zhoujc.com");
    user.setAlexa("sd");
    user.setCountry("CA");

    userService.save(user);

  }

//  @Test
//  void testUpdate() {
//    User user = new User();
//    user.setId(1);
//    user.setName("ssssss");
//    user.setUrl("www.Good.com");
//    user.setAlexa("sad");
//    user.setCountry("CS");
//
//    userService.update(user);
//  }
//
//  @Test
//  void testDelete() {
//    userService.delete(12);
//  }
//
//  @Test
//  void testGetAll() {
//    System.out.println(userService.getAll());
//  }

  @Test
  void testGetPage() {
    IPage<User> page = userService.getPage(2, 5);
    System.out.println(page.getPages());
    System.out.println(page.getCurrent());
    System.out.println(page.getRecords());
    System.out.println(page.getSize());
    System.out.println(page.getTotal());
  }
}
