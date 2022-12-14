package com.example.year.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 劳威锟
 * @since 2022-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)

public class ViewRecords implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String studyList;

    private String jobNo;

    private Date createTime;

    private String source;

    private String comment;

    private String browser;

    private String device;

    private Date updateTime;

    private Integer type;
}
