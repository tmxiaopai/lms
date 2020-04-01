package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 角色权限表(RolePermisstion)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:27
 */
@Getter
@Setter
public class RolePermisstion implements Serializable {
    private static final long serialVersionUID = -10229546723998000L;

    private Integer rolePermisstionId;

    private Integer roleId;

    private Integer permisstionId;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}