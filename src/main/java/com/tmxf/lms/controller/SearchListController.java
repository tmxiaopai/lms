package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.Customer;
import com.tmxf.lms.entity.Permission;
import com.tmxf.lms.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/4/7 - 21:45
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class SearchListController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private CustomerService customerService;
    @Resource
    private PermissionService permissionService;
    @Resource
    private UserService userService;
    @Resource
    private NoticeService noticeService;
    @Resource
    private AboutRoleService aboutRoleService;

    @RequestMapping(value = "/findAllUser", method = RequestMethod.GET)
    public String findAllUser() {
        logger.info("----------查找所有用户信息----------");
        return JSONObject.toJSONString(userService.findAll());
    }

    @RequestMapping(value = "/findNavTree", method = RequestMethod.GET)
    public List<Permission> findNavTree(@RequestParam Integer userNum) {
        logger.info("----------查找菜单树----------");
        return permissionService.findNavTree(userNum, 1);
    }

    @GetMapping("findAllCustomer")
    public Object findAllCustomer() {
        logger.info("----------查找所有客户信息----------");
        return customerService.FindAllCustomer();
    }

    @GetMapping("findAllNotice")
    public Object findAllNotice() {
        logger.info("----------查找所有公告信息----------");
        return noticeService.findAllNotice();
    }

    @GetMapping("findAllRole")
    public Object findAllRole() {
        logger.info("----------查找所有角色信息----------");
        return aboutRoleService.findAllRole();
    }
}
