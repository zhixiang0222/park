package cn.wisefly.user.controller;

import cn.wisefly.user.entity.User;
import cn.wisefly.user.service.StopCarService;
import cn.wisefly.user.service.UserService;
import cn.wisefly.user.utils.AppResponse;
import cn.wisefly.user.vo.UserEnterVo;
import cn.wisefly.user.vo.UserOutVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
@Api(tags = "用户停车")
public class UserController {

  @Autowired
  private UserService userService;

  @Autowired
  public StopCarService stopCarService;

  private RestTemplate restTemplate;

  @GetMapping("/findUserById/{uid}")
  @ApiOperation("根据id查询停车人")
  public User findUserById(@PathVariable("uid") Integer uid) {
    return userService.findUserById(uid);
  }

  @ApiOperation("车辆进站")
  @PostMapping("/enterCar/")
  public AppResponse<String> enterCar(@RequestBody UserEnterVo userEnterVo) {
    //1.赋值操作，vo-->entity
    User user = new User();
    BeanUtils.copyProperties(userEnterVo, user);
    //1、保存停车信息
    stopCarService.enterCar(user);
    return AppResponse.ok("欢迎进入停车库");
  }

  @ApiOperation("车辆出站")
  @PutMapping("/outCar/")
  public Integer outCar(@RequestBody UserOutVo userOutVo) {
    User user = new User();
    BeanUtils.copyProperties(userOutVo, user);
    return stopCarService.outCar(user);
  }


  @GetMapping("/findUserById/")
  @ApiOperation("查询所有消费总和")
  public Integer sumSpent() {
    return userService.sumSpent();
  }

/*  @GetMapping("/getParkingByState/{state}")
  @ApiOperation("查询剩余停车位")
  public String getParkingByState(@PathVariable("state") Integer state) {
    Park a = restTemplate.getForObject("http://localhost:8001/park/getParkingState/" + state, Park.class);
    return "停车库剩余车位" + a;
  }*/


}
