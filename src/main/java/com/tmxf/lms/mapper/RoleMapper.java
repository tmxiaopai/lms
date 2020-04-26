package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Role;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * The interface Role mapper.
 */
@Mapper
public interface RoleMapper {
    /**
     * Delete by primary key int.
     *
     * @param roleId the role id
     * @return the int
     */
    @Delete({
            "delete from role",
            "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer roleId);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    @Insert({
            "insert into role (role_id, role_name, role_desc)",
            "values (#{roleId,jdbcType=INTEGER},  ",
            "#{roleName,jdbcType=VARCHAR}, #{roleDesc,jdbcType=VARCHAR})"
    })
    int insert(Role record);

    /**
     * Select by primary key role.
     *
     * @param roleId the role id
     * @return the role
     */
    @Select({
            "select",
            "role_id, role_name, role_desc",
            "from role",
            "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "role_id", property = "roleId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "role_name", property = "roleName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "role_desc", property = "roleDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "role_status", property = "roleStatus", jdbcType = JdbcType.BIT),
            @Result(column = "role_create_time", property = "roleCreateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "role_update_time", property = "roleUpdateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    Role selectByPrimaryKey(Integer roleId);

    /**
     * Select all list.
     *
     * @return the list
     */
    @Select({
            "select",
            "role_id, role_name",
            "from role"
    })
    @Results({
            @Result(column = "role_id", property = "roleId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "role_name", property = "roleName", jdbcType = JdbcType.VARCHAR),
    })
    List<Role> selectAll();

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    @Update({
            "update role",
            "set role_name = #{roleName,jdbcType=VARCHAR},",
            "role_desc = #{roleDesc,jdbcType=VARCHAR}",
            "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Role record);
}