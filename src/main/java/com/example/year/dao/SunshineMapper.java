package com.example.year.dao;

import com.example.year.entity.AnnualStudyChecklist;
import com.example.year.entity.Sunshine;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 阳光培训专区 Mapper 接口
 * </p>
 *
 * @author 劳威锟
 * @since 2023-01-05
 */
public interface SunshineMapper extends BaseMapper<Sunshine> {

    Sunshine getOneByJobNo(String jobNo);
}
