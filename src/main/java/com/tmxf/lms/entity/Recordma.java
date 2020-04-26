package com.tmxf.lms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Recordma)实体类
 *
 * @author makejava
 * @since 2020-04-23 21:45:08
 */
public class Recordma implements Serializable {
    private static final long serialVersionUID = 464801740261426551L;
    /**
    * 出厂编号
    */
    private String factoryNum;
    /**
    * 项目编号
    */
    private String projectNum;
    /**
    * 客户名称
    */
    private String customerName;
    /**
    * 项目地址
    */
    private String projectAddress;
    /**
    * id
    */
    private Integer rmId;
    /**
    * 所属电梯
    */
    private Integer rmLift;
    /**
    * 应维保时间
    */
    private Date rmDate;
    /**
    * 维保类型
    */
    private String rmType;
    /**
    * 维保人员
    */
    private String rmUser;
    /**
    * 签到时间
    */
    private Date rmLogin;
    /**
    * 签到地点
    */
    private String rmLoginAddr;
    /**
    * 签退时间
    */
    private Date rmLogout;
    /**
    * 签退地点
    */
    private String rmLogoutAddr;
    /**
    * 图片地址
    */
    private String rmUrl;
    /**
    * 维保情况
    */
    private String rmDescription;
    /**
    * 项目名称
    */
    private String projectName;


    public String getFactoryNum() {
        return factoryNum;
    }

    public void setFactoryNum(String factoryNum) {
        this.factoryNum = factoryNum;
    }

    public String getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public Integer getRmId() {
        return rmId;
    }

    public void setRmId(Integer rmId) {
        this.rmId = rmId;
    }

    public Integer getRmLift() {
        return rmLift;
    }

    public void setRmLift(Integer rmLift) {
        this.rmLift = rmLift;
    }

    public Date getRmDate() {
        return rmDate;
    }

    public void setRmDate(Date rmDate) {
        this.rmDate = rmDate;
    }

    public String getRmType() {
        return rmType;
    }

    public void setRmType(String rmType) {
        this.rmType = rmType;
    }

    public String getRmUser() {
        return rmUser;
    }

    public void setRmUser(String rmUser) {
        this.rmUser = rmUser;
    }

    public Date getRmLogin() {
        return rmLogin;
    }

    public void setRmLogin(Date rmLogin) {
        this.rmLogin = rmLogin;
    }

    public String getRmLoginAddr() {
        return rmLoginAddr;
    }

    public void setRmLoginAddr(String rmLoginAddr) {
        this.rmLoginAddr = rmLoginAddr;
    }

    public Date getRmLogout() {
        return rmLogout;
    }

    public void setRmLogout(Date rmLogout) {
        this.rmLogout = rmLogout;
    }

    public String getRmLogoutAddr() {
        return rmLogoutAddr;
    }

    public void setRmLogoutAddr(String rmLogoutAddr) {
        this.rmLogoutAddr = rmLogoutAddr;
    }

    public String getRmUrl() {
        return rmUrl;
    }

    public void setRmUrl(String rmUrl) {
        this.rmUrl = rmUrl;
    }

    public String getRmDescription() {
        return rmDescription;
    }

    public void setRmDescription(String rmDescription) {
        this.rmDescription = rmDescription;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}