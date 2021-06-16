package cn.wisefly.user.service.impl;

import cn.wisefly.user.entity.User;
import cn.wisefly.user.mapper.UserMapper;
import cn.wisefly.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;


  @Override
  public User findUserById(Integer uid) {
    return userMapper.selectByPrimaryKey(uid);
  }

  @Override
  public Integer sumSpent() {
    return userMapper.selectAllSpent();
  }


}
