package com.zhoujc.servcie;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
public class UserServiceTest {
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
    user.setAlexa("qwe");
    user.setCountry("CA");

    userService.save(user);

  }

  @Test
  void testUpdate() {
    User user = new User();
    user.setId(1);
    user.setName("ssssss");
    user.setUrl("www.Good.com");
    user.setAlexa("wqe");
    user.setCountry("CS");

    userService.updateById(user);
  }

  @Test
  void testDelete() {
    userService.removeById(1);
  }

  @Test
  void testGetAll() {
    userService.list();
  }

  @Test
  void testGetPage() {
    IPage<User> page = new Page<User>(1, 5);
    userService.page(page);
//    System.out.println(page.getPages());
//    System.out.println(page.getCurrent());
//    System.out.println(page.getRecords());
//    System.out.println(page.getSize());
//    System.out.println(page.getTotal());
  }
}
