package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.UserRole;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface UserRoleMapper {
    /**
     * @param userRoleId
     * @return
     */
    @Delete({
            "delete from user_role",
            "where user_role_id = #{userRoleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userRoleId);

    /**
     * @param record
     * @return
     */
    @Insert({
            "insert into user_role (user_role_id, user_id, ",
            "role_id)",
            "values (#{userRoleId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
            "#{roleId,jdbcType=INTEGER})"
    })
    int insert(UserRole record);

    /**
     * @param userRoleId
     * @return
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
     * @return
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
     * @param record
     * @return
     */
    @Update({
            "update user_role",
            "set user_id = #{userId,jdbcType=INTEGER},",
            "role_id = #{roleId,jdbcType=INTEGER}",
            "where user_role_id = #{userRoleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserRole record);

    /**
     * @param userRole
     * @return
     */
    @Update({
            "update user_role",
            "set role_id = #{roleId,jdbcType=INTEGER}",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByUserId(UserRole userRole);

    @Delete({
            "delete from user_role where user_id = #{userId}"
    })
    int deleteUserRole(Integer userId);
}