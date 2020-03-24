package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.domain.User;
import com.tmxf.lms.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author TMXIAOPAI
 * @date 2020/3/19 - 15:48
 * @package_name com.tmxf.controller
 */
@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String login(){
        System.out.println("进入登录页面");
        return "/login/login";
    }
    @RequestMapping("/home")
    public User home(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8001");
        System.out.println("进入主页");
        User u=new User();
        u.setId(1);
        u.setPassword("weq");
        u.setUsername("zaaaaaaaa");

        return u;
    }
    @RequestMapping("/add")
    public String addUser(){
        System.out.println("进入添加页面");
        return "/login/add";
    }
    @RequestMapping("/delete")
    public String delete(){
        System.out.println("进入删除页面");
        return "/login/delete";
    }
    @CrossOrigin
    @RequestMapping("/logg")
    public String realLogin(@RequestBody User user, HttpServletRequest request, HttpServletResponse response){
        //response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
        System.out.println("开始判断逻辑");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(),user.getPassword());
        System.out.println("controller中的token数据"+token.getUsername()+token.getPassword());
        Map<String,String> map =new HashMap<String,String>();
        try {
            subject.login(token);
        }catch (UnknownAccountException e){
            map.put("msg","用户名不存在");
            return JSONObject.toJSONString(map);
        }catch (IncorrectCredentialsException e){
            map.put("msg","密码不正确");
            return JSONObject.toJSONString(map);
        }catch(AuthenticationException e){
            //e.printStackTrace();
            map.put("msg","出现错误");
            return JSONObject.toJSONString(map);
        }
        map.put("loginState","true");
        return JSONObject.toJSONString(map);
    }
}
