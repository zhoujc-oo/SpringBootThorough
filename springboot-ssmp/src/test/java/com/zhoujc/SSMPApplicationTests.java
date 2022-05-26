package com.zhoujc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Book;

@SpringBootTest
class SSMPApplicationTests {

  @Autowired
  private Book book;
  @Test
  void contextLoads() {
    System.out.println(book);
  }

}
