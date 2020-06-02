package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.RecordMaintenance;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * The interface Record maintenance mapper.
 * @author TMXIAOPAI
 */
public interface RecordMaintenanceMapper {
    /**
     * 批量生成
     * @param liftNum
     * @param mDate
     * @param count
     */
    void insertMany(Integer liftNum,Date mDate,Integer count);

    /**
     * 通过ID查询单条数据
     *
     * @param rmId 主键
     * @return 实例对象
     */
    RecordMaintenance queryById(Integer rmId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<RecordMaintenance> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param recordMaintenance 实例对象
     * @return 对象列表
     */
    List<RecordMaintenance> queryAll(RecordMaintenance recordMaintenance);

    /**
     * 新增数据
     *
     * @param recordMaintenance 实例对象
     * @return 影响行数
     */
    int insert(RecordMaintenance recordMaintenance);

    /**
     * 修改数据
     *
     * @param recordMaintenance 实例对象
     * @return 影响行数
     */
    int update(RecordMaintenance recordMaintenance);

    /**
     * 通过主键删除数据
     *
     * @param rmId 主键
     * @return 影响行数
     */
    int deleteById(Integer rmId);

}