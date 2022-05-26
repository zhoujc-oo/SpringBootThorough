package com.zhoujc.springbootjunit.dao.impl;

import com.zhoujc.springbootjunit.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Repository
public class BookDaoImpl implements BookDao {
  @Override
  public void save(){
    System.out.println("实现了save方法。。。");
  }
}
