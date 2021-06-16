package cn.wisefly.user.service.impl;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.wisefly.user.entity.ParkExample;
import cn.wisefly.user.entity.User;
import cn.wisefly.user.entity.UserExample;
import cn.wisefly.user.enums.UserExceptionEnum;
import cn.wisefly.user.exception.UserException;
import cn.wisefly.user.mapper.ParkMapper;
import cn.wisefly.user.mapper.UserMapper;
import cn.wisefly.user.service.StopCarService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StopCarServiceImpl implements StopCarService {

  @Autowired
  private ParkMapper parkMapper;

  @Autowired
  private UserMapper userMapper;


  @Override
  public void enterCar(User user) {
    //1.判断停车位是否存在
    String parkingSpace = user.getParkingSpace();
    ParkExample parkExample = new ParkExample();
    ParkExample.Criteria criteria = parkExample.createCriteria();
    criteria.andParkingSpaceEqualTo(parkingSpace);
    Long count = parkMapper.countByExample(parkExample);
    if (count <= 0) {
      //如果没有找到则抛出异常
      throw new UserException(UserExceptionEnum.Parking_space_does_not_exist);
    }
    //2.根据输入的停车场位置查询停车位状态
    int stateValue = parkMapper.selectStateBySpace(parkingSpace);
    if (stateValue != 0) {
      //如果状态不为0，则抛出异常
      throw new UserException(UserExceptionEnum.Parking_space_occupied);
    }
    //3.判断车库是否有相同车名的车辆
    String uname = user.getUname();
    UserExample userExample = new UserExample();
    UserExample.Criteria criteria1 = userExample.createCriteria();
    criteria1.andUnameEqualTo(uname);
    Long count1 = userMapper.countByExample(userExample);
    if (count1 > 0) {
      //3.1如果查询到有多条相同车牌号的语句，则查询state的状态
      List<Integer> stateList = userMapper.selectStateByUname(uname);
      //3.2返回list集合，遍历集合
      for (int i : stateList) {
        if (i != 0) {
          //3.3如果state状态在集合中有1,抛出异常
          throw new UserException(UserExceptionEnum.Car_exist);
        }
      }
    }
    //3.4设置用户停车状态
    Integer state = 1;
    user.setState(state);
    //4.将停车信息写入用户表中 保存已有的字段
    userMapper.insertSelective(user);
    //5.修改停车位状态
    parkMapper.updateStateBySpace(state, parkingSpace);
  }

  @Override
  public Integer outCar(User user) {
    //1、根据输入的汽车名查找出车辆进站信息
    String uname = user.getUname();
    String parkingSpace = user.getParkingSpace();
    //初始化spent的值
    Integer spent = 0;
    UserExample userExample = new UserExample();
    UserExample.Criteria criteria = userExample.createCriteria();
    criteria.andUnameEqualTo(uname);

    Long count = userMapper.countByExample(userExample);
    //判断是否存在该订单
    if (count == 0) {
      throw new UserException(UserExceptionEnum.Car_does_not_exist);
    }

    //判断订单状态是否有未完成的
    List<Integer> stateList = userMapper.selectStateByUname(uname);
    //返回list集合，遍历集合  1为未完成，0为完成
    for (int i : stateList) {
      if (i == 1) {
        String packingSpace = user.getParkingSpace();
        //获取当前时间做为出站时间
        Date outTime = new Date();
        // 查询进站时间为多少少
        Date enterTime = userMapper.selectEnterTimeByUser(uname, parkingSpace);
        //根据进站时间计算花费多少钱
        Long day = DateUtil.between(enterTime, outTime, DateUnit.DAY);
        Long hour = DateUtil.between(enterTime, outTime, DateUnit.HOUR) - day * 24;
        // Long minute = DateUtil.between(enterTime, outTime, DateUnit.MINUTE) - day * 24 * 60;
        //两元一小时，超过一分钟就按一小时计算
        spent = Math.toIntExact((day * 24 + hour + 1) * 2);
        user.setSpent(spent);
        user.setOutTime(outTime);
        //修改停车位状态和订单状态
        Integer state = 0;
        user.setState(state);
        userMapper.updateByExampleSelective(user, userExample);
        parkMapper.updateStateBySpace(state, packingSpace);
      }
    }
    return spent;
  }


}
