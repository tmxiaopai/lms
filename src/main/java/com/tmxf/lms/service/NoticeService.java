package com.tmxf.lms.service;

import com.tmxf.lms.entity.Notice;
import com.tmxf.lms.mapper.NoticeMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * The interface Notice service.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/8 - 23:15
 * @package_name com.tmxf.lms.service
 */
public interface NoticeService {
    /**
     * 查找所有公告
     *
     * @return list
     */
    List<Notice> findAllNotice();
    List<Notice> findWNotice();
    /**
     * 插入公告数据
     *
     * @param notice the notice
     * @return int
     */
    int insertNotice(Notice notice);

    /**
     * 通过公告ID删除公告
     *
     * @param noticeId the notice id
     * @return int
     */
    int deleteByNoticeID(Integer noticeId);
}
