package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Role;
import com.tmxf.lms.entity.UserRole;
import com.tmxf.lms.mapper.RoleMapper;
import com.tmxf.lms.mapper.UserRoleMapper;
import com.tmxf.lms.service.AboutRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/4/9 - 22:07
 * @package_name com.tmxf.lms.service.impl
 */
@Service
public class AboutRoleServiceImpl implements AboutRoleService {
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public List<Role> findAllRole() {
        return roleMapper.selectAll();
    }

    @Override
    public int updateUserRoleByUserId(UserRole userRole) {
        return userRoleMapper.updateByUserId(userRole);
    }

    @Override
    public int insertUserRole(UserRole userRole) {
        return userRoleMapper.insert(userRole);
    }

    @Override
    public int deleteUserRole(Integer userId) {
        return userRoleMapper.deleteUserRole(userId);
    }
}
