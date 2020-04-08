package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.RolePermission;
import com.tmxf.lms.mapper.RolePermissionMapper;
import com.tmxf.lms.service.RolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author TMXIAOPAI
 * @date 2020/4/7 - 16:14
 * @package_name com.tmxf.lms.service.impl
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService {
    @Resource
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public void insertRPData(RolePermission rolePermission) {
        rolePermissionMapper.insert(rolePermission);
    }
}
