package cn.wisefly.park.service.impl;

import cn.wisefly.park.entity.Park;
import cn.wisefly.park.mapper.ParkMapper;
import cn.wisefly.park.service.ParkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkServiceImpl implements ParkService {

  @Autowired
  private ParkMapper parkMapper;


  @Override
  public List<Park> getAllPark() {
    return parkMapper.selectAll();
  }

  @Override
  public int getParkingState(Integer state) {
    return parkMapper.selectParkingState(state);
  }

  @Override
  public Park getParkByCid(Integer cid) {
    return parkMapper.getParkByCid(cid);
  }

  @Override
  public void updateStateByCid(Integer state, Integer cid) {
    parkMapper.updateStateByCid(state, cid);
  }

  @Override
  public void insertPark(Park park) {
    parkMapper.insertPark(park);
  }

  @Override
  public void updateParkByCid(Park park) {
    parkMapper.updateParkByCid(park);
  }

  @Override
  public void deleteParkByCid(Integer cid) {
    parkMapper.deleteParkByCid(cid);
  }
}
