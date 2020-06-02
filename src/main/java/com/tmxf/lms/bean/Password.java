package com.tmxf.lms.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author TMXIAOPAI
 * @date 2020/5/20 - 11:14
 * @package_name com.tmxf.lms.bean
 */
@Getter
@Setter
public class Password {
    private String oldPassword;
    private String newPassword;
    private String confirmPassword;
}
