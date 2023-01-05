package com.example.year.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 阳光培训专区
 * </p>
 *
 * @author 劳威锟
 * @since 2023-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Sunshine对象", description="阳光培训专区")
public class Sunshine implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "工号")
      @TableId(value = "jobno", type = IdType.ID_WORKER)
    private String jobno;

    @ApiModelProperty(value = "姓名")
    @TableField("StuName")
    private String stuname;

    @ApiModelProperty(value = "累计学习时数（小时）")
    private Integer playtime;

    @ApiModelProperty(value = "习惯学习方式")
    private String device;

    @ApiModelProperty(value = "学习课程最多月份")
    private Integer mon;

    @ApiModelProperty(value = "该个月份学习课程数")
    private Integer coursenumMon;

    @ApiModelProperty(value = "学习课程最多的时段")
    private Integer time;

    @ApiModelProperty(value = "该时段学习课程数")
    private Integer coursenumTime;

    @ApiModelProperty(value = "累计学习天数")
    private Integer studate;

    @ApiModelProperty(value = "超越百分比")
    private BigDecimal rate1;

    @ApiModelProperty(value = "累计学习课程数")
    private Integer coursenum;

    @ApiModelProperty(value = "参加专题学习数")
    private Integer projectnum;

    @ApiModelProperty(value = "获得学分")
    @TableField("CreditValue")
    private Integer creditvalue;

    @ApiModelProperty(value = "累计考试次数")
    private Integer examcount;

    @ApiModelProperty(value = "累计考试通过次数")
    private Integer examcountf;

    @ApiModelProperty(value = "考试通过率")
    private BigDecimal passR;

    @ApiModelProperty(value = "获得学习之星次数")
    private Integer star;


}
