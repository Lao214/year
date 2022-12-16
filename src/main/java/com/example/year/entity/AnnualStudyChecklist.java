package com.example.year.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 年度学习清单
 * </p>
 *
 * @author 劳威锟
 * @since 2022-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("Annual_Study_Checklist")
@ApiModel(value="AnnualStudyChecklist对象", description="年度学习清单")
public class AnnualStudyChecklist implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "工号")
      @TableId(value = "username", type = IdType.ID_WORKER)
    private String username;

    @ApiModelProperty(value = "2022年度累计学习时间（小时)")
    private Integer playtime;

    @ApiModelProperty(value = "累计学习时间排名")
    private Integer rank1;

    @ApiModelProperty(value = "累计学习时间超越百分比")
    private BigDecimal rate1;

    @ApiModelProperty(value = "习惯学习方式")
    private String device;

    @ApiModelProperty(value = "学习课程最多的月份")
    private Integer mon;

    @ApiModelProperty(value = "该月份学习的课程数")
    private Integer coursenumMon;

    @ApiModelProperty(value = "该月份学习的课程数排名")
    private Integer sortId2;

    @ApiModelProperty(value = "该月份人数")
    private Integer monstPernum;

    @ApiModelProperty(value = "该月份学习的课程数超越百分比")
    private BigDecimal rate2;

    @ApiModelProperty(value = "学习课程数最多的时间段（几点）")
    private Integer time;

    @ApiModelProperty(value = "该时间段学习课程数")
    private Integer coursenumTime;

    @ApiModelProperty(value = "该时间段学习的课程数")
    private Integer sortId3;

    @ApiModelProperty(value = "该时间段人数")
    private Integer timestPernum;

    @ApiModelProperty(value = "该时间段学习的课程数超越百分比")
    private BigDecimal rate3;

    @ApiModelProperty(value = "入职日期")
    private Date hdate;

    @ApiModelProperty(value = "工龄（年）")
    private Integer hyear;

    @ApiModelProperty(value = "在职天数（天）")
    private Integer hday;

    @ApiModelProperty(value = "年度累计学习天数")
    private Integer studate;

    @ApiModelProperty(value = "累计学习课程数")
    private Integer coursenum;

    @ApiModelProperty(value = "累计学习课件数")
    private Integer warenum;

    @ApiModelProperty(value = "累计考试时长")
    private Integer timeinterval;

    @ApiModelProperty(value = "累计考试次数")
    private Integer examcount;

    @ApiModelProperty(value = "累积考试次数最多的月份")
    private Integer monE;

    @ApiModelProperty(value = "该月累积考试次数")
    private Integer examTimes;

    @ApiModelProperty(value = "该月考试次数排名")
    private Integer sortId4;

    @ApiModelProperty(value = "该月人数")
    private Integer timesMax;

    @ApiModelProperty(value = "该月考试次数超越百分比")
    private BigDecimal rate4;

    @ApiModelProperty(value = "累计学分")
    @TableField("CreditValue")
    private Integer creditvalue;

    @ApiModelProperty(value = "一次通过考试的课程数")
    private Integer coursenumF;

    @ApiModelProperty(value = "一次通过考试的课程数排名")
    private Integer rank5;

    @ApiModelProperty(value = "一次通过考试的课程数超越百分比")
    private BigDecimal rate5;


}
