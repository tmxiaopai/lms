package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Permission;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface PermissionMapper {
    /**
     * 根据用户num查询权限
     *
     * @param userNum
     * @return权限列表
     */
    @Select({
            "select p.* from permission p,user u,user_role ur, role_permission rm",
            "where u.user_num = #{userNum} and u.user_id=ur.user_id and ur.role_id = rm.role_id and rm.permission_id = p.permission_id"
    })
    List<Permission> findByUserNum(Integer userNum);

    /**
     * 查找所有的权限
     *
     * @return权限列表
     */
    @Select({"select * from permission"})
    List<Permission> findAllPermission();

    /**
     * 删除方法
     *
     * @param permissionId
     * @return
     */
    @Delete({
            "delete from permission",
            "where permission_id = #{permissionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer permissionId);

    /**
     * 插入函数
     *
     * @param permission
     * @return
     */
    @Insert({
            "insert into permission (permission_id, permission_num, ",
            "permission_name, permission_desc, ",
            "permission_url, parent_id, ",
            "permission_type, permission_status, ",
            "permission_create_time, permission_update_time,",
            "permission_perms,permission_order_num,permission_icon)",
            "values (#{permissionId,jdbcType=INTEGER}, #{permissionNum,jdbcType=INTEGER}, ",
            "#{permissionName,jdbcType=VARCHAR}, #{permissionDesc,jdbcType=VARCHAR}, ",
            "#{permissionUrl,jdbcType=VARCHAR}, #{parentId,jdbcType=INTEGER}, ",
            "#{permissionType,jdbcType=INTEGER}, #{permissionStatus,jdbcType=BIT}, ",
            "#{permissionCreateTime,jdbcType=TIMESTAMP}, #{permissionUpdateTime,jdbcType=TIMESTAMP},",
            "#{permissionPerms,jdbcType=VARCHAR},#{permissionOrderNum,jdbcType=INTEGER},#{permissionIcon,jdbcType=VARCHAR})"
    })
    int insert(Permission permission);


    @Select({
            "select",
            "permission_id, permission_num, permission_name, permission_desc, permission_url, ",
            "parent_id, permission_type, permission_status, permission_create_time, permission_update_time",
            "from permission",
            "where permission_id = #{permissionId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "permission_id", property = "permissionId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "permission_num", property = "permissionNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "permission_name", property = "permissionName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "permission_desc", property = "permissionDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "permission_url", property = "permissionUrl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "parent_id", property = "parentId", jdbcType = JdbcType.INTEGER),
            @Result(column = "permission_type", property = "permissionType", jdbcType = JdbcType.INTEGER),
            @Result(column = "permission_status", property = "permissionStatus", jdbcType = JdbcType.BIT),
            @Result(column = "permission_create_time", property = "permissionCreateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "permission_update_time", property = "permissionUpdateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    Permission selectByPrimaryKey(Integer permissionId);

    @Select({
            "select",
            "permission_id, permission_num, permission_name, permission_desc, permission_url, ",
            "parent_id, permission_type, permission_status, permission_create_time, permission_update_time",
            "from permission"
    })
    @Results({
            @Result(column = "permission_id", property = "permissionId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "permission_num", property = "permissionNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "permission_name", property = "permissionName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "permission_desc", property = "permissionDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "permission_url", property = "permissionUrl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "parent_id", property = "parentId", jdbcType = JdbcType.INTEGER),
            @Result(column = "permission_type", property = "permissionType", jdbcType = JdbcType.INTEGER),
            @Result(column = "permission_status", property = "permissionStatus", jdbcType = JdbcType.BIT),
            @Result(column = "permission_create_time", property = "permissionCreateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "permission_update_time", property = "permissionUpdateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<Permission> selectAll();

    @Update({
            "update permission",
            "set permission_num = #{permissionNum,jdbcType=INTEGER},",
            "permission_name = #{permissionName,jdbcType=VARCHAR},",
            "permission_desc = #{permissionDesc,jdbcType=VARCHAR},",
            "permission_url = #{permissionUrl,jdbcType=VARCHAR},",
            "parent_id = #{parentId,jdbcType=INTEGER},",
            "permission_type = #{permissionType,jdbcType=INTEGER},",
            "permission_status = #{permissionStatus,jdbcType=BIT},",
            "permission_create_time = #{permissionCreateTime,jdbcType=TIMESTAMP},",
            "permission_update_time = #{permissionUpdateTime,jdbcType=TIMESTAMP}",
            "where permission_id = #{permissionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Permission permission);
}