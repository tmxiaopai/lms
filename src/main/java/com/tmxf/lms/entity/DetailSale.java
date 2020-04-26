package com.tmxf.lms.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The type Detail sale.
 */
public class DetailSale {
    private String detailSaleNum;

    private Integer detailSaleUser;

    private Date detailSaleDate;

    private BigDecimal detailSaleMoney;

    private String detailSaleProject;

    private String detailSaleName;

    private BigDecimal detailSalePrice;

    private Integer detailSaleCount;

    private BigDecimal detailSaleTotal;

    private String detailSaleInvoice;

    private Boolean detailSaleStateMoney;

    private Boolean detailSaleStateInvoice;

    private Date detailSalePreDate;

    private Date detailSaleOkDate;


    public DetailSale(String detailSaleProject, String detailSaleName, BigDecimal detailSalePrice, Integer detailSaleCount, BigDecimal detailSaleTotal, Boolean detailSaleStateMoney, Boolean detailSaleStateInvoice) {
        this.detailSaleProject = detailSaleProject;
        this.detailSaleName = detailSaleName;
        this.detailSalePrice = detailSalePrice;
        this.detailSaleCount = detailSaleCount;
        this.detailSaleTotal = detailSaleTotal;
        this.detailSaleStateMoney = detailSaleStateMoney;
        this.detailSaleStateInvoice = detailSaleStateInvoice;
    }

    public DetailSale(String detailSaleNum, Integer detailSaleUser, Date detailSaleDate, BigDecimal detailSaleMoney, String detailSaleProject, String detailSaleName, BigDecimal detailSalePrice, Integer detailSaleCount, BigDecimal detailSaleTotal, String detailSaleInvoice, Boolean detailSaleStateMoney, Boolean detailSaleStateInvoice, Date detailSalePreDate, Date detailSaleOkDate) {
        this.detailSaleNum = detailSaleNum;
        this.detailSaleUser = detailSaleUser;
        this.detailSaleDate = detailSaleDate;
        this.detailSaleMoney = detailSaleMoney;
        this.detailSaleProject = detailSaleProject;
        this.detailSaleName = detailSaleName;
        this.detailSalePrice = detailSalePrice;
        this.detailSaleCount = detailSaleCount;
        this.detailSaleTotal = detailSaleTotal;
        this.detailSaleInvoice = detailSaleInvoice;
        this.detailSaleStateMoney = detailSaleStateMoney;
        this.detailSaleStateInvoice = detailSaleStateInvoice;
        this.detailSalePreDate = detailSalePreDate;
        this.detailSaleOkDate = detailSaleOkDate;
    }

    public DetailSale() {

    }

    /**
     * Gets detail sale num.
     *
     * @return the detail sale num
     */
    public String getDetailSaleNum() {
        return detailSaleNum;
    }

    /**
     * Sets detail sale num.
     *
     * @param detailSaleNum the detail sale num
     */
    public void setDetailSaleNum(String detailSaleNum) {
        this.detailSaleNum = detailSaleNum;
    }

    /**
     * Gets detail sale user.
     *
     * @return the detail sale user
     */
    public Integer getDetailSaleUser() {
        return detailSaleUser;
    }

    /**
     * Sets detail sale user.
     *
     * @param detailSaleUser the detail sale user
     */
    public void setDetailSaleUser(Integer detailSaleUser) {
        this.detailSaleUser = detailSaleUser;
    }

    /**
     * Gets detail sale date.
     *
     * @return the detail sale date
     */
    public Date getDetailSaleDate() {
        return detailSaleDate;
    }

    /**
     * Sets detail sale date.
     *
     * @param detailSaleDate the detail sale date
     */
    public void setDetailSaleDate(Date detailSaleDate) {
        this.detailSaleDate = detailSaleDate;
    }

    /**
     * Gets detail sale money.
     *
     * @return the detail sale money
     */
    public BigDecimal getDetailSaleMoney() {
        return detailSaleMoney;
    }

    /**
     * Sets detail sale money.
     *
     * @param detailSaleMoney the detail sale money
     */
    public void setDetailSaleMoney(BigDecimal detailSaleMoney) {
        this.detailSaleMoney = detailSaleMoney;
    }

