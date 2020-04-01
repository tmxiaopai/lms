package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 故障表(Fault)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class Fault implements Serializable {
    private static final long serialVersionUID = 373633884770326924L;
    /**
     * 故障编号
     */
    private Integer faultId;
    /**
     * 故障信息
     */
    private String faultDesc;
    /**
     * 故障电梯
     */
    private String faultLift;
    /**
     * 故障时间
     */
    private Object faultTime;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}