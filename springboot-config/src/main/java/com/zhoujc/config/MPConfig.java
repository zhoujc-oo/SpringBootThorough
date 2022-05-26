package com.zhoujc.config;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *添加拦截功能
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Configuration
public class MPConfig {
  @Bean
  public MybatisPlusInterceptor mybatisPlusInterceptor(){
    //定义mapper拦截器
    MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
    //添加具体拦截器
    interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
    return interceptor;
  }

}
