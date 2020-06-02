package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Project;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 项目(Project)表数据库访问层
 *
 * @author makejava
 * @since 2020 -04-15 16:19:35
 */
public interface ProjectMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param projectNum 主键
     * @return 实例对象 project
     */
    Project queryById(String projectNum);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<Project> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表 list
     */
    List<Project> queryAll();

    /**
     * 按需查找
     *
     * @param project the project
     * @return list list
     */
    List<Project> queryAllByProject(Project project);

    /**
     * 新增数据
     *
     * @param project 实例对象
     * @return 影响行数 int
     */
    int insert(Project project);

    /**
     * 修改数据
     *
     * @param project 实例对象
     * @return 影响行数 int
     */
    int update(Project project);

    /**
     * 通过主键删除数据
     *
     * @param projectNum 主键
     * @return 影响行数 int
     */
    int deleteById(String projectNum);

    /**
     * Name ok string.
     *
     * @param projectName the project name
     * @return the string
     */
    @Select({
            "select project_name from project where project_name = #{projectName,jdbcType=VARCHAR}"
    })
    String nameOk(String projectName);

    /**
     * 查找项目名
     *
     * @return list list
     */
    @Select({
            "select project_num,project_name from project order by project_name desc"
    })
    List<Project> findAllProjectName();

}