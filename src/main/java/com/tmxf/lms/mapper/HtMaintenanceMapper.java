package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.HtMaintenance;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 维保合同(HtMaintenance)表数据库访问层
 *
 * @author makejava
 * @since 2020 -04-17 16:20:42
 */
public interface HtMaintenanceMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param htMNum 主键
     * @return 实例对象 ht maintenance
     */
    HtMaintenance queryById(String htMNum);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<HtMaintenance> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param htMaintenance 实例对象
     * @return 对象列表 list
     */
    List<HtMaintenance> queryAll(HtMaintenance htMaintenance);

    /**
     * 新增数据
     *
     * @param htMaintenance 实例对象
     * @return 影响行数 int
     */
    int insert(HtMaintenance htMaintenance);

    /**
     * 修改数据
     *
     * @param htMaintenance 实例对象
     * @return 影响行数 int
     */
    int update(HtMaintenance htMaintenance);

    /**
     * 通过主键删除数据
     *
     * @param htMNum 主键
     * @return 影响行数 int
     */
    int deleteById(String htMNum);

}