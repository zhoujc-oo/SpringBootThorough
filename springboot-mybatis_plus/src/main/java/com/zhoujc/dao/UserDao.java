package com.zhoujc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhoujc.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
