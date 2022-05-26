package co.zhoujc.service;

import co.zhoujc.domain.User;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 添加页面CRUD功能
 * @Author zhoujc
 * @Date 2022/2/26
 */
public interface UserService extends IService<User> {

  /**
   * 搜索全部接口
   * @param user
   * @return
   */
  boolean saveUser(User user);

  /**
   * 根据ID查询接口
   * @param id
   * @return
   */
   User getById(Integer id);

  /**
   *根据ID更新接口
    * @param user
   * @return
   */
  boolean modify(User user);

  /**
   * 删除接口
   * @param id
   * @return
   */
  boolean delete(Integer id);

  /**
   * 指定范围查询
   * @param currentPage
   * @param pageSize
   * @return
   */
  IPage<User> getPage(int currentPage, int pageSize);

  IPage<User> getPage(int currentPage, int pageSize,User user);
}

