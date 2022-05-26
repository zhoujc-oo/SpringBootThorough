package com.zhoujc.dao;

import com.zhoujc.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Mapper
public interface UserDao{
  @Select("select * from user where id = #{id}")
  public User getById(Integer id);
}
