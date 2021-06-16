package cn.wisefly.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

@ApiModel("停车场实体类1")
public class Park implements Serializable {

  @ApiModelProperty(value = "主键")
  private Integer cid;

  @ApiModelProperty(value = "停车位")
  private String parkingSpace;

  @ApiModelProperty(value = "停车费金额")
  private Integer parkingCost;

  @ApiModelProperty(value = "停车位状态，1为有车，0为没车")
  private Integer parkingState;

  private static final long serialVersionUID = 1L;

  public Integer getCid() {
    return cid;
  }

  public void setCid(Integer cid) {
    this.cid = cid;
  }

  public String getParkingSpace() {
    return parkingSpace;
  }

  public void setParkingSpace(String parkingSpace) {
    this.parkingSpace = parkingSpace == null ? null : parkingSpace.trim();
  }

  public Integer getParkingCost() {
    return parkingCost;
  }

  public void setParkingCost(Integer parkingCost) {
    this.parkingCost = parkingCost;
  }

  public Integer getParkingState() {
    return parkingState;
  }

  public void setParkingState(Integer parkingState) {
    this.parkingState = parkingState;
  }
}