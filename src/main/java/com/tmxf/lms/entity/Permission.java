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
 * @since 2020 -03-31 22:46:26
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
     * 权限名称
     */
    private String permissionName;
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
     * 排序标志
     */
    private Integer permissionOrderNum;
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

    private List<Permission> children;


    /**
     * Instantiates a new Permission.
     *
     * @param permissionId       the permission id
     * @param permissionName     the permission name
     * @param permissionUrl      the permission url
     * @param parentId           the parent id
     * @param permissionType     the permission type
     * @param permissionOrderNum the permission order num
     * @param permissionIcon     the permission icon
     */
    public Permission(Integer permissionId, String permissionName, String permissionUrl, Integer parentId, Integer permissionType, Integer permissionOrderNum, String permissionIcon) {
        this.permissionId = permissionId;
        this.permissionName = permissionName;
        this.permissionUrl = permissionUrl;
        this.parentId = parentId;
        this.permissionType = permissionType;
        this.permissionOrderNum = permissionOrderNum;
        this.permissionIcon = permissionIcon;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}