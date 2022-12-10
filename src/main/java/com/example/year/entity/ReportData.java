package com.example.year.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class ReportData implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    private String credit;


    private Long studyDuration;


    private Integer courses;


    private Integer WatchLiveCount;


    private String completion;


    private String participation;


}
