package com.tmxf.lms.service;

import com.tmxf.lms.entity.DetailLift;
import java.util.List;

/**
 * 电梯需求(DetailLift)表服务接口
 *
 * @author makejava
 * @since 2020 -04-21 14:54:43
 */
public interface DetailLiftService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象 detail lift
     */
    DetailLift queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<DetailLift> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param detailLift 实例对象
     * @return 实例对象 int
     */
    int insert(DetailLift detailLift);

    /**
     * 修改数据
     *
     * @param detailLift 实例对象
     * @return 实例对象 detail lift
     */
    int update(DetailLift detailLift);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功 boolean
     */
    boolean deleteById(Integer id);

    /**
     * Query all lift list.
     *
     * @return the list
     */
    List<DetailLift> queryAllLift();

    /**
     * Query un finish list.
     *
     * @return the list
     */
    List<DetailLift> queryUnFinish();

    /**
     * Find all lift in project list.
     *
     * @param projectNum the project num
     * @return the list
     */
    List<Integer> findAllLiftInProject(String projectNum);

    /**
     * Query lift by pro num list.
     *
     * @param projectNum the project num
     * @return the list
     */
    List<DetailLift> queryLiftByProNum(String projectNum);

    /**
     * 按条件查询
     * @param detailLift
     * @return
     */
    List<DetailLift> queryAll(DetailLift detailLift);

}