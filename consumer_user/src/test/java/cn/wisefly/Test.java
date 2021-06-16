package cn.wisefly;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import java.text.ParseException;
import java.util.Date;

public class Test {

  public static void main(String[] args) throws ParseException {

    //定义变量记录时间差
    String time = "";
    Date in = DateUtil.parse("2020-12-14 16:18:16");
    Date out = DateUtil.parse("2020-12-14 15:20:17");
//获取不同单位下的时间差
    Long day = DateUtil.between(in, out, DateUnit.DAY);
    Long hour = cn.hutool.core.date.DateUtil.between(in, out, DateUnit.HOUR) - day * 24;
    Long minute = cn.hutool.core.date.DateUtil.between(in, out, DateUnit.MINUTE) - day * 24 * 60;
//拼接成完整时间差
    time = day + "d" + hour + "h" + minute;

    System.out.println(time);

  }
}
