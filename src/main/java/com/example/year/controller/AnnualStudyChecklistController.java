package com.example.year.controller;


import com.example.year.entity.AnnualStudyChecklist;
import com.example.year.service.AnnualStudyChecklistService;
import com.example.year.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 年度学习清单 前端控制器
 * </p>
 *
 * @author 劳威锟
 * @since 2022-12-16
 */
@RestController
@RequestMapping("/year/AnnualStudyChecklist")
public class AnnualStudyChecklistController {

    @Autowired
    private AnnualStudyChecklistService annualStudyChecklistService;

    @GetMapping("/getOneByJobNo/{jobNo}")
    public Result getOneByJobNo(@PathVariable String jobNo) {
        AnnualStudyChecklist one = annualStudyChecklistService.getOneByJobNo(jobNo);
        if(one != null) {
            return Result.success().data("data", one);
        } else {
            return Result.error().msg("找不到该员工的信息");
        }
    }


}

