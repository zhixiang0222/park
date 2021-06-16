package cn.wisefly.park.mapper;


import cn.wisefly.park.entity.Park;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ParkMapper {

  List<Park> selectAll();

  int selectParkingState(Integer state);

  Park getParkByCid(Integer cid);

  void updateStateByCid(Integer state, Integer cid);

  void insertPark(Park park);

  void updateParkByCid(Park park);

  void deleteParkByCid(Integer cid);
}