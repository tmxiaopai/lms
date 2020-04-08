package com.tmxf.lms.shiro;

import com.tmxf.lms.entity.User;
import com.tmxf.lms.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

/**
 * @author TMXIAOPAI
 * @date 2020/3/19 - 13:32
 * @package_name com.tmxf.shiro
 */
public class UserRealm extends AuthorizingRealm {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        User user1 = userService.findUserLoginInfoByUserNum(user.getUserNum());
        simpleAuthorizationInfo.addStringPermission("");
        simpleAuthorizationInfo.addStringPermission("user:add");
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // AuthenticationInfo authenticationInfo=new AuthenticationInfo();
        UsernamePasswordToken token1 = (UsernamePasswordToken) token;
        User user = userService.findUserLoginInfoByUserNum(Integer.parseInt(token1.getUsername()));
        if (user == null) {
            logger.info("UserRealm中查询用户为空");
            throw new UnknownAccountException();
        }
        logger.info("UserRealm中的用户信息为：" + user.toString());
        return new SimpleAuthenticationInfo("user", user.getUserPassword(), "");
    }
}
