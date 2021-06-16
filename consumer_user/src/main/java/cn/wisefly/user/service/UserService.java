package cn.wisefly.user.service;

import cn.wisefly.user.entity.User;


public interface UserService {

  /**
   * 根据id查询用户信息
   *
   * @param
   */
  public User findUserById(Integer uid);


  public Integer sumSpent();


}
