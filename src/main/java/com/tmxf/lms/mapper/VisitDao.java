package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Visit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 拜访计划(Visit)表数据库访问层
 *
 * @author makejava
 * @since 2020 -04-16 17:24:44
 */
@Mapper
public interface VisitDao {

    /**
     * 通过ID查询单条数据
     *
     * @param visitId 主键
     * @return 实例对象 visit
     */
    Visit queryById(Integer visitId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<Visit> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param visit 实例对象
     * @return 对象列表 list
     */
    List<Visit> queryAll(Visit visit);

    /**
     * 新增数据
     *
     * @param visit 实例对象
     * @return 影响行数 int
     */
    int insert(Visit visit);

    /**
     * 修改数据
     *
     * @param visit 实例对象
     * @return 影响行数 int
     */
    int update(Visit visit);

    /**
     * 通过主键删除数据
     *
     * @param visitId 主键
     * @return 影响行数 int
     */
    int deleteById(Integer visitId);

}