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
 * @author TMXIAOPAI
 * @date 2020/4/7 - 16:16
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class InitDataController {
    @Resource
    private RolePermissionService rolePermissionService;
    @Resource
    private PermissionService permissionService;

    @GetMapping("/initRPData")
    public void initRPDate() {
        List<Permission> permissions = permissionService.findAllPermission();
        for (int i = 1; i <= 27; i++) {
            RolePermission r1 = new RolePermission(null, 3, i);
            rolePermissionService.insertRPData(r1);
        }
        for (int i = 34; i <= 45; i++) {
            RolePermission r1 = new RolePermission(null, 3, i);
            rolePermissionService.insertRPData(r1);
        }
    }


    @GetMapping("/initPData")
    public void InitPermissionData() {
        Permission permission = new Permission(null, 10601, "电梯列表", null, null, 6, 1, true, new Date(), new Date(), 0, null, null);
        Permission permission1 = new Permission(null, 10701, "公告列表", null, null, 7, 1, true, new Date(), new Date(), 0, null, null);
        Permission permission2 = new Permission(null, 10801, "库存列表", null, null, 8, 1, 1, new Date(), new Date(), 0, null, null);
        Permission permission3 = new Permission(null, 10802, "配件出库", null, null, 8, 1, 1, new Date(), new Date(), 0, null, null);
        Permission permission4 = new Permission(null, 10803, "配件入库", null, null, 8, 1, 1, new Date(), new Date(), 0, null, null);
        Permission permission5 = new Permission(null, 11101, "新增帐号", null, null, 11, 1, 1, new Date(), new Date(), 0, null, null);
        Permission permission6 = new Permission(null, 11001, "收款列表", null, null, 10, 1, 1, new Date(), new Date(), 0, null, null);
        Permission permission7 = new Permission(null, 10901, "工单列表", null, null, 9, 1, 1, new Date(), new Date(), 0, null, null);
        Permission permission8 = new Permission(null, 10902, "客户反馈", null, null, 9, 1, 1, new Date(), new Date(), 0, null, null);
        Permission permission9 = new Permission(null, 10304, "合同状态", null, null, 25, 1, 1, new Date(), new Date(), 0, null, null);
        Permission permission10 = new Permission(null, 10305, "合同状态", null, null, 26, 1, 1, new Date(), new Date(), 0, null, null);
        Permission permission11 = new Permission(null, 10306, "合同状态", null, null, 27, 1, 1, new Date(), new Date(), 0, null, null);
        permissionService.insert(permission);
        permissionService.insert(permission1);
        permissionService.insert(permission2);
        permissionService.insert(permission3);
        permissionService.insert(permission4);
        permissionService.insert(permission5);
        permissionService.insert(permission6);
        permissionService.insert(permission7);
        permissionService.insert(permission8);
        permissionService.insert(permission9);
        permissionService.insert(permission10);
        permissionService.insert(permission11);
    }
}
