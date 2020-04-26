package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * The type Visit.
 */
@Getter
@Setter
public class Visit {
    private Integer visitId;

    private String pNum;

    private String sendMan;

    private Date visitDate;

    private String receiveMan;

    private String content;

    private String result;

    private String degree;

    private String mans;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}