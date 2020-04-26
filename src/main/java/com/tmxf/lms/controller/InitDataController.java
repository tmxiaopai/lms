package com.tmxf.lms.controller;

import com.tmxf.lms.entity.Permission;
import com.tmxf.lms.entity.RolePermission;
import com.tmxf.lms.service.PermissionService;
import com.tmxf.lms.service.RolePermissionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * The type Init data controller.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/7 - 16:16
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class InitDataController {
    @Resource
    private RolePermissionService rolePermissionService;
    @Resource
    private PermissionService permissionService;

    /**
     * Init rp date.
     */
    @GetMapping("/initRPData")
    public void initRPDate() {

    }


    /**
     * Init permission data.
     */
    @GetMapping("/initPData")
    public void InitPermissionData() {

    }
}
