package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

/**
 * 项目(Project)实体类
 *
 * @author makejava
 * @since 2020 -04-14 19:33:21
 */
@Getter
@Setter
public class Project implements Serializable {
    private static final long serialVersionUID = -30196765906626506L;
    /**
    * 项目编号
    */
    private String projectNum;
    /**
    * 项目名称
    */
    private String projectName;
    /**
    * 客户名称
    */
    private String customerName;
    /**
    * 客户负责人
    */
    private String customerMan;
    /**
    * 联系方式
    */
    private String customerContact;
    /**
    * 职务
    */
    private String customerJob;
    /**
    * 登记日期
    */
    private Date projectDesignDate;
    /**
    * 项目地址
    */
    private String projectAddress;
    /**
    * 合作意向
    */
    private String projectIntention;
    /**
    * 项目类型
    */
    private String projectType;
    /**
    * 需求数量
    */
    private Integer needCount;
    /**
    * 开户行
    */
    private String bank;
    /**
    * 开户名
    */
    private String bankName;
    /**
    * 卡号
    */
    private String card;
    /**
    * 项目状态
    */
    private String projectStatus;
    /**
    * 销售人员
    */
    private String salesman;
    /**
    * 邮箱
    */
    private String customerEmail;
    /**
    * 备注
    */
    private String pDescription;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}