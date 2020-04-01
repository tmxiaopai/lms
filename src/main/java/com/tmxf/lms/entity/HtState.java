package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 合同状态(HtState)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class HtState implements Serializable {
    private static final long serialVersionUID = -29511994516277890L;
    /**
     * 状态编号
     */
    private Integer htsId;
    /**
     * 进度状态
     */
    private String htsStateDet;
    /**
     * 完成时间
     */
    private Object htsDate;
    /**
     * 进展内容
     */
    private String htsDesc;
    /**
     * 负责人
     */
    private Integer htsUser;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}