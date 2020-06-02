package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Userinfo;
import com.tmxf.lms.mapper.UserinfoMapper;
import com.tmxf.lms.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Userinfo)表服务实现类
 *
 * @author makejava
 * @since 2020 -04-22 14:56:02
 */
@Service("userinfoService")
public class UserinfoServiceImpl implements UserinfoService {
    @Resource
    private UserinfoMapper userinfoMapper;


    @Override
    public int deleteById(Integer userNum) {
        return userinfoMapper.deleteById(userNum);
    }

    @Override
    public int update(Userinfo userinfo) {
        return userinfoMapper.update(userinfo);
    }

    @Override
    public int insert(Userinfo userinfo) {
        return userinfoMapper.insert(userinfo);
    }

    @Override
    public List<Userinfo> queryAll(Userinfo userinfo) {
        return userinfoMapper.queryAll(userinfo);
    }

    @Override
    public Userinfo queryById(Integer userNum) {
        return userinfoMapper.queryById(userNum);
    }
}