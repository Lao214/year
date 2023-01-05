package com.example.year.service;

import com.example.year.entity.Sunshine;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 阳光培训专区 服务类
 * </p>
 *
 * @author 劳威锟
 * @since 2023-01-05
 */
public interface SunshineService extends IService<Sunshine> {

    Sunshine getOneByJobNo(String jobNo);
}
