package com.example.year.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.year.entity.ViewRecords;
import com.example.year.service.ViewRecordsService;
import com.example.year.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 劳威锟
 * @since 2022-12-10
 */
@RestController
@RequestMapping("/year/viewRecords")
public class ViewRecordsController {

    @Autowired
    private ViewRecordsService viewRecordsService;

    @PostMapping("/view")
    public Result view(@RequestBody ViewRecords view){
//        view.setUa(view.getUa().replace(".",""));
//        view.setUa(view.getUa().replace(";",""));
        view.setCreateTime(new Date());
        boolean save = viewRecordsService.save(view);
        if (save) {
            return Result.success().data("data",view);
        } else {
            return Result.success().msg("插入失败");
        }
    }


    @PostMapping("/update")
    public Result update(@RequestBody ViewRecords view){
        boolean save = viewRecordsService.updateById(view);
        if (save) {
            return Result.success();
        } else {
            return Result.success().msg("修改失败");
        }
    }

}

