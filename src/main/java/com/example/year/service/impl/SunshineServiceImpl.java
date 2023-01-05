package com.example.year.service.impl;

import com.example.year.entity.Sunshine;
import com.example.year.dao.SunshineMapper;
import com.example.year.service.SunshineService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 阳光培训专区 服务实现类
 * </p>
 *
 * @author 劳威锟
 * @since 2023-01-05
 */
@Service
public class SunshineServiceImpl extends ServiceImpl<SunshineMapper, Sunshine> implements SunshineService {

    @Override
    public Sunshine getOneByJobNo(String jobNo) {
        return baseMapper.getOneByJobNo(jobNo);
    }
}
