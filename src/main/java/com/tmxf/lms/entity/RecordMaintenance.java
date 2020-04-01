package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

/**
 * 维保记录(RecordMaintenance)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:27
 */
@Getter
@Setter
public class RecordMaintenance implements Serializable {
    private static final long serialVersionUID = 592365403753409462L;
    /**
     * id
     */
    private Integer rmId;

    private Integer rmLift;
    /**
     * 图片地址
     */
    private String rmUrl;
    /**
     * 维保人员
     */
    private Integer rmUser;
    /**
     * 维保时间
     */
    private Object rmDate;
    /**
     * 维保类型
     */
    private String rmType;
    /**
     * 签到时间
     */
    private Date rmLogin;
    /**
     * 签退时间
     */
    private Date rmLogout;
    /**
     * 签到地点
     */
    private String rmLoginAddr;
    /**
     * 签退地点
     */
    private String rmLogoutAddr;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}