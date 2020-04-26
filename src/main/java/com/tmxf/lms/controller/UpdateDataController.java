package com.tmxf.lms.controller;

import com.tmxf.lms.bean.UserRoleForm;
import com.tmxf.lms.entity.User;
import com.tmxf.lms.entity.UserRole;
import com.tmxf.lms.service.AboutRoleService;
import com.tmxf.lms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * The type Update data controller.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/8 - 17:49
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class UpdateDataController {
    /**
     * The Logger.
     */
    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private AboutRoleService aboutRoleService;
    @Resource
    private UserService userService;

    /**
     * Update user by primary key object.
     *
     * @param user the user
     * @return the object
     */
    @PostMapping("updateUserByUserId")
    public Object updateUserByPrimaryKey(@RequestBody User user) {
        logger.info("----------通过主键修改用户信息----------");
        UserRole ur=new UserRole();
        ur.setRoleId(user.getRoleName());
        ur.setUserId(user.getUserNum());

        if (userService.updateUserBuPrimaryKey(user) == 1 && aboutRoleService.updateUserRoleByUserId(ur)==1) {
            return "修改成功";
        }
        return "修改失败";
    }

    /**
     * Update user role by user num object.
     *
     * @param userRoleForm the user role form
     * @return the object
     */
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
