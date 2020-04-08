package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.User;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.context.annotation.Bean;

/**
 * @author TMXIAOPAI
 */
@Mapper
public interface UserMapper {
    /**
     * 查找用户登陆信息
     *
     * @param userNum
     * @return user对象
     */
    @Select({"select user_id,user_num,user_name,user_password,user_salt from user where user_num = #{userNum}"})
    public User findByUserNum(Integer userNum);

    /**
     * @return 返回所有用户信息列表
     */
    @Select({
            "select user_id,user_num,user_name,user_password,user_salt,user_phone,user_email,user_create_time,user_last_login_time,user_update_time,user_status from user"
    })
    List<User> selectAll();

    @Select({"select user_id,user_num,user_name,user_password from user"})
    public List<User> findNote();

    @Insert({"insert into user (user_id,user_num,user_name,user_password,user_salt,user_phone,user_email,user_create_time,user_update_time,user_status)"})
    void insertUser(User user);
}