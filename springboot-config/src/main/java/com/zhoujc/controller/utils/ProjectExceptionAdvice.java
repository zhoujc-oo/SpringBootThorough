package com.zhoujc.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * springmvc的异常处理器
 *
 * @Author zhoujc
 * @Date 2022/2/26
 */
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {
  /**
   * 拦截所有异常信息
   */
  @ExceptionHandler(Exception.class)
  public Res doException(Exception ex) {
    ex.printStackTrace();
    return new Res("服务器故障，请稍后在试");
  }
}
