package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Userinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Userinfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-22 14:56:02
 */
public interface UserinfoMapper {

int deleteById(Integer userNum);
int update(Userinfo userinfo);
int insert(Userinfo userinfo);
List<Userinfo> queryAll(Userinfo userinfo);
Userinfo queryById(Integer userNum);
}