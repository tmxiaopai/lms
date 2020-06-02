package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.eventbus.DeadEvent;
import com.tmxf.lms.entity.DetailLift;
import com.tmxf.lms.service.DetailLiftService;
import org.apache.logging.slf4j.SLF4JLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.soap.Detail;

/**
 * 电梯需求(DetailLift)表控制层
 *
 * @author makejava
 * @since 2020 -04-21 14:54:43
 */
@RestController
public class DetailLiftController {
    Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * 服务对象
     */
    @Resource
    private DetailLiftService detailLiftService;

    /**
     * Insert lift int.
     *
     * @param detailLift the detail lift
     * @return the int
     */
    @PostMapping("insertLift")
    public int insertLift(@RequestBody DetailLift detailLift) {
        detailLift.setInstallStatus("未安装");
        return detailLiftService.insert(detailLift);
    }

    /**
     * Find all lift string.
     *
     * @return the string
     */
    @GetMapping("findAllLift")
    public String findAllLift() {
        return JSONObject.toJSONString(detailLiftService.queryAllLift());
    }

    /**
     * Find un finish string.
     *
     * @return the string
     */
    @GetMapping("findUnFinish")
    public String findUnFinish() {
        return JSONObject.toJSONString(detailLiftService.queryUnFinish());
    }

    /**
     * Search lift by pro num string.
     *
     * @param projectNum the project num
     * @return the string
     */
    @PostMapping("searchLiftByProNum")
    public String searchLiftByProNum(@RequestBody String projectNum) {
        return JSONObject.toJSONString(detailLiftService.queryLiftByProNum(projectNum));
    }

    @PostMapping("updateLift")
    public int updateLift(@RequestBody DetailLift detailLift) {
        logger.info("修改电梯信息");
        logger.info("前台传过来的数据为：" + JSONObject.toJSONString(detailLift));
        return detailLiftService.update(detailLift) ;
    }

    @PostMapping("searchLiftByLift")
    public String searchLiftByLift(@RequestBody DetailLift detailLift){
        return JSONObject.toJSONString(detailLiftService.queryAll(detailLift));
    }

    @PostMapping("updateState")
    public int updateState(@RequestBody DetailLift detailLift){
        return detailLiftService.update(detailLift);
    }
}