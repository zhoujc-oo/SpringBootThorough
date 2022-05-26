package com.zhoujc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhoujc.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 设置接口并继承BaseMapper获得CRUD功能
 *
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
