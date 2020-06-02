package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Userinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Userinfo)表数据库访问层
 *
 * @author makejava
 * @since 2020 -04-22 14:56:02
 */
public interface UserinfoMapper {

    /**
     * Delete by id int.
     *
     * @param userNum the user num
     * @return the int
     */
    int deleteById(Integer userNum);

    /**
     * Update int.
     *
     * @param userinfo the userinfo
     * @return the int
     */
    int update(Userinfo userinfo);

    /**
     * Insert int.
     *
     * @param userinfo the userinfo
     * @return the int
     */
    int insert(Userinfo userinfo);

    /**
     * Query all list.
     *
     * @param userinfo the userinfo
     * @return the list
     */
    List<Userinfo> queryAll(Userinfo userinfo);

    /**
     * Query by id userinfo.
     *
     * @param userNum the user num
     * @return the userinfo
     */
    Userinfo queryById(Integer userNum);
}