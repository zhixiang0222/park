package cn.wisefly.park.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("停车场实体类")
public class Park {

  @ApiModelProperty(value = "主键")
  private Integer cid;

  @ApiModelProperty(value = "停车位")
  private String parkingSpace;

  @ApiModelProperty(value = "停车费用")
  private Integer parkingCost;

  @ApiModelProperty(value = "停车位状态")
  private Integer parkingState;


}
