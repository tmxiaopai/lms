package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.UserRole;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * The interface User role mapper.
 * @author TMXIAOPAI
 */
@Mapper
public interface UserRoleMapper {
    /**
     * Delete by primary key int.
     *
     * @param userRoleId the user role id
     * @return int int
     */
    @Delete({
            "delete from user_role",
            "where user_role_id = #{userRoleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userRoleId);

    /**
     * Insert int.
     *
     * @param record the record
     * @return int int
     */
    @Insert({
            "insert into user_role ( user_id, ",
            "role_id)",
            "values ( #{userId,jdbcType=INTEGER}, ",
            "#{roleId,jdbcType=INTEGER})"
    })
    int insert(UserRole record);

    /**
     * Select by primary key user role.
     *
     * @param userRoleId the user role id
     * @return user role
     */
    @Select({
            "select",
            "user_role_id, user_id, role_id",
            "from user_role",
            "where user_role_id = #{userRoleId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "user_role_id", property = "userRoleId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
            @Result(column = "role_id", property = "roleId", jdbcType = JdbcType.INTEGER)
    })
    UserRole selectByPrimaryKey(Integer userRoleId);

    /**
     * Select all list.
     *
     * @return list list
     */
    @Select({
            "select",
            "user_role_id, user_id, role_id",
            "from user_role"
    })
    @Results({
            @Result(column = "user_role_id", property = "userRoleId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
            @Result(column = "role_id", property = "roleId", jdbcType = JdbcType.INTEGER)
    })
    List<UserRole> selectAll();

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return int int
     */
    @Update({
            "update user_role",
            "set user_id = #{userId,jdbcType=INTEGER},",
            "role_id = #{roleId,jdbcType=INTEGER}",
            "where user_role_id = #{userRoleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserRole record);

    /**
     * Update by user id int.
     *
     * @param userRole the user role
     * @return int int
     */
    @Update({
            "update user_role",
            "set role_id = #{roleId,jdbcType=INTEGER}",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByUserId(UserRole userRole);

    /**
     * Delete user role int.
     *
     * @param userId the user id
     * @return the int
     */
    @Delete({
            "delete from user_role where user_id = #{userId}"
    })
    int deleteUserRole(Integer userId);

    /**
     * Find user role integer.
     *
     * @param userId the user id
     * @return the integer
     */
    @Select({
            "select role_id from user_role where user_id=#{userId,jdbcType=INTEGER}"
    })
    Integer findUserRole(Integer userId);
}