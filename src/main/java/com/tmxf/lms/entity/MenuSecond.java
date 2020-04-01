package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 二级菜单(MenuSecond)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class MenuSecond implements Serializable {
    private static final long serialVersionUID = 907989198212047678L;
    /**
     * 二级菜单编号
     */
    private Integer smNum;
    /**
     * 二级菜单名称
     */
    private String smName;
    /**
     * 所属一级菜单
     */
    private Integer fmNum;


    public Integer getSmNum() {
        return smNum;
    }

    public void setSmNum(Integer smNum) {
        this.smNum = smNum;
    }

    public String getSmName() {
        return smName;
    }

    public void setSmName(String smName) {
        this.smName = smName;
    }

    public Integer getFmNum() {
        return fmNum;
    }

    public void setFmNum(Integer fmNum) {
        this.fmNum = fmNum;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}