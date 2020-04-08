package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Permission;
import com.tmxf.lms.mapper.PermissionMapper;
import com.tmxf.lms.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/4/4 - 16:37
 * @package_name com.tmxf.lms.service.Impl
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> findByUserNum(Integer userNum) {
        return null;
    }

    @Override
    public List<Permission> findNavTree(Integer userNum, Integer pType) {
        //声明一个系统菜单
        List<Permission> menus = new ArrayList<>();
        //生命一个查询菜单
        List<Permission> findMenus = permissionMapper.findByUserNum(userNum);

        for (Permission p : findMenus) {
            //如果是一级菜单，级别设置为0
            if (p.getParentId() == null || p.getParentId() == 0) {
                p.setLevel(0);
                if (!exists(menus, p)) {
                    menus.add(p);
                }
            }
        }

        menus.sort((o1, o2) -> o1.getPermissionOrderNum().compareTo(o2.getPermissionOrderNum()));
        findChildren(menus, findMenus, pType);


        return menus;
    }

    private void findChildren(List<Permission> menus, List<Permission> findMenus, Integer pType) {

        for (Permission p : menus) {
            List<Permission> children = new ArrayList<>();
            for (Permission pn : findMenus) {
                if (pType == 1 && pn.getPermissionType() == 2) {
                    continue;
                }
                if (p.getPermissionId() != null && p.getPermissionId().equals(pn.getParentId())) {
                    pn.setParentName(p.getParentName());
                    pn.setLevel(p.getLevel() + 1);
                    if (!exists(children, pn)) {
                        children.add(pn);
                    }
                }
            }
            p.setChildren(children);
            children.sort((o1, o2) -> o1.getPermissionOrderNum().compareTo(o2.getPermissionOrderNum()));
            findChildren(children, findMenus, pType);
        }


    }

    //判断系统树里卖你是否存在
    private boolean exists(List<Permission> sysMenus, Permission sysMenu) {
        boolean exist = false;
        for (Permission menu : sysMenus) {
            if (menu.getPermissionId().equals(sysMenu.getPermissionId())) {
                exist = true;
            }
        }
        return exist;
    }

    @Override
    public List<Permission> findAllPermission() {
        return null;
    }

    @Override
    public void insert(Permission permission) {
        permissionMapper.insert(permission);
    }
}
