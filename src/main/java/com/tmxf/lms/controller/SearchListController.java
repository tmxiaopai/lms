package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.Customer;
import com.tmxf.lms.entity.Permission;
import com.tmxf.lms.service.CustomerService;
import com.tmxf.lms.service.NoticeService;
import com.tmxf.lms.service.PermissionService;
import com.tmxf.lms.service.UserService;
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

    @RequestMapping(value = "/findAllUser", method = RequestMethod.GET)
    public String login() {

        logger.info("查找所有用户信息：" + JSONObject.toJSONString(userService.findAll()));
        return JSONObject.toJSONString(userService.findAll());
    }

    @RequestMapping(value = "/findNavTree", method = RequestMethod.GET)
    public List<Permission> findNavTree(@RequestParam Integer userNum) {
        return permissionService.findNavTree(userNum, 1);
    }

    @GetMapping("findAllCustomer")
    public Object findAllCustomer() {
        return customerService.FindAllCustomer();
    }

    @GetMapping("findAllNotice")
    public Object findAllNotice() {
        return noticeService.findAllNotice();
    }
}
