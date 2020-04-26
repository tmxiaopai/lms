package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.RolePermission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * The interface Role permission mapper.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/7 - 16:08
 * @package_name com.tmxf.lms.mapper
 */
@Mapper
public interface RolePermissionMapper {
    /**
     * 插入角色权限数据
     *
     * @param rolePermission the role permission
     */
    @Insert({
            "insert into role_permission (role_permission_id,role_id,permission_id) values (#{rolePermissionId,jdbcType=INTEGER},#{roleId,jdbcType=INTEGER},#{permissionId,jdbcType=INTEGER})"
    })
    void insert(RolePermission rolePermission);
}
