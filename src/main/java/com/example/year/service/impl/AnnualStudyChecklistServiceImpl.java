package com.example.year.service.impl;

import com.example.year.entity.AnnualStudyChecklist;
import com.example.year.dao.AnnualStudyChecklistMapper;
import com.example.year.service.AnnualStudyChecklistService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 年度学习清单 服务实现类
 * </p>
 *
 * @author 劳威锟
 * @since 2022-12-16
 */
@Service
public class AnnualStudyChecklistServiceImpl extends ServiceImpl<AnnualStudyChecklistMapper, AnnualStudyChecklist> implements AnnualStudyChecklistService {

    @Override
    public AnnualStudyChecklist getOneByJobNo(String jobNo) {
        return baseMapper.getOneByJobNo(jobNo);
    }
}
