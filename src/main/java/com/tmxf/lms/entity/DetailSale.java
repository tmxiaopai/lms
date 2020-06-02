package com.tmxf.lms.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The type Detail sale.
 *
 * @author TMXIAOPAI
 */
@Getter
@Setter
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


    /**
     * Instantiates a new Detail sale.
     *
     * @param detailSaleProject      the detail sale project
     * @param detailSaleName         the detail sale name
     * @param detailSalePrice        the detail sale price
     * @param detailSaleCount        the detail sale count
     * @param detailSaleTotal        the detail sale total
     * @param detailSaleStateMoney   the detail sale state money
     * @param detailSaleStateInvoice the detail sale state invoice
     */
    public DetailSale(String detailSaleProject, String detailSaleName, BigDecimal detailSalePrice, Integer detailSaleCount, BigDecimal detailSaleTotal, Boolean detailSaleStateMoney, Boolean detailSaleStateInvoice) {
        this.detailSaleProject = detailSaleProject;
        this.detailSaleName = detailSaleName;
        this.detailSalePrice = detailSalePrice;
        this.detailSaleCount = detailSaleCount;
        this.detailSaleTotal = detailSaleTotal;
        this.detailSaleStateMoney = detailSaleStateMoney;
        this.detailSaleStateInvoice = detailSaleStateInvoice;
    }


    /**
     * Instantiates a new Detail sale.
     */
    public DetailSale() {

    }
}