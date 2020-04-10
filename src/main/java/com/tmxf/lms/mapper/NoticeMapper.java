package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Notice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/4/8 - 23:10
 * @package_name com.tmxf.lms.mapper
 */
@Mapper
public interface NoticeMapper {
    /**
     * 查找所有公告
     *
     * @return
     */
    @Select({
            "select * from notice"
    })
    List<Notice> findAllNotice();

    /**
     * 插入记录
     *
     * @param notice
     * @return
     */
    @Insert({
            "insert into notice (notice_name,notice_content,notice_date,notice_man)",
            " values(#{noticeName,jdbcType=VARCHAR},#{noticeContent,jdbcType=VARCHAR},",
            "#{noticeDate,jdbcType=TIMESTAMP},#{noticeMan,jdbcType=VARCHAR})"
    })
    int insertNotice(Notice notice);

    /**
     * 通过公告ID删除公告
     *
     * @param noticeId
     * @return
     */
    @Delete({
            "delete from notice where notice_id = #{noticeId}"
    })
    int deleteByNoticeId(Integer noticeId);
}
