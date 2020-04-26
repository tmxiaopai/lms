package com.tmxf.lms.service;

import com.tmxf.lms.entity.RolePermission;

/**
 * The interface Role permission service.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/7 - 16:13
 * @package_name com.tmxf.lms.service
 */
public interface RolePermissionService {
    /**
     * 插入数据
     *
     * @param rolePermission the role permission
     */
    void insertRPData(RolePermission rolePermission);
}
