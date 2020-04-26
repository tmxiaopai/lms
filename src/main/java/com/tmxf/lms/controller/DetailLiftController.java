package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.eventbus.DeadEvent;
import com.tmxf.lms.entity.DetailLift;
import com.tmxf.lms.service.DetailLiftService;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 电梯需求(DetailLift)表控制层
 *
 * @author makejava
 * @since 2020-04-21 14:54:43
 */
@RestController
public class DetailLiftController {
    /**
     * 服务对象
     */
    @Resource
    private DetailLiftService detailLiftService;

    @PostMapping("insertLift")
    public int insertLift(@RequestBody DetailLift detailLift){
        detailLift.setInstallStatus("未安装");
        return detailLiftService.insert(detailLift);
    }

    @GetMapping("findAllLift")
    public String findAllLift(){
        return JSONObject.toJSONString(detailLiftService.queryAllLift());
    }

    @GetMapping("findUnFinish")
    public String findUnFinish(){
        return JSONObject.toJSONString(detailLiftService.queryUnFinish());
    }

    @PostMapping("searchLiftByProNum")
    public String searchLiftByProNum(@RequestBody String projectNum){
        return JSONObject.toJSONString(detailLiftService.queryLiftByProNum(projectNum));
    }
}