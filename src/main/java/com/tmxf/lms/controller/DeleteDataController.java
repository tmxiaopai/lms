package com.tmxf.lms.controller;

import com.tmxf.lms.service.AboutRoleService;
import com.tmxf.lms.service.CustomerService;
import com.tmxf.lms.service.NoticeService;
import com.tmxf.lms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author TMXIAOPAI
 * @date 2020/4/8 - 21:34
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class DeleteDataController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private CustomerService customerService;
    @Resource
    private NoticeService noticeService;
    @Resource
    private AboutRoleService aboutRoleService;
    @Resource
    private UserService userService;

    @RequestMapping(value = "deleteCustomer", method = RequestMethod.POST)
    public Object deleteCustomer(@RequestBody Integer customerNum) {
        logger.info("----------删除客户信息----------");
        if (customerNum != null) {
            customerService.deleteCustomer(customerNum);
            return "成功删除";
        }
        return "删除失败";

    }

    @PostMapping("deleteNotice")
    public Object deleteNotice(@RequestBody Integer noticeId) {
        logger.info("----------删除公告信息----------");
        if (noticeId != null) {
            noticeService.deleteByNoticeID(noticeId);
            return true;
        }
        return false;
    }

    @PostMapping("deleteUser")
    public Object deleteUser(@RequestBody Integer userId) {
        if (userId != null) {
            aboutRoleService.deleteUserRole(userId);
            userService.deleteUser(userId);
            return "删除成功";
        }
        return "删除失败";
    }
}
