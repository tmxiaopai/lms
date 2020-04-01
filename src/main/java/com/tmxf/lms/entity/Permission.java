package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

/**
 * 权限表(Permission)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class Permission implements Serializable {
    private static final long serialVersionUID = 882670181686668454L;
    /**
     * id
     */
    private Integer permisstionId;
    /**
     * 权限编号
     */
    private Integer permisstionNum;
    /**
     * 权限名称
     */
    private String permissionName;
    /**
     * 权限描述
     */
    private String permissionDesc;
    /**
     * 权限访问路径
     */
    private String permissionUrl;
    /**
     * 父极权限ID
     */
    private Integer parentId;
    /**
     * 权限类型
     */
    private Integer permisstionType;
    /**
     * 权限状态
     */
    private Object permisstionStatus;
    /**
     * 权限创建时间
     */
    private Date permisstionCreateTime;
    /**
     * 权限更新时间
     */
    private Date permisstionUpdateTime;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}