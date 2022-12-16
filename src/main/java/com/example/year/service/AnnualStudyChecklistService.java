package com.example.year.service;

import com.example.year.entity.AnnualStudyChecklist;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 年度学习清单 服务类
 * </p>
 *
 * @author 劳威锟
 * @since 2022-12-16
 */
public interface AnnualStudyChecklistService extends IService<AnnualStudyChecklist> {

    AnnualStudyChecklist getOneByJobNo(String jobNo);
}
