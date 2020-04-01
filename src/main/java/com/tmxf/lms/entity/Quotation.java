package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

/**
 * 报价书(Quotation)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:27
 */
@Getter
@Setter
public class Quotation implements Serializable {
    private static final long serialVersionUID = -65629964325007588L;
    /**
     * 报价书编号
     */
    private String quotationNum;
    /**
     * 报价书生效日期
     */
    private Object quotationStartDate;
    /**
     * 报价书有效截止日期
     */
    private Object quotationEndDate;
    /**
     * 报价金额
     */
    private Object quotationMoney;
    /**
     * 报价大写金额
     */
    private String quotationUpMoney;
    /**
     * 报价书状态
     */
    private String quotationState;
    /**
     * 审核人
     */
    private String quotationReviewMan;
    /**
     * 审核时间
     */
    private Date quotationReviewDate;
    /**
     * 报价书创建时间
     */
    private Date quotationCreateDate;
    /**
     * 所属项目
     */
    private String pNum;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}