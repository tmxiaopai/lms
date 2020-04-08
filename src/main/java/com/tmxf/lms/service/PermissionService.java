package com.tmxf.lms.service;

import com.tmxf.lms.entity.Permission;

import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/4/4 - 16:34
 * @package_name com.tmxf.lms.service
 */
public interface PermissionService {
    /**
     * 根据用户查找权限信息
     *
     * @param userNum
     * @return
     */
    List<Permission> findByUserNum(Integer userNum);

    /**
     * 查找权限树
     *
     * @param userNum
     * @return
     */
    List<Permission> findNavTree(Integer userNum, Integer pType);

    /**
     * 查找全部权限信息
     *
     * @return
     */
    List<Permission> findAllPermission();

    /**
     * 插入方法(单个插入)
     *
     * @param permission
     */
    void insert(Permission permission);
}
