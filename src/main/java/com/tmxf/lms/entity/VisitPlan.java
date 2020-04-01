package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 拜访计划(VisitPlan)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:28
 */
@Getter
@Setter
public class VisitPlan implements Serializable {
    private static final long serialVersionUID = -76054389657095663L;
    /**
     * 拜访计划ID
     */
    private Integer vpId;
    /**
     * 计划拜访时间
     */
    private Object vpDate;
    /**
     * 拜访内容
     */
    private String vpContent;
    /**
     * 拜访人
     */
    private Integer vpUser;
    /**
     * 拜访结果
     */
    private String vpResult;
    /**
     * 项目ID
     */
    private String vpProject;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}