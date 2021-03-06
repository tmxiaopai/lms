package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 角色权限表(RolePermisstion)实体类
 *
 * @author makejava
 * @since 2020 -03-31 22:46:27
 */
@Getter
@Setter
public class RolePermission implements Serializable {
    private static final long serialVersionUID = -10229546723998000L;

    private Integer rolePermissionId;

    private Integer roleId;

    private Integer permissionId;


    /**
     * Instantiates a new Role permission.
     *
     * @param rolePermissionId the role permission id
     * @param roleId           the role id
     * @param permissionId     the permission id
     */
    public RolePermission(Integer rolePermissionId, Integer roleId, Integer permissionId) {
        this.rolePermissionId = rolePermissionId;
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}