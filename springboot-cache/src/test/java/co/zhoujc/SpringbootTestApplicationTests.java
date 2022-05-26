package co.zhoujc;

import co.zhoujc.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTestApplicationTests {

  @Autowired
  private UserDao userDao;

  @Test
  void contextLoads() {
    userDao.selectById(2);
  }
}
