package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 项目联系人(ProjectContact)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:27
 */
@Getter
@Setter
public class ProjectContact implements Serializable {
    private static final long serialVersionUID = -33812260932742348L;
    /**
     * 联系人编号
     */
    private Integer pContactNum;
    /**
     * 联系人姓名
     */
    private String pContactName;
    /**
     * 联系人职位
     */
    private String pContactJob;
    /**
     * 联系人电话
     */
    private String pContactPhone;
    /**
     * 联系人邮箱
     */
    private String pContactEmail;
    /**
     * 联系人备注
     */
    private String pContactDesc;
    /**
     * 所属项目
     */
    private String pNum;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}