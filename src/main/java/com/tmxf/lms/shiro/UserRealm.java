package com.tmxf.lms.shiro;


import com.tmxf.lms.domain.User;
import com.tmxf.lms.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author TMXIAOPAI
 * @date 2020/3/19 - 13:32
 * @package_name com.tmxf.shiro
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        User user1 = userService.findById(user.getId());
        simpleAuthorizationInfo.addStringPermission("");
        simpleAuthorizationInfo.addStringPermission("user:add");
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // AuthenticationInfo authenticationInfo=new AuthenticationInfo();
        UsernamePasswordToken token1 = (UsernamePasswordToken) token;
        System.out.println("Realm中token中的数据");
        System.out.println(token1.getUsername());
        System.out.println(token1.getPassword());
        User user = userService.findByName(token1.getUsername());
        System.out.println("Realm中service查询的数据" + user);
        if (user == null) {
            System.out.println("user为空");
            throw new UnknownAccountException();
        }
        System.out.println("user不为空");
        System.out.println(user.toString());
        return new SimpleAuthenticationInfo("user", user.getPassword(), "");
    }
}
