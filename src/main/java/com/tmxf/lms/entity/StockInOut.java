package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * The type Stock in out.
 *
 * @author TMXIAOPAI
 */
@Getter
@Setter
public class StockInOut {
    private Integer sioId;

    private String sioUser;

    private Date sioDate;

    private Short sioType;

    private String stockNum;

    private Integer sioCount;

    private String sioReason;

    private String sioGoMan;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}