package com.example.year.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import com.example.year.utils.Result;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author lao
 * @version 1.0
 * @description: TODO
 * @date 2022/12/14 8:30 AM
 */
@RestController
@RequestMapping("/down")
public class downController {

    @PostMapping(value = "/uploadImage", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public Object uploadImage(@RequestBody String jsonStr) {
        //获取前端传送base64文件
        String capture = JSONUtil.parseObj(jsonStr).getStr("capture");
        //截掉data:image/png;base64
        String base64 = capture.substring(capture.indexOf(",") + 1);
        //保存路径
        String path = "~/Desktop/截屏/" + DateUtil.format(new Date(), "yyyy.MM.dd_HH.mm.ss") + ".png";
        //转换保存
        ImgUtil.write(ImgUtil.toImage(base64), FileUtil.file(path));
        return Result.success();
    }


//    @RequestMapping("/sadasd")
//    public void a(HttpServletRequest req,HttpServletResponse res){
//        //数据添加到表格省略
//        String filename = "xxxx.xls";
//        res.setContentType("application/vnd.ms-excel");
//        res.setHeader("Contest-Disposition","filename=" + URLEncoder.encode(fileName,"UTF-8"));
//        OutputStream ops = res.getOutputStream();
//        wb.write(ops);
//        ops.flush();
//        ops.close();
//    }

}
