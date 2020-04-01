package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 销售合同(HtSale)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class HtSale implements Serializable {
    private static final long serialVersionUID = 379011673094617524L;
    /**
     * 销售合同编号
     */
    private String htSaleNum;
    /**
     * 销售合同生效日期
     */
    private Object htSaleStartdate;
    /**
     * 销售合同有效期
     */
    private Object htSaleEnddate;
    /**
     * 质保期
     */
    private Integer htSaleWarranty;
    /**
     * 合同金额
     */
    private Object htSaleMoney;
    /**
     * 合同金额大写
     */
    private String htSaleUpmoney;
    /**
     * 审核状态
     */
    private Object htSaleState;
    /**
     * 所属项目
     */
    private String pNum;
    /**
     * 支付方式
     */
    private String htSalePaystyle;
    /**
     * 定金
     */
    private Object htSaleDingjin;
    /**
     * 定金比例
     */
    private Integer htSaleDingjinRate;
    /**
     * 提货款比例
     */
    private Integer htSaleTihuokuanRate;
    /**
     * 提货款
     */
    private Object htSaleTihuokuan;
    /**
     * 备注
     */
    private String htSaleDesc;
    /**
     * 合同状态
     */
    private Object htSaleIsFinish;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}