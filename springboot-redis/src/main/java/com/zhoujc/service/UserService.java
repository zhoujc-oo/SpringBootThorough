package com.zhoujc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoujc.domain.User;

/**
 * 添加页面CRUD功能
 * @Author zhoujc
 * @Date 2022/2/26
 */
public interface UserService extends IService<User> {
  /**
   * 搜索
   * @param user
   * @return
   */
  boolean saveUser(User user);

  /**
   * 修改
   * @param user
   * @return
   */
  boolean modify(User user);

  /**
   * 删除
   * @param id
   * @return
   */
  boolean delete(Integer id);

  /**
   * 分页查询
   * @param currentPage
   * @param pageSize
   * @return
   */
  IPage<User> getPage(int currentPage, int pageSize);

  /**
   * 查询操作
   * @param currentPage
   * @param pageSize
   * @param user
   * @return
   */
  IPage<User> getPage(int currentPage, int pageSize,User user);
}
