package co.zhoujc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author 25975
 */

@SpringBootApplication
/**
 * 这个是Spring默认得缓存方案Simple(默认)
 * 开启缓存功能
 */
@EnableCaching
public class SpringbootTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootTestApplication.class, args);
  }

}
