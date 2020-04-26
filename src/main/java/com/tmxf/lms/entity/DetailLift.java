package com.tmxf.lms.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The type Detail lift.
 */
@Getter
@Setter
public class DetailLift {
    private Integer id;

    private String type;

    private String cz;

    private Float speed;

    private Integer deadWeight;

    private BigDecimal unitPrice;

    private String factoryNum;

    private BigDecimal installUnitPrice;

    private BigDecimal liftInstall;

    private BigDecimal liftTs;

    private BigDecimal total;

    private Integer deviceCount;

    private BigDecimal subTotal;

    private String liftDescription;

    private String installStatus;

    private Date checkYearDate;

    private String projectNum;

}