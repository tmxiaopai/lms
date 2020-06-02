package com.tmxf.lms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 报价书(Quotation)实体类
 *
 * @author makejava
 * @since 2020-05-25 03:32:50
 */
public class Quotation implements Serializable {
    private static final long serialVersionUID = 377016147923968110L;
    /**
    * 报价书编号
    */
    private String qNum;
    
    private Double qPrice;
    /**
    * 报价书登记日期
    */
    private Date qDate;
    /**
    * 生效期
    */
    private Date qStart;
    /**
    * 失效日期
    */
    private Date qEnd;
    /**
    * 安装周期
    */
    private Integer qInstallDate;
    
    private String qProject;
    
    private String qDescription;


    public String getQNum() {
        return qNum;
    }

    public void setQNum(String qNum) {
        this.qNum = qNum;
    }

    public Double getQPrice() {
        return qPrice;
    }

    public void setQPrice(Double qPrice) {
        this.qPrice = qPrice;
    }

    public Date getQDate() {
        return qDate;
    }

    public void setQDate(Date qDate) {
        this.qDate = qDate;
    }

    public Date getQStart() {
        return qStart;
    }

    public void setQStart(Date qStart) {
        this.qStart = qStart;
    }

    public Date getQEnd() {
        return qEnd;
    }

    public void setQEnd(Date qEnd) {
        this.qEnd = qEnd;
    }

    public Integer getQInstallDate() {
        return qInstallDate;
    }

    public void setQInstallDate(Integer qInstallDate) {
        this.qInstallDate = qInstallDate;
    }

    public String getQProject() {
        return qProject;
    }

    public void setQProject(String qProject) {
        this.qProject = qProject;
    }

    public String getQDescription() {
        return qDescription;
    }

    public void setQDescription(String qDescription) {
        this.qDescription = qDescription;
    }

}