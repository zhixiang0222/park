package cn.wisefly.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

@ApiModel("用户实体")
public class User implements Serializable {

  @ApiModelProperty(value = "主键")
  private Integer uid;

  @ApiModelProperty(value = "用户车牌号")
  private String uname;

  @ApiModelProperty(value = "停车位")
  private String parkingSpace;

  @ApiModelProperty(value = "进入时间")
  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
  private Date enterTime;

  @ApiModelProperty(value = "离开时间")
  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
  private Date outTime;

  @ApiModelProperty(value = "花费多少钱")
  private Integer spent;

  @ApiModelProperty(value = "停车状态，0为已完成，1为未完成")
  private Integer state;

  private static final long serialVersionUID = 1L;

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname == null ? null : uname.trim();
  }

  public String getParkingSpace() {
    return parkingSpace;
  }

  public void setParkingSpace(String parkingSpace) {
    this.parkingSpace = parkingSpace == null ? null : parkingSpace.trim();
  }

  public Date getEnterTime() {
    return enterTime;
  }

  public void setEnterTime(Date enterTime) {
    this.enterTime = enterTime;
  }

  public Date getOutTime() {
    return outTime;
  }

  public void setOutTime(Date outTime) {
    this.outTime = outTime;
  }

  public Integer getSpent() {
    return spent;
  }

  public void setSpent(Integer spent) {
    this.spent = spent;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }
}