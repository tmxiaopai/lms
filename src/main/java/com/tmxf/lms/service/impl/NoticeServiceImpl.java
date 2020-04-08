package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Notice;
import com.tmxf.lms.mapper.NoticeMapper;
import com.tmxf.lms.service.NoticeService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/4/8 - 23:17
 * @package_name com.tmxf.lms.service.impl
 */
public class NoticeServiceImpl implements NoticeService {
    @Resource
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> findAllNotice() {
        return noticeMapper.findAllNotice();
    }

    @Override
    public int insertNotice(Notice notice) {
        return noticeMapper.insertNotice(notice);
    }
}
