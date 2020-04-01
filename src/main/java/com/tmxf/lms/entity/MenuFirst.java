package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 一级菜单(MenuFirst)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class MenuFirst implements Serializable {
    private static final long serialVersionUID = -72785308995183427L;

    private Integer fmNum;

    private String fmName;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}