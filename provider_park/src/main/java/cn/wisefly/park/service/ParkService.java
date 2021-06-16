package cn.wisefly.park.service;

import cn.wisefly.park.entity.Park;
import java.util.List;

public interface ParkService {

  /**
   * 获取停车场所有信息
   *
   * @return
   */
  public List<Park> getAllPark();

  /**
   * 查询停车场状态
   *
   * @param state
   * @return
   */
  public int getParkingState(Integer state);

  /**
   * 根据停车位查询停车费用
   *
   * @param cid
   * @return
   */
  public Park getParkByCid(Integer cid);

  /**
   * 根据主键id修改停车场状态
   *
   * @param state
   * @param cid
   */
  public void updateStateByCid(Integer state, Integer cid);

  /**
   * 新增停车位信息
   *
   * @param park
   * @return
   */
  public void insertPark(Park park);

  /**
   * 修改停车位信息
   */
  public void updateParkByCid(Park park);

  /**
   * 根据cid删除车位信息
   *
   * @param cid
   */
  public void deleteParkByCid(Integer cid);
}
