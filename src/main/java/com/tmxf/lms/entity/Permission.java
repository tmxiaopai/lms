package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

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
    private Integer permissionId;
    /**
     * 权限编号
     */
    private Integer permissionNum;
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
    private Integer permissionType;
    /**
     * 权限状态
     */
    private Object permissionStatus;
    /**
     * 权限创建时间
     */
    private Date permissionCreateTime;
    /**
     * 权限更新时间
     */
    private Date permissionUpdateTime;
    /**
     * 排序标志
     */
    private Integer permissionOrderNum;
    /**
     * 权限
     */
    private String permissionPerms;
    /**
     * icon
     */
    private String permissionIcon;
    // 非数据库字段
    /**
     * 父级菜单名称
     */
    private String parentName;
    /**
     * 级别
     */
    private Integer level;
    // 非数据库字段
    private List<Permission> children;


    public Permission(Integer permissionId, Integer permissionNum, String permissionName, String permissionDesc, String permissionUrl, Integer parentId, Integer permissionType, Object permissionStatus, Date permissionCreateTime, Date permissionUpdateTime, Integer permissionOrderNum, String permissionPerms, String permissionIcon) {
        this.permissionId = permissionId;
        this.permissionNum = permissionNum;
        this.permissionName = permissionName;
        this.permissionDesc = permissionDesc;
        this.permissionUrl = permissionUrl;
        this.parentId = parentId;
        this.permissionType = permissionType;
        this.permissionStatus = permissionStatus;
        this.permissionCreateTime = permissionCreateTime;
        this.permissionUpdateTime = permissionUpdateTime;
        this.permissionOrderNum = permissionOrderNum;
        this.permissionPerms = permissionPerms;
        this.permissionIcon = permissionIcon;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public Integer getPermissionNum() {
        return permissionNum;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public String getPermissionDesc() {
        return permissionDesc;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Integer getPermissionType() {
        return permissionType;
    }

    public Object getPermissionStatus() {
        return permissionStatus;
    }

    public Date getPermissionCreateTime() {
        return permissionCreateTime;
    }

    public Date getPermissionUpdateTime() {
        return permissionUpdateTime;
    }

    public Integer getPermissionOrderNum() {
        return permissionOrderNum;
    }

    public String getPermissionPerms() {
        return permissionPerms;
    }

    public String getPermissionIcon() {
        return permissionIcon;
    }

    public String getParentName() {
        return parentName;
    }

    public Integer getLevel() {
        return level;
    }

    public List<Permission> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}