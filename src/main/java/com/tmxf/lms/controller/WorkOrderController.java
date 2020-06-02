package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.WorkOrder;
import com.tmxf.lms.service.WorkOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * The type Work order controller.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/16 - 22:00
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class WorkOrderController {
    /**
     * The Logger.
     */
    Logger logger= LoggerFactory.getLogger(getClass());
    @Resource
    private WorkOrderService workOrderService;

    /**
     * Find all order object.
     *
     * @return the object
     */
    @GetMapping("findAllOrder")
    public Object findAllOrder(){
        return workOrderService.queryAll();
    }

    /**
     * Insert order object.
     *
     * @param workOrder the work order
     * @return the object
     */
    @PostMapping("insertOrder")
    public Object insertOrder(@RequestBody WorkOrder workOrder){
        return workOrderService.insert(workOrder);
    }

    /**
     * Set confirm object.
     *
     * @param faultId the fault id
     * @return the object
     */
    @PostMapping("setConfirm")
    public Object setConfirm(@RequestBody Integer faultId){
        return workOrderService.updateConfirm(faultId);
    }

    @PostMapping("searchWOByE")
    public String searchWOByE(@RequestBody WorkOrder workOrder){
        return JSONObject.toJSONString(workOrderService.queryByE(workOrder));
    }
}
