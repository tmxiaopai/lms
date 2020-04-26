package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.DetailLift;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 电梯需求(DetailLift)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 14:54:43
 */
public interface DetailLiftMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DetailLift queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DetailLift> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param detailLift 实例对象
     * @return 对象列表
     */
    List<DetailLift> queryAll(DetailLift detailLift);

    /**
     * 新增数据
     *
     * @param detailLift 实例对象
     * @return 影响行数
     */
    int insert(DetailLift detailLift);

    /**
     * 修改数据
     *
     * @param detailLift 实例对象
     * @return 影响行数
     */
    int update(DetailLift detailLift);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


    List<DetailLift> queryUnFinish();

    /**
     * 查询项目电梯
     * @param projectNum
     * @return
     */
    @Select({
            "select id from detail_lift where project_num=#{projectNum}"
    })
    List<Integer> findAllLiftInProject(String projectNum);

    List<DetailLift> queryLiftByProNum(String projectNum);


}