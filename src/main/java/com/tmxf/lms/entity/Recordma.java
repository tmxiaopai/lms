package com.tmxf.lms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Recordma)实体类
 *
 * @author makejava
 * @since 2020 -04-23 21:45:08
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


    /**
     * Gets factory num.
     *
     * @return the factory num
     */
    public String getFactoryNum() {
        return factoryNum;
    }

    /**
     * Sets factory num.
     *
     * @param factoryNum the factory num
     */
    public void setFactoryNum(String factoryNum) {
        this.factoryNum = factoryNum;
    }

    /**
     * Gets project num.
     *
     * @return the project num
     */
    public String getProjectNum() {
        return projectNum;
    }

    /**
     * Sets project num.
     *
     * @param projectNum the project num
     */
    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum;
    }

    /**
     * Gets customer name.
     *
     * @return the customer name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets customer name.
     *
     * @param customerName the customer name
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Gets project address.
     *
     * @return the project address
     */
    public String getProjectAddress() {
        return projectAddress;
    }

    /**
     * Sets project address.
     *
     * @param projectAddress the project address
     */
    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    /**
     * Gets rm id.
     *
     * @return the rm id
     */
    public Integer getRmId() {
        return rmId;
    }

    /**
     * Sets rm id.
     *
     * @param rmId the rm id
     */
    public void setRmId(Integer rmId) {
        this.rmId = rmId;
    }

    /**
     * Gets rm lift.
     *
     * @return the rm lift
     */
    public Integer getRmLift() {
        return rmLift;
    }

    /**
     * Sets rm lift.
     *
     * @param rmLift the rm lift
     */
    public void setRmLift(Integer rmLift) {
        this.rmLift = rmLift;
    }

    /**
     * Gets rm date.
     *
     * @return the rm date
     */
    public Date getRmDate() {
        return rmDate;
    }

    /**
     * Sets rm date.
     *
     * @param rmDate the rm date
     */
    public void setRmDate(Date rmDate) {
        this.rmDate = rmDate;
    }

    /**
     * Gets rm type.
     *
     * @return the rm type
     */
    public String getRmType() {
        return rmType;
    }

    /**
     * Sets rm type.
     *
     * @param rmType the rm type
     */
    public void setRmType(String rmType) {
        this.rmType = rmType;
    }

    /**
     * Gets rm user.
     *
     * @return the rm user
     */
    public String getRmUser() {
        return rmUser;
    }

    /**
     * Sets rm user.
     *
     * @param rmUser the rm user
     */
    public void setRmUser(String rmUser) {
        this.rmUser = rmUser;
    }

    /**
     * Gets rm login.
     *
     * @return the rm login
     */
    public Date getRmLogin() {
        return rmLogin;
    }

    /**
     * Sets rm login.
     *
     * @param rmLogin the rm login
     */
    public void setRmLogin(Date rmLogin) {
        this.rmLogin = rmLogin;
    }

    /**
     * Gets rm login addr.
     *
     * @return the rm login addr
     */
    public String getRmLoginAddr() {
        return rmLoginAddr;
    }

    /**
     * Sets rm login addr.
     *
     * @param rmLoginAddr the rm login addr
     */
    public void setRmLoginAddr(String rmLoginAddr) {
        this.rmLoginAddr = rmLoginAddr;
    }

    /**
     * Gets rm logout.
     *
     * @return the rm logout
     */
    public Date getRmLogout() {
        return rmLogout;
    }

    /**
     * Sets rm logout.
     *
     * @param rmLogout the rm logout
     */
    public void setRmLogout(Date rmLogout) {
        this.rmLogout = rmLogout;
    }

    /**
     * Gets rm logout addr.
     *
     * @return the rm logout addr
     */
    public String getRmLogoutAddr() {
        return rmLogoutAddr;
    }

    /**
     * Sets rm logout addr.
     *
     * @param rmLogoutAddr the rm logout addr
     */
    public void setRmLogoutAddr(String rmLogoutAddr) {
        this.rmLogoutAddr = rmLogoutAddr;
    }

    /**
     * Gets rm url.
     *
     * @return the rm url
     */
    public String getRmUrl() {
        return rmUrl;
    }

    /**
     * Sets rm url.
     *
     * @param rmUrl the rm url
     */
    public void setRmUrl(String rmUrl) {
        this.rmUrl = rmUrl;
    }

    /**
     * Gets rm description.
     *
     * @return the rm description
     */
    public String getRmDescription() {
        return rmDescription;
    }

    /**
     * Sets rm description.
     *
     * @param rmDescription the rm description
     */
    public void setRmDescription(String rmDescription) {
        this.rmDescription = rmDescription;
    }

    /**
     * Gets project name.
     *
     * @return the project name
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets project name.
     *
     * @param projectName the project name
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}