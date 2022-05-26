package com.zhoujc.controller.utils;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Data
public class Res {
  private Boolean flag;
  private Object data;
  private String msg;

  public Res() {
  }

  public Res(Boolean flag) {
    this.flag = flag;
  }

  public Res(Boolean flag, Object data) {
    this.flag = flag;
    this.data = data;
  }

  public Res(Boolean flag, String msg){
    this.flag = flag;
    this.msg = msg;
  }

  public Res(String msg) {
    this.flag = false;
    this.msg = msg;
  }
}
