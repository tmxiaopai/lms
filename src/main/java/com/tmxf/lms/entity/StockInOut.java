package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 出入库记录表(StockInOut)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:27
 */
@Getter
@Setter
public class StockInOut implements Serializable {
    private static final long serialVersionUID = -31573436277235396L;
    /**
     * 记录ID
     */
    private Integer sioId;


    public Integer getSioId() {
        return sioId;
    }

    public void setSioId(Integer sioId) {
        this.sioId = sioId;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}