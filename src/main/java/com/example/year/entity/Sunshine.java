package com.example.year.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

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

public class Sunshine implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "jobno", type = IdType.ID_WORKER)
    private String jobno;


    @TableField("StuName")
    private String stuname;


    private Integer playtime;

    private String device;

    private Integer mon;

    private Integer coursenumMon;

    private Integer time;

    private Integer coursenumTime;

    private Integer studate;

    private BigDecimal rate1;

    private Integer coursenum;

    private Integer projectnum;

    @TableField("CreditValue")
    private Integer creditvalue;

    private Integer examcount;

    private Integer examcountf;

    private BigDecimal passR;

    private Integer star;


}
