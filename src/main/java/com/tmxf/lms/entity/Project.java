package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

/**
 * 项目表(Project)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:27
 */
@Getter
@Setter
public class Project implements Serializable {
    private static final long serialVersionUID = 512868487602047658L;
    /**
     * 项目编号
     */
    private String projectNum;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 项目类型
     */
    private String projectType;
    /**
     * 安装地址
     */
    private String projectAddr;
    /**
     * 所属客户
     */
    private Integer customerNum;
    /**
     * 合作意向
     */
    private String projectCoopIn;
    /**
     * 需求台数
     */
    private Integer projectNeedCount;
    /**
     * 项目备注
     */
    private String projectDesc;
    /**
     * 销售人员
     */
    private Integer projectSaleman;
    /**
     * 项目登记时间
     */
    private Date projectDesignDate;
    /**
     * 项目删除状态
     */
    private boolean projectStatus;

    /**
     * @return 项目字符串信息
     */

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}