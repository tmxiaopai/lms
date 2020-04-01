package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 发票(Invoice)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class Invoice implements Serializable {
    private static final long serialVersionUID = 255570063590317602L;
    /**
     * 发票编号
     */
    private String invoiceId;
    /**
     * 发票金额
     */
    private Object invoiceMoney;
    /**
     * 经手人
     */
    private Integer invoiceUser;
    /**
     * 大写
     */
    private String invoiceMoneyUpper;
    /**
     * 公司
     */
    private String invoiceCompany;
    /**
     * 纳税人号
     */
    private String invoiceNum;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}