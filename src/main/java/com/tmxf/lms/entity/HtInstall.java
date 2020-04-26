package com.tmxf.lms.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The type Ht install.
 *
 * @author TMXIAOPAI
 */
@Getter
@Setter
public class HtInstall {
    private String htInstallNum;

    private String pNum;

    private Date htInstallDate;

    private Integer htInstallLiftCount;

    private Date htInstallStartDate;

    private Date htInstallEndDate;

    private String htInstallLiftCompany;

    private BigDecimal htInstallMoney;

    private Boolean htInstallState;

    private Integer htInstallFirstRate;

    private Integer htInstallSecondRate;

    private Integer htInstallThirdRate;

    private BigDecimal htInstallFirstM;

    private BigDecimal htInstallSecondM;

    private BigDecimal htInstallThirdM;

    private String htInstallDesc;

    private Boolean htInstallFirstReady;

    private Boolean htInstallSecondReady;

    private Boolean htInstallThirdReady;

    private Integer htInstallZhibaoqi;

    private Date htInstallFinishDate;

    private Integer htInstallPlanDate;

    private String htInstallMan;

    private String htInstallPhone;

    private String htInstallAddr;

    private String htInstallYiMan;


}