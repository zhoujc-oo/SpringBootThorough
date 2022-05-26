package com.zhojc;

import com.sun.xml.internal.ws.api.message.Header;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class Config2 {
  @Test
  void testRandomPort() {
  }

  @Test
  void testWeb(@Autowired MockMvc mvc) throws Exception {
    MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users");
    ResultActions action = mvc.perform(builder);
    //设定预期值与真实值进行比较,成功测试通过,失败测试失败
    //定义本次调用的预期值
    StatusResultMatchers status = MockMvcResultMatchers.status();
    ResultMatcher ok = status.isOk();
    //添加预期值到本次调用过程中进行匹配
    action.andExpect(ok);
  }

  @Test
  void testBody(@Autowired MockMvc mvc) throws Exception {
    MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users");
    ResultActions action = mvc.perform(builder);
    //设定预期值与真实值进行比较,成功测试通过,失败测试失败
    //定义本次调用的预期值
    ContentResultMatchers content = MockMvcResultMatchers.content();
    ResultMatcher ok = content.string("getById is running..");
    //添加预期值到本次调用过程中进行匹配
    action.andExpect(ok);
  }

  @Test
  void testJson(@Autowired MockMvc mvc) throws Exception {
    MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users");
    ResultActions action = mvc.perform(builder);

    //设定预期值与真实值进行比较,成功测试通过,失败测试失败
    //定义本次调用的预期值
    ContentResultMatchers content = MockMvcResultMatchers.content();
    ResultMatcher ok = content.json("{\"id\":1,\"name\":\"zhoujc2\",\"type\":\"ss\",\"description\":\"jjj\"}");
    //添加预期值到本次调用过程中进行匹配
    action.andExpect(ok);
  }

  @Test
  void testContentType(@Autowired MockMvc mvc) throws Exception {
    MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users");
    ResultActions action = mvc.perform(builder);

    //设定预期值与真实值进行比较,成功测试通过,失败测试失败
    //定义本次调用的预期值
    HeaderResultMatchers header = MockMvcResultMatchers.header();
    ResultMatcher contentType = header.string("Content-Type", "application/json");
    //添加预期值到本次调用过程中进行匹配
    action.andExpect(contentType);
  }

  @Test
  void getById(@Autowired MockMvc mvc) throws Exception{
    MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users");
    ResultActions action = mvc.perform(builder);

    StatusResultMatchers status = MockMvcResultMatchers.status();
    ResultMatcher ok = status.isOk();
    //添加预期值到本次调用过程中进行匹配
    action.andExpect(ok);

    HeaderResultMatchers header = MockMvcResultMatchers.header();
    ResultMatcher contentType = header.string("Content-Type", "application/json");
    //添加预期值到本次调用过程中进行匹配
    action.andExpect(contentType);

    ContentResultMatchers content = MockMvcResultMatchers.content();
    ResultMatcher result = content.json("{\"id\":1,\"name\":\"zhoujc\",\"type\":\"ss\",\"description\":\"jjj\"}");
    //添加预期值到本次调用过程中进行匹配
    action.andExpect(result);

  }
}
