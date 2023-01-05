package com.example.year.controller;


import com.example.year.entity.Sunshine;
import com.example.year.service.SunshineService;
import com.example.year.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 阳光培训专区 前端控制器
 * </p>
 *
 * @author 劳威锟
 * @since 2023-01-05
 */
@RestController
@RequestMapping("/year/sunshine")
public class SunshineController {

    @Autowired
    private SunshineService sunshineService;

    @GetMapping("/getOneByJobNo/{jobNo}")
    public Result getOneByJobNo(@PathVariable String jobNo) {
        Sunshine one = sunshineService.getOneByJobNo(jobNo);
        if(one != null) {
            return Result.success().data("data", one);
        } else {
            return Result.error().msg("找不到该员工的信息");
        }
    }
}

