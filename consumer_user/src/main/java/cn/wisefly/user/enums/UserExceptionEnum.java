package cn.wisefly.user.enums;

public enum UserExceptionEnum {

  Parking_space_does_not_exist(1, "停车位不存在"),
  Parking_space_occupied(2, "停车位被占用"),
  Car_exist(3, "车辆已存在"),
  Car_does_not_exist(4, "车辆不存在"),
  Order_completed(5, "订单已完成");

  private UserExceptionEnum(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  private Integer code;
  private String message;

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
