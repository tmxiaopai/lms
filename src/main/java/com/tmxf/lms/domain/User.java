package com.tmxf.lms.domain;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TMXIAOPAI
 * @date 2020/3/19 - 16:44
 * @package_name com.tmxf.domain
 */
@Getter
@Setter
public class User {
    private int id;
    private String username;
    private String password;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
