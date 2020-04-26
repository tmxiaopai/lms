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
 * The type Shiro config.
 *
 * @author TMXIAOPAI
 * @date 2020 /3/19 - 13:30
 * @package_name com.tmxf.shiro
 */
@Configuration
public class ShiroConfig {
    /**
     * Gets shiro filter factory bean.
     *
     * @param defaultWebSecurityManager the default web security manager
     * @return the shiro filter factory bean
     */
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

    /**
     * Gets default web security manager.
     *
     * @param userRealm the user realm
     * @return the default web security manager
     */
    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager defaultWebSecurityManager=new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(userRealm);
        return defaultWebSecurityManager;
    }

    /**
     * Get realm user realm.
     *
     * @return the user realm
     */
    @Bean(name = "userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }

    /**
     * Get shiro dialect shiro dialect.
     *
     * @return the shiro dialect
     */
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
