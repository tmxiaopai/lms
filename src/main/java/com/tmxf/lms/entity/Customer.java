package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 客户表(Customer)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class Customer implements Serializable {
    private static final long serialVersionUID = 990750246505987756L;
    /**
     * 客户编号
     */
    private Integer customerNum;
    /**
     * 用户名称
     */
    private String customerName;
    /**
     * 客户电话
     */
    private String customerPhone;
    /**
     * 客户传真
     */
    private String customerPortraition;
    /**
     * 开户行
     */
    private String customerOpenBank;
    /**
     * 银行卡号
     */
    private String customerOpenCard;
    /**
     * 开户名
     */
    private String customerOpenName;
    /**
     * 客户类型
     */
    private Integer customerType;
    /**
     * 客户邮箱
     */
    private String customerEmail;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}