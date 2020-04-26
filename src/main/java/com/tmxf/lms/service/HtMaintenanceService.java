package com.tmxf.lms.service;

import com.tmxf.lms.entity.HtMaintenance;
import java.util.List;

/**
 * 维保合同(HtMaintenance)表服务接口
 *
 * @author makejava
 * @since 2020 -04-17 16:20:42
 */
public interface HtMaintenanceService {

    /**
     * 通过ID查询单条数据
     *
     * @param htMNum 主键
     * @return 实例对象 ht maintenance
     */
    HtMaintenance queryById(String htMNum);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<HtMaintenance> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param htMaintenance 实例对象
     * @return 实例对象 int
     */
    int insert(HtMaintenance htMaintenance);

    /**
     * 修改数据
     *
     * @param htMaintenance 实例对象
     * @return 实例对象 ht maintenance
     */
    HtMaintenance update(HtMaintenance htMaintenance);

    /**
     * 通过主键删除数据
     *
     * @param htMNum 主键
     * @return 是否成功 boolean
     */
    boolean deleteById(String htMNum);

    /**
     * Find all ma ht list.
     *
     * @return the list
     */
    List<HtMaintenance> findAllMaHt();

}