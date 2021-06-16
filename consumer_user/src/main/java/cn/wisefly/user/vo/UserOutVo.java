package cn.wisefly.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("车辆进站实体")
public class UserOutVo implements Serializable {

  @ApiModelProperty(value = "用户车牌号")
  private String uname;

  @ApiModelProperty(value = "停车位")
  private String parkingSpace;


}

