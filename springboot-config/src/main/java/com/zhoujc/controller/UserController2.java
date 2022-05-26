package com.zhoujc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhoujc.controller.utils.Res;
import com.zhoujc.domain.User;
import com.zhoujc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.io.IOException;

/**
 * CSDN实现
 *
 * @Author zhoujc
 * @Date 2022/2/26
 */
@RestController
@RequestMapping("/users")
public class UserController2 {

  @Autowired
  private UserService userService;

  @GetMapping
  public Res getAll() {
    return new Res(true, userService.list());
  }

  @PostMapping
  public Res save(@RequestBody User user) throws IOException {
    if (user.getName().equals("123")) {
      throw new IOException();
    }
    boolean flag = userService.save(user);
    return new Res(flag, flag ? "添加成功^_^" : "添加失败-_-!");
  }

  @PutMapping
  public Res update(@RequestBody User user) {
    return new Res(userService.modify(user));
  }

  @DeleteMapping("/{id}")
  public Res delete(@PathVariable Integer id) {
    return new Res(userService.delete(id));
  }

  @GetMapping("/{id}")
  public Res getById(@PathVariable Integer id) {
    System.out.println("热部署。。。");
    System.out.println("热部署。。。");
    System.out.println("热部署。。。");
    return new Res(true, userService.getById(id));
  }

  @GetMapping("{currentPage}/{pageSize}")
  public Res getAll(@PathVariable int currentPage,@PathVariable int pageSize,User user){
    IPage<User> pageUser = userService.getPage(currentPage,pageSize,user);
    return new Res(null != pageUser,pageUser);
  }
}
