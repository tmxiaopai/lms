package com.tmxf.lms.bean;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

/**
 * The type User role form.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/10 - 15:02
 * @package_name com.tmxf.lms.bean
 */
@Getter
@Setter
public class UserRoleForm {
    private int userNum;
    private int roleId;
    private int userId;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
