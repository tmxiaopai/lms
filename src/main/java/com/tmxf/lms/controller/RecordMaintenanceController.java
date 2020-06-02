package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.RecordMaintenance;
import com.tmxf.lms.entity.Recordma;
import com.tmxf.lms.service.RecordMaintenanceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 维保记录(RecordMaintenance)表控制层
 *
 * @author makejava
 * @since 2020 -04-22 19:03:45
 */
@RestController
public class RecordMaintenanceController {
    /**
     * 服务对象
     */
    @Resource
    private RecordMaintenanceService recordMaintenanceService;

    @PostMapping("updateRM")
    public int updateRM(@RequestBody RecordMaintenance recordMaintenance) {
        return recordMaintenanceService.update(recordMaintenance);
    }

}