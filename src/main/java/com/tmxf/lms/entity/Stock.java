package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 库存表(Stock)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:27
 */
@Getter
@Setter
public class Stock implements Serializable {
    private static final long serialVersionUID = -50454831164763622L;

    private Integer stockId;
    /**
     * 工具名称
     */
    private String stockName;
    /**
     * 数量
     */
    private Integer stockCount;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}