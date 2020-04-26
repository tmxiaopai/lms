package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Notice;
import com.tmxf.lms.mapper.NoticeMapper;
import com.tmxf.lms.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * The type Notice service.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/8 - 23:17
 * @package_name com.tmxf.lms.service.impl
 */
@Service
public class NoticeServiceImpl implements NoticeService {
    @Resource
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> findAllNotice() {
        return noticeMapper.findAllNotice();
    }

    @Override
    public List<Notice> findWNotice() {
        return noticeMapper.findWNotice();
    }

    @Override
    public int insertNotice(Notice notice) {
        return noticeMapper.insertNotice(notice);
    }

    @Override
    public int deleteByNoticeID(Integer noticeId) {
        return noticeMapper.deleteByNoticeId(noticeId);
    }
}
