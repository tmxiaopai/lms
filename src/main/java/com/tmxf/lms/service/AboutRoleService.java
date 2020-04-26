package com.tmxf.lms.service;

import com.tmxf.lms.entity.Role;
import com.tmxf.lms.entity.UserRole;

import java.util.List;

/**
 * The interface About role service.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/9 - 21:49
 * @package_name com.tmxf.lms.service
 */
public interface AboutRoleService {
    /**
     * 查找所有角色信息
     *
     * @return list
     */
    List<Role> findAllRole();

    /**
     * 通过用户ID更新用户角色表
     *
     * @param userRole the user role
     * @return int
     */
    int updateUserRoleByUserId(UserRole userRole);

    /**
     * 添加用户角色记录
     *
     * @param userRole the user role
     * @return int
     */
    int insertUserRole(UserRole userRole);

    /**
     * Delete user role int.
     *
     * @param userId the user id
     * @return the int
     */
    int deleteUserRole(Integer userId);

    /**
     * Find user role integer.
     *
     * @param userId the user id
     * @return the integer
     */
    Integer findUserRole(Integer userId);
}
