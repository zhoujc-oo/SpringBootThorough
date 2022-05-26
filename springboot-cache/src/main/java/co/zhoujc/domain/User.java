package co.zhoujc.domain;


import lombok.Data;

/**
 * 添加表单属性
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Data
public class User {
  private int id;
  private String name;
  private String url;
  private String alexa;
  private String country;
}
