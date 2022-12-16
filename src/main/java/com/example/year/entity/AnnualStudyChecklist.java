package com.example.year.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
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

public class AnnualStudyChecklist implements Serializable {

    private static final long serialVersionUID = 1L;


      @TableId(value = "username", type = IdType.ID_WORKER)
    private String username;


    private Integer playtime;


    private Integer rank1;


    private BigDecimal rate1;


    private String device;


    private Integer mon;


    private Integer coursenumMon;


    private Integer sortId2;


    private Integer monstPernum;


    private BigDecimal rate2;


    private Integer time;


    private Integer coursenumTime;


    private Integer sortId3;


    private Integer timestPernum;


    private BigDecimal rate3;


    private Date hdate;


    private Integer hyear;


    private Integer hday;


    private Integer studate;


    private Integer coursenum;


    private Integer warenum;


    private Integer timeinterval;


    private Integer examcount;


    private Integer monE;


    private Integer examTimes;


    private Integer sortId4;


    private Integer timesMax;


    private BigDecimal rate4;


    @TableField("CreditValue")
    private Integer creditvalue;


    private Integer coursenumF;


    private Integer rank5;


    private BigDecimal rate5;


}
