package com.tmxf.lms.bean;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

/**
 * @author TMXIAOPAI
 * @date 2020/4/2 - 22:01
 * @package_name com.tmxf.lms.bean
 */
@Getter
@Setter
public class LoginForm {
    private Integer userNum;
    private String password;
    private String captcha;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
