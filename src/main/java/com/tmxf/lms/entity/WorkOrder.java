package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

/**
 * 工单(WorkOrder)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:28
 */
@Getter
@Setter
public class WorkOrder implements Serializable {
    private static final long serialVersionUID = 216559551061103850L;
    /**
     * 工单ID
     */
    private Integer woId;
    /**
     * 所属项目
     */
    private String woProject;
    /**
     * 工单类型
     */
    private String woType;
    /**
     * 工单编号
     */
    private String woNum;
    /**
     * 故障日期
     */
    private Object woDate;
    /**
     * 解决人
     */
    private Integer woUser;
    /**
     * 到达时间
     */
    private Date woDateResolve;
    /**
     * 离开时间
     */
    private Date woDateLeave;
    /**
     * 备注
     */
    private String woDesc;
    /**
     * 是否完成
     */
    private Object woState;
    /**
     * 电梯编号
     */
    private String woLiftNum;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}