package com.tmxf.lms.service;

import com.tmxf.lms.entity.Permission;

import java.util.List;

/**
 * The interface Permission service.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/4 - 16:34
 * @package_name com.tmxf.lms.service
 */
public interface PermissionService {

    /**
     * 查找权限树
     *
     * @param userNum the user num
     * @param pType   the p type
     * @return list
     */
    List<Permission> findNavTree(Integer userNum, Integer pType);

    /**
     * 查找全部权限信息
     *
     * @return list
     */
    List<Permission> findAllPermission();

    /**
     * 插入方法(单个插入)
     *
     * @param permission the permission
     */
    void insert(Permission permission);
}
