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
    User findByUserNum(Integer userNum);

    /**
     * 根据工号查找用户ID
     *
     * @param userNum
     * @return
     */
    @Select({
            "select user_id from user where user_num =#{userNum,jdbcType=INTEGER}"
    })
    int findUserIdByUserNum(Integer userNum);

    /**
     * 查找所有用户
     *
     * @return 返回所有用户信息列表
     */
    @Select({
            "select user_id,user_num,user_name,user_password,user_salt,user_phone,user_email,user_create_time,user_last_login_time,user_update_time,user_status from user"
    })
    List<User> selectAll();

    @Select({"select user_id,user_num,user_name,user_password from user"})
    List<User> findNote();

    @Insert({
            "insert into user (user_id,user_num,user_name,user_password,user_salt,user_phone,user_email,user_create_time,user_last_login_time,user_update_time,user_status)",
            "values(#{userId,jdbcType=INTEGER},#{userNum,jdbcType=INTEGER},#{userName,jdbcType=VARCHAR},#{userPassword,jdbcType=VARCHAR},#{userSalt,jdbcType=VARCHAR},#{userPhone,jdbcType=VARCHAR},#{userEmail,jdbcType=VARCHAR},",
            "#{userCreateTime,jdbcType=TIMESTAMP},#{userLastLoginTime,jdbcType=TIMESTAMP},#{userUpdateTime,jdbcType=TIMESTAMP},#{userStatus,jdbcType=BOOLEAN})"
    })
    int insertUser(User user);

    /**
     * 更新user信息
     *
     * @param user
     * @return
     */
    @Update({
            "update user set user_name=#{userName,jdbcType=VARCHAR},",
            "user_password=#{userPassword,jdbcType=VARCHAR},",
            "user_phone=#{userPhone,jdbcType=VARCHAR},user_email=#{userEmail,jdbcType=VARCHAR},",
            "user_update_time=#{userUpdateTime,jdbcType=TIMESTAMP}",
            "where user_id =#{userId,jdbcType=INTEGER}"

    })
    int updateUserBuPrimaryKey(User user);

    @Delete({
            "delete from user where user_id = #{userId}"
    })
    int deleteUser(Integer userId);
}