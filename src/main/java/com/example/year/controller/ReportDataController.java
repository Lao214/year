package com.example.year.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.year.entity.ReportData;
import com.example.year.service.ReportDataService;
import com.example.year.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 劳威锟
 * @since 2022-12-10
 */
@RestController
@RequestMapping("/year/reportData")
public class ReportDataController {

    @Autowired
    private ReportDataService reportDataService;

    @GetMapping("/getOneByJobNo/{jobNo}")
    public Result getOneByJobNo(@PathVariable String jobNo) {
        ReportData one = reportDataService.getOneByJobNo(jobNo);
        if(one != null) {
            return Result.success().data("data", one);
        } else {
            return Result.error().msg("找不到该员工的信息");
        }
    }


}

