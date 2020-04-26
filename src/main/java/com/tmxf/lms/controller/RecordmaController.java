package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.Recordma;
import com.tmxf.lms.service.RecordmaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Recordma)表控制层
 *
 * @author makejava
 * @since 2020-04-23 21:45:08
 */
@RestController
public class RecordmaController {
    /**
     * 服务对象
     */
    @Resource
    private RecordmaService recordmaService;

    @GetMapping("findALlRMS")
    public String findAllRMS(){
        return JSONObject.toJSONString(recordmaService.queryAll(null));
    }

}