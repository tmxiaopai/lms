package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.DetailLift;
import com.tmxf.lms.entity.DetailSale;
import com.tmxf.lms.entity.HtMaintenance;
import com.tmxf.lms.entity.Project;
import com.tmxf.lms.service.DetailLiftService;
import com.tmxf.lms.service.HtMaintenanceService;
import com.tmxf.lms.service.ProjectService;
import com.tmxf.lms.service.RecordMaintenanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 * 维保合同(HtMaintenance)表控制层
 *
 * @author makejava
 * @since 2020 -04-17 16:20:42
 */
@RestController
public class HtMaintenanceController {
    /**
     * The Logger.
     */
    Logger logger= LoggerFactory.getLogger(getClass());
    /**
     * 服务对象
     */
    @Resource
    private HtMaintenanceService htMaintenanceService;
    @Resource
    private ProjectService projectService;
    @Resource
    private DetailLiftService detailLiftService;
    @Resource
    private RecordMaintenanceService recordMaintenanceService;

    /**
     * Insert ma ht int.
     *
     * @param htMaintenance the ht maintenance
     * @return the int
     */
    @PostMapping("insertMaHT")
    public int insertMaHt(@RequestBody HtMaintenance htMaintenance) {
        Project p = new Project();
        p.setProjectNum(htMaintenance.getpNum());
        logger.info(htMaintenance.getpNum()+"分隔符"+JSONObject.toJSONString(htMaintenance));
        String customerName = projectService.queryAllByProject(p).get(0).getCustomerName();
        htMaintenance.setHtMCustomer(customerName);
        int flag = htMaintenanceService.insert(htMaintenance);

        List<Integer> lifts = detailLiftService.findAllLiftInProject(htMaintenance.getpNum());
        logger.info(String.valueOf(lifts.size()));
        int i;
        for(i=0;i<lifts.size();i++) {
            recordMaintenanceService.insertMany(lifts.get(i),htMaintenance.getHtMStartDate(),htMaintenance.getHtMMonth());
        }


        return flag;
    }

    /**
     * Find all ma ht string.
     *
     * @return the string
     */
    @GetMapping("findAllMaHt")
    public String findAllMAHt() {
        return JSONObject.toJSONString(htMaintenanceService.findAllMaHt());
    }

    @PostMapping("searchHtMaByE")
    public String searchHtMaByE(@RequestBody HtMaintenance htMaintenance){
        return JSONObject.toJSONString(htMaintenanceService.queryAll(htMaintenance));
    }

}