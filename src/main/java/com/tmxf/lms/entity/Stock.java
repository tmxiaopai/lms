package com.tmxf.lms.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * The type Stock.
 *
 * @author TMXIAOPAI
 */
@Setter
@Getter
public class Stock {
    private String sName;

    private String sType;

    private Integer sCount;

    private String sNum;

    private String sSpece;

    private BigDecimal sUnitPrice;

    private Integer sIn;

    private Integer sOut;

}