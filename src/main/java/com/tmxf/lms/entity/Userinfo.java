package com.tmxf.lms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Userinfo)实体类
 *
 * @author makejava
 * @since 2020-04-22 14:56:02
 */
public class Userinfo implements Serializable {
    private static final long serialVersionUID = 111378879620948608L;
    /**
    * 用户编号
    */
    private Integer userNum;
    /**
    * 用户姓名
    */
    private String userName;
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
    
    private Integer roleId;
    /**
    * 角色名称
    */
    private String roleName;


    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}