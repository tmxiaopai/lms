package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2020 -03-31 22:46:27
 */
@Getter
@Setter
public class User implements Serializable {
    private static final long serialVersionUID = -60441373665699933L;
    /**
     * 用户编号
     */
    private Integer userNum;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户手机号
     */
    private String userPhone;
    /**
     * 电子邮箱
     */
    private String userEmail;
    /**
     * 创建时间
     */
    private Date userCreateTime;
    /**
     * 上次登录时间
     */
    private Date userLastLoginTime;
    /**
     * 角色名称
     */
   private Integer roleName;


    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}