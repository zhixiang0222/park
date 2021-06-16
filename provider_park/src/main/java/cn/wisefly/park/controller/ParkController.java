package cn.wisefly.park.controller;

import cn.wisefly.park.entity.Park;
import cn.wisefly.park.service.ParkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/park")
@Api(tags = "停车场服务测试")
public class ParkController {

  @Autowired
  private ParkService parkService;

  @GetMapping("/getAllPark/")
  @ApiOperation("查询停车场信息")
  public List<Park> getCarName() {
    return parkService.getAllPark();
  }

  @GetMapping("/getParkingState/{state}")
  @ApiOperation("查询停车场状态，显示剩余车位")
  public int getParkingState(@PathVariable("state") Integer state) {
    return parkService.getParkingState(state);
  }


  @GetMapping("/getParkByCid/{cid}")
  @ApiOperation("根据cid查询停车位信息")
  public Park getParkByCid(@PathVariable("cid") Integer cid) {
    return parkService.getParkByCid(cid);
  }

  @PutMapping("/updateStateByCid/{cid}")
  @ApiOperation("根据cid修改停车位状态")
  public String updateStateByCid(@RequestBody Integer state, @PathVariable("cid") Integer cid) {
    try {
      parkService.updateStateByCid(state, cid);
      return "修改成功";
    } catch (Exception e) {
      e.printStackTrace();
      return "修改失败";
    }
  }

  @PostMapping("/insertPark/")
  @ApiOperation("新增停车位信息")
  public String insertPark(@RequestBody Park park) {
    try {
      parkService.insertPark(park);
      return "新增成功";
    } catch (Exception e) {
      e.printStackTrace();
      return "新增失败";
    }
  }

  @PutMapping("/updateParkByCid/")
  @ApiOperation("根据cid修改停车位信息")
  public String updateParkByCid(@RequestBody Park park) {
    try {
      parkService.updateParkByCid(park);
      return "修改成功";
    } catch (Exception e) {
      e.printStackTrace();
      return "修改失败";
    }
  }

  @DeleteMapping("/deleteParkByCid/{cid}")
  @ApiOperation("根据cid删除停车位信息")
  public String deleteParkByCid(@PathVariable("cid") Integer cid) {
    try {
      parkService.deleteParkByCid(cid);
      return "删除成功";
    } catch (Exception e) {
      e.printStackTrace();
      return "删除失败";
    }
  }
}
