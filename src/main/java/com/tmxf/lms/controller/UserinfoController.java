package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.Userinfo;
import com.tmxf.lms.service.UserinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Userinfo)表控制层
 *
 * @author makejava
 * @since 2020 -04-22 14:56:02
 */
@RestController
public class UserinfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserinfoService userinfoService;

    /**
     * Insert int.
     *
     * @param userinfo the userinfo
     * @return the int
     */
//int deleteById(Integer userNum){}
    //int update(Userinfo userinfo){}
    @PostMapping("insertUserInfo")
    int insert(@RequestBody  Userinfo userinfo){
        return userinfoService.insert(userinfo);
    }

    /**
     * Query all list.
     *
     * @param userinfo the userinfo
     * @return the list
     */
    @GetMapping("findAllUserInfo")
    List<Userinfo> queryAll(Userinfo userinfo){
return userinfoService.queryAll(null);
    }
    //Userinfo queryById(Integer userNum){}
}