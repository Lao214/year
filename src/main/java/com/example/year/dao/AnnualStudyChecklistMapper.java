package com.example.year.dao;

import com.example.year.entity.AnnualStudyChecklist;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 年度学习清单 Mapper 接口
 * </p>
 *
 * @author 劳威锟
 * @since 2022-12-16
 */
public interface AnnualStudyChecklistMapper extends BaseMapper<AnnualStudyChecklist> {

    AnnualStudyChecklist getOneByJobNo(String jobNo);
}
