package cn.wisefly.user.mapper;

import cn.wisefly.user.entity.User;
import cn.wisefly.user.entity.UserExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

  long countByExample(UserExample example);

  int deleteByExample(UserExample example);

  int deleteByPrimaryKey(Integer uid);

  int insert(User record);

  int insertSelective(User record);

  List<User> selectByExample(UserExample example);

  User selectByPrimaryKey(Integer uid);

  int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

  int updateByExample(@Param("record") User record, @Param("example") UserExample example);

  int updateByPrimaryKeySelective(User record);

  int updateByPrimaryKey(User record);

  /**
   * 根据用户车牌号查询停车信息状态
   *
   * @param uname
   * @return
   */
  List<Integer> selectStateByUname(String uname);

  /**
   * 根据用户信息查询停车状态
   *
   * @param uname
   * @param parkingSpace
   * @return
   */
  Date selectEnterTimeByUser(String uname, String parkingSpace);

  /**
   * 查询全部消费总和
   *
   * @return
   */
  int selectAllSpent();


}