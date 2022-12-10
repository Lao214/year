package com.example.year.dao;

import com.example.year.entity.ReportData;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 劳威锟
 * @since 2022-12-10
 */
public interface ReportDataMapper extends BaseMapper<ReportData> {

    ReportData getOneByJobNo(String jobNo);
}
