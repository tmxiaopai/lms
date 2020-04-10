package com.tmxf.lms.controller;

import com.tmxf.lms.bean.UserRoleForm;
import com.tmxf.lms.entity.Customer;
import com.tmxf.lms.entity.User;
import com.tmxf.lms.entity.UserRole;
import com.tmxf.lms.service.AboutRoleService;
import com.tmxf.lms.service.CustomerService;
import com.tmxf.lms.service.UserService;
import jdk.nashorn.internal.ir.ReturnNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author TMXIAOPAI
 * @date 2020/4/8 - 17:49
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class UpdateDataController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private CustomerService customerService;
    @Resource
    private AboutRoleService aboutRoleService;
    @Resource
    private UserService userService;

    @RequestMapping(value = "updateCustomer", method = RequestMethod.POST)
    public Object updateCustomer(@RequestBody Customer customer, HttpServletRequest request) {
        logger.info("----------开始Customer信息修改逻辑----------");
        logger.info("更新的信息为" + customer.toString());
        if (customer.getCustomerNum() == null) {
            return "修改失败，工号不存在";
        } else {
            customerService.updateCustomer(customer);
        }
        return "修改成功";
    }

    @PostMapping("updateUserByUserId")
    public Object updateUserByPrimaryKey(@RequestBody User user) {
        logger.info("----------通过主键修改用户信息----------");
        if (userService.updateUserBuPrimaryKey(user) == 1) {
            return "修改成功";
        }
        return "修改失败";
    }

    @PostMapping("updateUserRoleByUserNum")
    public Object updateUserRoleByUserNum(@RequestBody UserRoleForm userRoleForm) {
        logger.info("----------通过UserId修改角色信息----------");
        UserRole userRole = new UserRole();
        userRole.setRoleId(userRoleForm.getRoleId());
        userRole.setUserId(userRoleForm.getUserId());
        if (aboutRoleService.updateUserRoleByUserId(userRole) == 1) {
            return "彻底修改成功";
        }
        return "修改失败";
    }
}
