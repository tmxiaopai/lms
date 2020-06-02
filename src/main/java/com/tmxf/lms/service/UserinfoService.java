package com.tmxf.lms.service;

import com.tmxf.lms.entity.Userinfo;
import java.util.List;

/**
 * (Userinfo)表服务接口
 *
 * @author makejava
 * @since 2020 -04-22 14:56:02
 */
public interface UserinfoService {

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