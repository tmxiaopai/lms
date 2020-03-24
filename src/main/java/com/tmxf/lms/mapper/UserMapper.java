package com.tmxf.lms.mapper;


import com.tmxf.lms.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author TMXIAOPAI
 * @date 2020/3/19 - 16:47
 * @package_name com.tmxf.mapper
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{value}")
    public User findByName(String username);
    @Select("select * from user where id = #{value}")
    public User findById(int id);
}
