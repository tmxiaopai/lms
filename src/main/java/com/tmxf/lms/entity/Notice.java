package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author TMXIAOPAI
 * @date 2020/4/8 - 23:07
 * @package_name com.tmxf.lms.entity
 */
@Getter
@Setter
public class Notice {
    /**
     * 公告ID
     */
    private Integer noticeId;
    /**
     * 公告名称
     */
    private String noticeName;
    /**
     * 公告内容
     */
    private String noticeContent;
    /**
     * 公告发布时间
     */
    private Date noticeDate;
    /**
     * 公告发布人
     */
    private String nticeMan;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
