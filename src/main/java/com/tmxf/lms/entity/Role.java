package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色表(Role)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:27
 */
@Getter
@Setter
public class Role implements Serializable {
    private static final long serialVersionUID = -93768470472733213L;
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 角色编号
     */
    private Integer roleNum;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色描述
     */
    private String roleDesc;
    /**
     * 角色状态
     */
    private Object roleStatus;
    /**
     * 创建时间
     */
    private Date roleCreateTime;
    /**
     * 更新时间
     */
    private Date roleUpdateTime;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}