package cn.wisefly.user.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("车辆出站实体")
public class UserEnterVo implements Serializable {

  @ApiModelProperty(value = "用户车牌号")
  private String uname;

  @ApiModelProperty(value = "停车位")
  private String parkingSpace;

  @ApiModelProperty(value = "进入时间")
  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
  private Date enterTime;


}
