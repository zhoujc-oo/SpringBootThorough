package com.zhoujc.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhoujc.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@SpringBootTest
public class UserDaoTestCase {

  @Autowired
  private UserDao userDao;

  @Test
  void testGetById() {
    System.out.println(userDao.selectById(1));
  }

  @Test
  void testSave() {
    User user = new User();
    user.setName("ss");
    user.setUrl("www.zhoujc.com");
    user.setAlexa("sd");
    user.setCountry("CA");

    userDao.insert(user);

  }

  @Test
  void testUpdate() {
    User user = new User();
    user.setId(7);
    user.setName("ssssss");
    user.setUrl("www.Good.com");
    user.setAlexa("ds");
    user.setCountry("CS");

    userDao.updateById(user);
  }

  @Test
  void testDelete(){
    userDao.deleteById(8);
  }

  @Test
  void testGetAll(){
    System.out.println(userDao.selectList(null));
  }

  @Test
  void testGetPage(){
    IPage page = new Page(1,3);
    userDao.selectPage(page,null);
    System.out.println(page.getPages());
    System.out.println(page.getCurrent());
    System.out.println(page.getRecords());
    System.out.println(page.getSize());
    System.out.println(page.getTotal());
  }

  @Test
  void GetBy(){
    QueryWrapper<User> res = new QueryWrapper<User>();
    res.like("name","s");
    userDao.selectList(res);
  }

  //建议使用LambdaQueryWrapper查询
  @Test
  void GetBy2(){
    String alexa = "1";
    LambdaQueryWrapper<User> len = new LambdaQueryWrapper<User>();
    len.like(true,User::getAlexa,alexa);
    userDao.selectList(len);
  }
}
