package com.tmxf.lms.service;

import com.tmxf.lms.entity.Visit;
import java.util.List;

/**
 * 拜访计划(Visit)表服务接口
 *
 * @author makejava
 * @since 2020 -04-16 17:24:44
 */
public interface VisitService {

    /**
     * 通过ID查询单条数据
     *
     * @param visitId 主键
     * @return 实例对象 visit
     */
    Visit queryById(Integer visitId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<Visit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param visit 实例对象
     * @return 实例对象 int
     */
    int insert(Visit visit);

    /**
     * 修改数据
     *
     * @param visit 实例对象
     * @return 实例对象 int
     */
    int update(Visit visit);

    /**
     * 通过主键删除数据
     *
     * @param visitId 主键
     * @return 是否成功 int
     */
    int deleteById(Integer visitId);

    /**
     * 查询所有计划
     *
     * @return list
     */
    List<Visit> findAllPlan();

}