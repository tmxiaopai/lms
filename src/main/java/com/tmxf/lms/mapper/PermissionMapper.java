package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Permission;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 权限表(Permission)表数据库访问层
 *
 * @author makejava
 * @since 2020 -04-18 15:33:33
 */
public interface PermissionMapper {
    /**
     * 根据用户num查询权限
     *
     * @param userNum the user num
     * @return the list
     * @return权限列表
     */
    List<Permission> findByUserNum(Integer userNum);

    /**
     * 通过ID查询单条数据
     *
     * @param permissionId 主键
     * @return 实例对象 permission
     */
    Permission queryById(Integer permissionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<Permission> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param permission 实例对象
     * @return 对象列表 list
     */
    List<Permission> queryAll(Permission permission);

    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 影响行数 int
     */
    int insert(Permission permission);

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 影响行数 int
     */
    int update(Permission permission);

    /**
     * 通过主键删除数据
     *
     * @param permissionId 主键
     * @return 影响行数 int
     */
    int deleteById(Integer permissionId);

}