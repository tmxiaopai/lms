package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.Permission;
import com.tmxf.lms.entity.User;
import com.tmxf.lms.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * The type Search list controller.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/7 - 21:45
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class SearchListController {
    /**
     * The Logger.
     */
    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private PermissionService permissionService;
    @Resource
    private UserService userService;
    @Resource
    private NoticeService noticeService;
    @Resource
    private AboutRoleService aboutRoleService;

    /**
     * Find all user string.
     *
     * @return the string
     */
    @RequestMapping(value = "/findAllUser", method = RequestMethod.GET)
    public String findAllUser() {
        logger.info("----------查找所有用户信息----------");
        return JSONObject.toJSONString(userService.findAll());
    }

    /**
     * Find nav tree list.
     *
     * @param userNum the user num
     * @return the list
     */
    @RequestMapping(value = "/findNavTree", method = RequestMethod.GET)
    public List<Permission> findNavTree(@RequestParam Integer userNum) {
        logger.info("----------查找菜单树----------");
        return permissionService.findNavTree(userNum, 1);
    }


    /**
     * Find all notice object.
     *
     * @return the object
     */
    @GetMapping("findAllNotice")
    public Object findAllNotice() {
        logger.info("----------查找所有公告信息----------");
        return noticeService.findAllNotice();
    }

    @PostMapping("searchNoticeByContent")
    public String searchNoticeByContent(@RequestBody String content){
        logger.info("传入的查询信息为"+content);
        return JSONObject.toJSONString(noticeService.findNoticeByContent(content));
    }

    /**
     * Find welcome notoce string.
     *
     * @return the string
     */
    @GetMapping("findWelcomeNotice")
    public String findWelcomeNotice(){
        return JSONObject.toJSONString(noticeService.findWNotice());
    }

    /**
     * Find all role object.
     *
     * @return the object
     */
    @GetMapping("findAllRole")
    public Object findAllRole() {
        logger.info("----------查找所有角色信息----------");
        return aboutRoleService.findAllRole();
    }

    /**
     * Search user string.
     *
     * @param user the user
     * @return the string
     */
    @PostMapping("searchUser")
    public String searchUser(@RequestBody User user){
        return JSONObject.toJSONString( userService.queryByUser(user));
    }

    @PostMapping("findMyInfo")
    public String findMyInfo(@RequestBody Integer userNum){
        return JSONObject.toJSONString(userService.findMyInfo(userNum));
    }
}
