package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 用户权限表(UserRole)实体类
 *
 * @author makejava
 * @since 2020 -03-31 22:46:28
 */
@Getter
@Setter
public class UserRole implements Serializable {
    private static final long serialVersionUID = -91223603316320161L;
    /**
     * 用户权限ID
     */
    private Integer userRoleId;

    private Integer userId;

    private Integer roleId;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}