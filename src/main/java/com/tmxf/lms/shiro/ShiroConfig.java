package com.tmxf.lms.shiro;


import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author TMXIAOPAI
 * @date 2020/3/19 - 13:30
 * @package_name com.tmxf.shiro
 */
@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager defaultWebSecurityManager){
        //定义返回对象
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        //设置SecurityManager，shiro的核心安全接口
        shiroFilterFactoryBean.setSecurityManager( defaultWebSecurityManager);
        Map<String,String> filterMap=new LinkedHashMap<String,String>();
        filterMap.put("/**", "anon");


        //设置登录接口
        shiroFilterFactoryBean.setLoginUrl("/");
        // shiroFilterFactoryBean.setUnauthorizedUrl("/delete");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);

        return shiroFilterFactoryBean;
    }

    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager defaultWebSecurityManager=new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(userRealm);
        return defaultWebSecurityManager;
    }

    @Bean(name = "userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }

    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
