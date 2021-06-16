package cn.wisefly.user.service;

import cn.wisefly.user.entity.User;

public interface StopCarService {

  /**
   * 车辆进站选择停车位
   *
   * @param user
   * @return
   */
  public void enterCar(User user);

  /**
   * 写入出站信息并返回花费金额
   *
   * @param user
   * @return
   */
  public Integer outCar(User user);


}
