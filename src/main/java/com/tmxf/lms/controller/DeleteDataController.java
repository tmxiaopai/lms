package com.tmxf.lms.controller;

import com.tmxf.lms.service.AboutRoleService;
import com.tmxf.lms.service.NoticeService;
import com.tmxf.lms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * The type Delete data controller.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/8 - 21:34
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class DeleteDataController {
    /**
     * The Logger.
     */
    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private NoticeService noticeService;
    @Resource
    private AboutRoleService aboutRoleService;
    @Resource
    private UserService userService;


    /**
     * Delete notice object.
     *
     * @param noticeId the notice id
     * @return the object
     */
    @PostMapping("deleteNotice")
    public Object deleteNotice(@RequestBody Integer noticeId) {
        logger.info("----------删除公告信息----------");
        if (noticeId != null) {
            noticeService.deleteByNoticeID(noticeId);
            return true;
        }
        return false;
    }

    /**
     * Delete user object.
     *
     * @param userId the user id
     * @return the object
     */
    @PostMapping("deleteUser")
    public Object deleteUser(@RequestBody Integer userId) {
        if (userId != null) {
            aboutRoleService.deleteUserRole(userId);
            userService.deleteUser(userId);
            return "删除成功";
        }
        return "删除失败";
    }
}
