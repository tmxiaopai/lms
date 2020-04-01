package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 维保合同(HtMaintenance)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class HtMaintenance implements Serializable {
    private static final long serialVersionUID = -96938385060749847L;
    /**
     * 维保合同编号
     */
    private String htMNum;
    /**
     * 所属项目
     */
    private String pNum;
    /**
     * 使用单位
     */
    private String htMCustomer;
    /**
     * 维保电梯数量
     */
    private Integer htMLiftCount;
    /**
     * 合同总金额
     */
    private Object htMMoney;
    /**
     * 结算方式
     */
    private String htMPaydateStyle;
    /**
     * 支付方式
     */
    private String htMPayStyle;
    /**
     * 保养类型
     */
    private String htMStyle;
    /**
     * 合同生效期
     */
    private Object htMStartdate;
    /**
     * 合同结束期
     */
    private Object htMEnddate;
    /**
     * 合同签订日期
     */
    private Object htMSignDate;
    /**
     * 合同备注
     */
    private String htMDesc;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}