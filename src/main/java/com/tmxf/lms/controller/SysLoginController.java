package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.tmxf.lms.bean.LoginForm;
import com.tmxf.lms.entity.User;
import com.tmxf.lms.service.AboutRoleService;
import com.tmxf.lms.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Sys login controller.
 *
 * @author TMXIAOPAI
 * @date 2020 /3/30 - 23:56
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class SysLoginController {
    /**
     * The Logger.
     */
    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private Producer producer;

    @Resource
    private UserService userService;

    @Resource
    private AboutRoleService aboutRoleService;

    /**
     * Captcha.
     *
     * @param response the response
     * @param request  the request
     * @throws IOException the io exception
     */
    @GetMapping("captcha.jpg")
    public void captcha(HttpServletResponse response, HttpServletRequest request) throws IOException {
        logger.info("----------获取验证码----------");
        response.setHeader("Cache-Control", "np-store,no-cache");
        response.setContentType("image/jpeg");
        String text = producer.createText();
        logger.info("获取的验证码为" + text);
        BufferedImage image = producer.createImage(text);
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(image, "jpg", outputStream);
        IOUtils.closeQuietly(outputStream);
    }

    /**
     * Do login object.
     *
     * @param loginForm the login form
     * @param request   the request
     * @return the object
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Object doLogin(@RequestBody LoginForm loginForm, HttpServletRequest request) {
        logger.info("----------登录逻辑----------");
        Subject subject = SecurityUtils.getSubject();
        String password = userService.encodingPassword(loginForm.getPassword(), loginForm.getUserNum());
        UsernamePasswordToken token = new UsernamePasswordToken(String.valueOf(loginForm.getUserNum()), password);
        logger.info("登录信息为:" + loginForm.toString());
        String captchaConfirm = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        Map<String, Object> map = new HashMap<>();
        if (captchaConfirm == null) {
            map.put("msg", "验证码无效");
            return map;
        }
        if (!loginForm.getCaptcha().equals(captchaConfirm)) {
            map.put("msg", "验证码输入错误");
            return map;
        }
        try {
            subject.login(token);
            userService.updateLoginTime(loginForm.getUserNum());
        } catch (UnknownAccountException e) {
            map.put("msg", "该用户不存在");
            return map;
        } catch (IncorrectCredentialsException e) {
            map.put("msg", "密码不正确");
            return map;
        } catch (AuthenticationException e) {
            map.put("msg", "出现错误");
            return map;
        }
        User user = userService.findUserLoginInfoByUserNum(loginForm.getUserNum());
        logger.info("登录时查询的用户信息为：" + user.toString());
        request.getSession().setAttribute("userName", user.getUserName());
        request.getSession().setAttribute("userNum", user.getUserNum());
        Integer role = aboutRoleService.findUserRole(user.getUserNum());
        map.put("role", role);
        map.put("user", user);
        map.put("token", token);
        map.put("msg", "登录成功");
        return map;
    }

    /**
     * 退出
     */
    @RequestMapping("/logout")
    public void logout(){
        Subject subject=SecurityUtils.getSubject();
        subject.logout();
    }
}
