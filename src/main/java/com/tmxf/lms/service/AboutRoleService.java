package com.tmxf.lms.service;

import com.tmxf.lms.entity.Role;
import com.tmxf.lms.entity.UserRole;

import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/4/9 - 21:49
 * @package_name com.tmxf.lms.service
 */
public interface AboutRoleService {
    /**
     * 查找所有角色信息
     *
     * @return
     */
    List<Role> findAllRole();

    /**
     * 通过用户ID更新用户角色表
     *
     * @param userRole
     * @return
     */
    int updateUserRoleByUserId(UserRole userRole);

    /**
     * 添加用户角色记录
     *
     * @param userRole
     * @return
     */
    int insertUserRole(UserRole userRole);

    int deleteUserRole(Integer userId);
}
