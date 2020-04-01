package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 询价单(InquirySheet)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class InquirySheet implements Serializable {
    private static final long serialVersionUID = -94483231627362670L;
    /**
     * 询价单编号
     */
    private Integer isId;
    /**
     * 所属项目
     */
    private String isProject;
    /**
     * 安装费
     */
    private Object isInstallM;
    /**
     * 调试费
     */
    private Object isTiaohsiM;
    /**
     * 运输费
     */
    private Object isYunshuM;
    /**
     * 单价
     */
    private Object isDanjai;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}