package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.User;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.context.annotation.Bean;

/**
 * The interface User mapper.
 *
 * @author TMXIAOPAI
 */
@Mapper
public interface UserMapper {
    /**
     * 查找用户登陆信息
     *
     * @param userNum the user num
     * @return user对象 user
     */
    @Select({"select user_num,user_name,user_password from user where user_num = #{userNum}"})
    User findByUserNum(Integer userNum);

    /**
     * 查找所有用户
     *
     * @return 返回所有用户信息列表 list
     */
    @Select({
            "select user_num,role_name,user_name,user_password,user_phone,user_email,user_create_time,user_last_login_time from user"
    })
    List<User> selectAll();

    /**
     * 更新user信息
     *
     * @param user the user
     * @return int
     */
    @Update({
            "update user set user_password=#{userPassword,jdbcType=VARCHAR},user_name=#{userName,jdbcType=VARCHAR},",
            "user_phone=#{userPhone,jdbcType=VARCHAR},user_email=#{userEmail,jdbcType=VARCHAR}",
            "where user_num =#{userNum,jdbcType=INTEGER}"

    })
    int updateUserBuPrimaryKey(User user);

    /**
     * Delete user int.
     *
     * @param userNum the user num
     * @return the int
     */
    @Delete({
            "delete from user where user_num = #{userNum}"
    })
    int deleteUser(Integer userNum);

    /**
     * Update login time int.
     *
     * @param userNum   the user num
     * @param loginTime the login time
     * @return the int
     */
    @Update({
            "update user set user_last_login_time = #{loginTime,jdbcType=TIMESTAMP} where user_num=#{userNum,jdbcType=INTEGER}"
    })
    int updateLoginTime(Integer userNum, Date loginTime);

    /**
     * 通过ID查询单条数据
     *
     * @param userNum 主键
     * @return 实例对象 user
     */
    User queryById(Integer userNum);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表 list
     */
    List<User> queryAll(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数 int
     */
    int insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数 int
     */
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param userNum 主键
     * @return 影响行数 int
     */
    int deleteById(Integer userNum);

}