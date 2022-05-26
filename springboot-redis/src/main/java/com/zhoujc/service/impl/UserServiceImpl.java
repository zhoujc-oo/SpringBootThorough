package com.zhoujc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhoujc.dao.UserDao;
import com.zhoujc.domain.User;
import com.zhoujc.service.UserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

  /**
   * 使用UserDao的Bean
   */
  @Autowired
  private UserDao userDao;

  @Override
  public boolean saveUser(User user) {
    return userDao.insert(user) > 0;
  }

  @Override
  public boolean modify(User user) {
    return userDao.updateById(user) > 0;
  }

  @Override
  public boolean delete(Integer id) {
    return userDao.deleteById(id) > 0;
  }

  @Override
  public IPage<User> getPage(int currentPage, int pageSize) {
    IPage page = new Page(currentPage, pageSize);
    userDao.selectPage(page, null);
    return page;
  }

  @Override
  public IPage<User> getPage(int currentPage, int pageSize, User user) {
    LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
    lqw.like(Strings.isNotEmpty(user.getName()),User :: getName,user.getName());
    lqw.like(Strings.isNotEmpty(user.getUrl()),User :: getUrl,user.getUrl());
    lqw.like(Strings.isNotEmpty(user.getAlexa()),User :: getAlexa,user.getAlexa());
    IPage page = new Page(currentPage,pageSize);
    userDao.selectPage(page,lqw);
    return page;
  }
}
