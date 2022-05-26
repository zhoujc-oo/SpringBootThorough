package com.zhojc.config;

import com.zhojc.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@RestController
@RequestMapping("/users")
public class UserConfig {

//  @GetMapping
//  public String getById(){
//    System.out.println("getById is running....");
//    return "getById is running....";
//  }

  @GetMapping
  public User getById(){
    System.out.println("getById is running....");
    User user = new User();
    user.setId(1);
    user.setName("zhoujc");
    user.setType("ss");
    user.setDescription("jjj");
    return user;
  }

}
