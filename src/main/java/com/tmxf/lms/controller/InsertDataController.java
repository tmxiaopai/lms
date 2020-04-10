package com.tmxf.lms.controller;

import com.tmxf.lms.bean.UserRoleForm;
import com.tmxf.lms.entity.Customer;
import com.tmxf.lms.entity.Notice;
import com.tmxf.lms.entity.User;
import com.tmxf.lms.entity.UserRole;
import com.tmxf.lms.service.AboutRoleService;
import com.tmxf.lms.service.CustomerService;
import com.tmxf.lms.service.NoticeService;
import com.tmxf.lms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author TMXIAOPAI
 * @date 2020/4/8 - 21:48
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class InsertDataController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private CustomerService customerService;
    @Resource
    private NoticeService noticeService;
    @Resource
    private UserService userService;
    @Resource
    private AboutRoleService aboutRoleService;

    /**
     * 插入客户信息
     *
     * @param customer
     * @return
     */
    @PostMapping("insertCustomer")
    public Object insertCustomerInfo(@RequestBody Customer customer) {
        logger.info("----------新增客户信息----------");
        if (customer.getCustomerName() != null && customer.getCustomerType() != null) {
            customerService.insertCustomerInfo(customer);
            return "成功保存";
        } else if (customer.getCustomerName() == null || "".equals(customer.getCustomerName())) {
            return "客户名称为空";
        } else {
            return "输入数据无效";
        }
    }

    @PostMapping("insertNotice")
    public Object insertNotice(@RequestBody Notice notice, HttpServletRequest request) {
        logger.info("----------新增公告信息----------");
        notice.setNoticeDate(new Date());
        String userName = (String) request.getSession().getAttribute("userName");
        if (userName == null || userName.equals("")) {
            return "请重新登陆！";
        }
        notice.setNoticeMan(userName);
        logger.warn(notice.toString());
        if (noticeService.insertNotice(notice) == 1) {
            return "成功保存";
        }
        return "插入失败，请检查数据";
    }

    @PostMapping("insertUser")
    public Object insertUser(@RequestBody User user) {
        logger.info("----------新增用户信息----------");
        user.setUserCreateTime(new Date());
        user.setUserUpdateTime(new Date());
        user.setUserSalt(String.valueOf(user.getUserNum()));
        if (user.getUserNum() == null) {
            return "工号为空";
        } else if (user.getUserName() == null || user.getUserName().equals("")) {
            return "用户名为空";
        } else if (user.getUserPassword() == null || user.getUserPassword().equals("")) {
            return "密码为空";
        }
        if (userService.insertUser(user) == 1) {
            return "保存成功";
        }
        return "保存失败";
    }

    @PostMapping("insertUserRole")
    public Object insertUserRole(@RequestBody UserRoleForm userRoleForm) {
        logger.info("----------新增用户角色信息----------");
        int roleId = userRoleForm.getRoleId();
        int userNum = userRoleForm.getUserNum();
        logger.info(roleId + " " + userNum);
        UserRole userRole = new UserRole();
        userRole.setUserId(userService.findUserIdByUserNum(userNum));
        userRole.setRoleId(roleId);
        if (aboutRoleService.insertUserRole(userRole) == 1) {
            return "用户角色保存成功";
        }
        return "请修改用户角色";
    }
}
