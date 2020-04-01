package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 更换申请(ApplicationPj)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:23
 */
@Getter
@Setter
public class ApplicationPj implements Serializable {
    private static final long serialVersionUID = 700525289806934535L;

    private Integer apId;
    /**
     * 配件名称
     */
    private String apName;
    /**
     * 配件数量
     */
    private Integer apCount;
    /**
     * 所属电梯
     */
    private String apLift;
    /**
     * 状态//审核通过，到货，
     */
    private String apState;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}