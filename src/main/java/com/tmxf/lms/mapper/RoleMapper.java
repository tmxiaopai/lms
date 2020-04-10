package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Role;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface RoleMapper {
    @Delete({
            "delete from role",
            "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer roleId);

    @Insert({
            "insert into role (role_id, role_num, ",
            "role_name, role_desc, ",
            "role_status, role_create_time, ",
            "role_update_time)",
            "values (#{roleId,jdbcType=INTEGER}, #{roleNum,jdbcType=INTEGER}, ",
            "#{roleName,jdbcType=VARCHAR}, #{roleDesc,jdbcType=VARCHAR}, ",
            "#{roleStatus,jdbcType=BIT}, #{roleCreateTime,jdbcType=TIMESTAMP}, ",
            "#{roleUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Role record);

    @Select({
            "select",
            "role_id, role_num, role_name, role_desc, role_status, role_create_time, role_update_time",
            "from role",
            "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "role_id", property = "roleId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "role_num", property = "roleNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "role_name", property = "roleName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "role_desc", property = "roleDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "role_status", property = "roleStatus", jdbcType = JdbcType.BIT),
            @Result(column = "role_create_time", property = "roleCreateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "role_update_time", property = "roleUpdateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    Role selectByPrimaryKey(Integer roleId);

    @Select({
            "select",
            "role_id, role_num, role_name",
            "from role"
    })
    @Results({
            @Result(column = "role_id", property = "roleId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "role_num", property = "roleNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "role_name", property = "roleName", jdbcType = JdbcType.VARCHAR),
    })
    List<Role> selectAll();

    @Update({
            "update role",
            "set role_num = #{roleNum,jdbcType=INTEGER},",
            "role_name = #{roleName,jdbcType=VARCHAR},",
            "role_desc = #{roleDesc,jdbcType=VARCHAR},",
            "role_status = #{roleStatus,jdbcType=BIT},",
            "role_create_time = #{roleCreateTime,jdbcType=TIMESTAMP},",
            "role_update_time = #{roleUpdateTime,jdbcType=TIMESTAMP}",
            "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Role record);
}