package cn.wisefly.user.mapper;

import cn.wisefly.user.entity.Park;
import cn.wisefly.user.entity.ParkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkMapper {

  long countByExample(ParkExample example);

  int deleteByExample(ParkExample example);

  int deleteByPrimaryKey(Integer cid);

  int insert(Park record);

  int insertSelective(Park record);

  List<Park> selectByExample(ParkExample example);

  Park selectByPrimaryKey(Integer cid);

  int updateByExampleSelective(@Param("record") Park record, @Param("example") ParkExample example);

  int updateByExample(@Param("record") Park record, @Param("example") ParkExample example);

  int updateByPrimaryKeySelective(Park record);

  int updateByPrimaryKey(Park record);

  /**
   * 根据停车位查询停车位状态
   *
   * @param parkingSpace
   * @return
   */
  int selectStateBySpace(String parkingSpace);

  /**
   * 根据停车位置修改停车状态
   *
   * @param state
   * @param parkingSpace
   */
  void updateStateBySpace(Integer state, String parkingSpace);

}