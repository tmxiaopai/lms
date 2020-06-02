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
 * @since 2020 -04-23 21:45:08
 */
@RestController
public class RecordMaController {
    /**
     * 服务对象
     */
    @Resource
    private RecordmaService recordmaService;

    /**
     * Find all rms string.
     *
     * @return the string
     */
    @GetMapping("findALlRMS")
    public String findAllRms(){
        return JSONObject.toJSONString(recordmaService.queryAll(null));
    }
    @PostMapping("searchRMaByE")
    public String searchRMaByE(@RequestBody Recordma recordma){
        return JSONObject.toJSONString(recordmaService.queryAll(recordma));
    }

}