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
    return new Res(true, userService.getById(id));
  }

//  @GetMapping("{currentPage}/{pageSize}")
//  public Res getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
//    IPage<User> page = userService.getPage(currentPage, pageSize);
//    //如果当前页码值大于总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值。
//    if(currentPage > page.getPages()){
//      page = userService.getPage((int)page.getPages(),pageSize);
//    }
//    return new Res(true, page);
//  }

  @GetMapping("{currentPage}/{pageSize}")
  public Res getAll(@PathVariable int currentPage,@PathVariable int pageSize,User user){
    IPage<User> pageUser = userService.getPage(currentPage,pageSize,user);
    return new Res(null != pageUser,pageUser);
  }
}
