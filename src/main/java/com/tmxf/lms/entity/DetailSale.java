package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 销售详情(DetailSale)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class DetailSale implements Serializable {
    private static final long serialVersionUID = 636444733498106366L;
    /**
     * 详情ID
     */
    private Integer detailSaleId;
    /**
     * 金额
     */
    private Object detailSaleMoney;
    /**
     * 款项名称
     */
    private String detailSaleName;
    /**
     * 使用时间
     */
    private Object detailSaleDate;
    /**
     * 项目ID
     */
    private String detailSaleProject;
    /**
     * 单价
     */
    private Object detailSalePrice;
    /**
     * 数量
     */
    private Integer detailSaleCount;
    /**
     * 发票
     */
    private Integer detailSaleInvoice;
    /**
     * 经手人
     */
    private Integer detailSaleUser;
    /**
     * 收款状态
     */
    private Object detailSaleStateMoney;
    /**
     * 发票状态
     */
    private Object detailSaleStateInvoic;
    /**
     * 首款完成时间
     */
    private Object detailSaleOkDate;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}