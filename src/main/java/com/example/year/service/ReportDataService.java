package com.example.year.service;

import com.example.year.entity.ReportData;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 劳威锟
 * @since 2022-12-10
 */
public interface ReportDataService extends IService<ReportData> {

    ReportData getOneByJobNo(String jobNo);

}
