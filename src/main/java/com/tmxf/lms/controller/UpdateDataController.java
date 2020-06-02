package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.bean.Password;
import com.tmxf.lms.bean.UserRoleForm;
import com.tmxf.lms.entity.User;
import com.tmxf.lms.entity.UserRole;
import com.tmxf.lms.service.AboutRoleService;
import com.tmxf.lms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
        UserRole ur = new UserRole();
        ur.setRoleId(user.getRoleName());
        ur.setUserId(user.getUserNum());

        if (userService.updateUserBuPrimaryKey(user) == 1 && aboutRoleService.updateUserRoleByUserId(ur) == 1) {
            return "修改成功";
        }
        return "修改失败";
    }

    @PostMapping("updateUserInfo")
    public int updateUserInfo(@RequestBody User user) {
        return userService.updateUserBuPrimaryKey(user);
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

    /**
     * 更新密码
     *
     * @param password
     * @return
     */
    @PostMapping("updatePassword")
    public int updatePassword(@RequestBody Password password, HttpServletRequest request) {
        Integer userNum = (Integer) request.getSession().getAttribute("userNum");
        logger.info("session中的工号为" + userNum);
        logger.info("password内容为" + JSONObject.toJSONString(password));
        if(!password.getNewPassword().equals(password.getConfirmPassword())){
            return 2;
        }
        String oldPassword = userService.encodingPassword(password.getOldPassword(), userNum);
        String newPassword = userService.encodingPassword(password.getNewPassword(), userNum);
        if (oldPassword.equals(userService.findPasswordByUserNum(userNum))) {
            userService.updatePassword(newPassword, userNum);
            return 1;
        } else {
            return 0;
        }
    }

}
