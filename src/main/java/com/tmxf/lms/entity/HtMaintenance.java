package com.tmxf.lms.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The type Ht maintenance.
 * @author TMXIAOPAI
 */
public class HtMaintenance {
    private String htMNum;

    private String pNum;

    private String htMCustomer;

    private Integer htMLiftCount;

    private BigDecimal htMMoney;

    private String htMPayDateStyle;

    private String htMPayStyle;

    private String htMStyle;

    private Date htMStartDate;

    private Date htMEndDate;

    private Date htMSignDate;

    private String htMDesc;

    private Short htMStatus;

    private Integer htMMonth;

    public void setHtMNum(String htMNum) {
        this.htMNum = htMNum;
    }

    public void setpNum(String pNum) {
        this.pNum = pNum;
    }

    public void setHtMCustomer(String htMCustomer) {
        this.htMCustomer = htMCustomer;
    }

    public void setHtMLiftCount(Integer htMLiftCount) {
        this.htMLiftCount = htMLiftCount;
    }

    public void setHtMMoney(BigDecimal htMMoney) {
        this.htMMoney = htMMoney;
    }

    public void setHtMPayDateStyle(String htMPayDateStyle) {
        this.htMPayDateStyle = htMPayDateStyle;
    }

    public void setHtMPayStyle(String htMPayStyle) {
        this.htMPayStyle = htMPayStyle;
    }

    public void setHtMStyle(String htMStyle) {
        this.htMStyle = htMStyle;
    }

    public void setHtMStartDate(Date htMStartDate) {
        this.htMStartDate = htMStartDate;
    }

    public void setHtMEndDate(Date htMEndDate) {
        this.htMEndDate = htMEndDate;
    }

    public void setHtMSignDate(Date htMSignDate) {
        this.htMSignDate = htMSignDate;
    }

    public void setHtMDesc(String htMDesc) {
        this.htMDesc = htMDesc;
    }

    public void setHtMStatus(Short htMStatus) {
        this.htMStatus = htMStatus;
    }

    public void setHtMMonth(Integer htMMonth) {
        this.htMMonth = htMMonth;
    }

    public String getHtMNum() {
        return htMNum;
    }

    public String getpNum() {
        return pNum;
    }

    public String getHtMCustomer() {
        return htMCustomer;
    }

    public Integer getHtMLiftCount() {
        return htMLiftCount;
    }

    public BigDecimal getHtMMoney() {
        return htMMoney;
    }

    public String getHtMPayDateStyle() {
        return htMPayDateStyle;
    }

    public String getHtMPayStyle() {
        return htMPayStyle;
    }

    public String getHtMStyle() {
        return htMStyle;
    }

    public Date getHtMStartDate() {
        return htMStartDate;
    }

    public Date getHtMEndDate() {
        return htMEndDate;
    }

    public Date getHtMSignDate() {
        return htMSignDate;
    }

    public String getHtMDesc() {
        return htMDesc;
    }

    public Short getHtMStatus() {
        return htMStatus;
    }

    public Integer getHtMMonth() {
        return htMMonth;
    }
}