    /**
     * Gets detail sale project.
     *
     * @return the detail sale project
     */
    public String getDetailSaleProject() {
        return detailSaleProject;
    }

    /**
     * Sets detail sale project.
     *
     * @param detailSaleProject the detail sale project
     */
    public void setDetailSaleProject(String detailSaleProject) {
        this.detailSaleProject = detailSaleProject;
    }

    /**
     * Gets detail sale name.
     *
     * @return the detail sale name
     */
    public String getDetailSaleName() {
        return detailSaleName;
    }

    /**
     * Sets detail sale name.
     *
     * @param detailSaleName the detail sale name
     */
    public void setDetailSaleName(String detailSaleName) {
        this.detailSaleName = detailSaleName;
    }

    /**
     * Gets detail sale price.
     *
     * @return the detail sale price
     */
    public BigDecimal getDetailSalePrice() {
        return detailSalePrice;
    }

    /**
     * Sets detail sale price.
     *
     * @param detailSalePrice the detail sale price
     */
    public void setDetailSalePrice(BigDecimal detailSalePrice) {
        this.detailSalePrice = detailSalePrice;
    }

    /**
     * Gets detail sale count.
     *
     * @return the detail sale count
     */
    public Integer getDetailSaleCount() {
        return detailSaleCount;
    }

    /**
     * Sets detail sale count.
     *
     * @param detailSaleCount the detail sale count
     */
    public void setDetailSaleCount(Integer detailSaleCount) {
        this.detailSaleCount = detailSaleCount;
    }

    /**
     * Gets detail sale total.
     *
     * @return the detail sale total
     */
    public BigDecimal getDetailSaleTotal() {
        return detailSaleTotal;
    }

    /**
     * Sets detail sale total.
     *
     * @param detailSaleTotal the detail sale total
     */
    public void setDetailSaleTotal(BigDecimal detailSaleTotal) {
        this.detailSaleTotal = detailSaleTotal;
    }

    /**
     * Gets detail sale invoice.
     *
     * @return the detail sale invoice
     */
    public String getDetailSaleInvoice() {
        return detailSaleInvoice;
    }

    /**
     * Sets detail sale invoice.
     *
     * @param detailSaleInvoice the detail sale invoice
     */
    public void setDetailSaleInvoice(String detailSaleInvoice) {
        this.detailSaleInvoice = detailSaleInvoice;
    }

    /**
     * Gets detail sale state money.
     *
     * @return the detail sale state money
     */
    public Boolean getDetailSaleStateMoney() {
        return detailSaleStateMoney;
    }

    /**
     * Sets detail sale state money.
     *
     * @param detailSaleStateMoney the detail sale state money
     */
    public void setDetailSaleStateMoney(Boolean detailSaleStateMoney) {
        this.detailSaleStateMoney = detailSaleStateMoney;
    }

    /**
     * Gets detail sale state invoice.
     *
     * @return the detail sale state invoice
     */
    public Boolean getDetailSaleStateInvoice() {
        return detailSaleStateInvoice;
    }

    /**
     * Sets detail sale state invoice.
     *
     * @param detailSaleStateInvoice the detail sale state invoice
     */
    public void setDetailSaleStateInvoice(Boolean detailSaleStateInvoice) {
        this.detailSaleStateInvoice = detailSaleStateInvoice;
    }

    /**
     * Gets detail sale pre date.
     *
     * @return the detail sale pre date
     */
    public Date getDetailSalePreDate() {
        return detailSalePreDate;
    }

    /**
     * Sets detail sale pre date.
     *
     * @param detailSalePreDate the detail sale pre date
     */
    public void setDetailSalePreDate(Date detailSalePreDate) {
        this.detailSalePreDate = detailSalePreDate;
    }

    /**
     * Gets detail sale ok date.
     *
     * @return the detail sale ok date
     */
    public Date getDetailSaleOkDate() {
        return detailSaleOkDate;
    }

    /**
     * Sets detail sale ok date.
     *
     * @param detailSaleOkDate the detail sale ok date
     */
    public void setDetailSaleOkDate(Date detailSaleOkDate) {
        this.detailSaleOkDate = detailSaleOkDate;
    }
}