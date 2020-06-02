package com.tmxf.lms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Userinfo)实体类
 *
 * @author makejava
 * @since 2020 -04-22 14:56:02
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


    /**
     * Gets user num.
     *
     * @return the user num
     */
    public Integer getUserNum() {
        return userNum;
    }

    /**
     * Sets user num.
     *
     * @param userNum the user num
     */
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets user phone.
     *
     * @return the user phone
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * Sets user phone.
     *
     * @param userPhone the user phone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * Gets user email.
     *
     * @return the user email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Sets user email.
     *
     * @param userEmail the user email
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * Gets user create time.
     *
     * @return the user create time
     */
    public Date getUserCreateTime() {
        return userCreateTime;
    }

    /**
     * Sets user create time.
     *
     * @param userCreateTime the user create time
     */
    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    /**
     * Gets user last login time.
     *
     * @return the user last login time
     */
    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    /**
     * Sets user last login time.
     *
     * @param userLastLoginTime the user last login time
     */
    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    /**
     * Gets role id.
     *
     * @return the role id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * Sets role id.
     *
     * @param roleId the role id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * Gets role name.
     *
     * @return the role name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets role name.
     *
     * @param roleName the role name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}