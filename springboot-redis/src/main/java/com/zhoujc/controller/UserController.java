package com.zhoujc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhoujc.domain.User;
import com.zhoujc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CSDN实现
 * @Author zhoujc
 * @Date 2022/2/26
 */
@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> getAll() {
    return userService.list();
  }

  @PostMapping
  public Boolean save(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @PutMapping
  public Boolean modify(@RequestBody User user) {
    return userService.modify(user);
  }

  @DeleteMapping("/{id}")
  public Boolean delete(@PathVariable Integer id) {
    return userService.delete(id);
  }

  @GetMapping("/{id}")
  public User getById(@PathVariable Integer id) {
    return userService.getById(id);
  }

  @GetMapping("{currentPage}/{PageSize}")
  public IPage<User> getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
    return userService.getPage(currentPage, pageSize);
  }
}
