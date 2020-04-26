package com.tmxf.lms.service;

import com.tmxf.lms.entity.RecordMaintenance;

import java.util.Date;
import java.util.List;

/**
 * 维保记录(RecordMaintenance)表服务接口
 *
 * @author makejava
 * @since 2020-04-22 19:03:45
 */
public interface RecordMaintenanceService {

    List<RecordMaintenance> queryAll(RecordMaintenance recordMaintenance);

    /**
     * 通过ID查询单条数据
     *
     * @param rmId 主键
     * @return 实例对象
     */
    RecordMaintenance queryById(Integer rmId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RecordMaintenance> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param recordMaintenance 实例对象
     * @return 实例对象
     */
    int insert(RecordMaintenance recordMaintenance);

    /**
     * 修改数据
     *
     * @param recordMaintenance 实例对象
     * @return 实例对象
     */
    int update(RecordMaintenance recordMaintenance);

    /**
     * 通过主键删除数据
     *
     * @param rmId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rmId);

    /**
     * 批量插入
     * @param liftNum
     * @param mDate
     * @param count
     * @return
     */
    void insertMany(Integer liftNum, Date mDate, int count);

}