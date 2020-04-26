package com.tmxf.lms.service;

import com.tmxf.lms.entity.Userinfo;
import java.util.List;

/**
 * (Userinfo)表服务接口
 *
 * @author makejava
 * @since 2020-04-22 14:56:02
 */
public interface UserinfoService {

    int deleteById(Integer userNum);
    int update(Userinfo userinfo);
    int insert(Userinfo userinfo);
    List<Userinfo> queryAll(Userinfo userinfo);
    Userinfo queryById(Integer userNum);

}