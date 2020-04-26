package com.tmxf.lms.service;

import com.tmxf.lms.entity.Project;
import java.util.List;

/**
 * 项目(Project)表服务接口
 *
 * @author makejava
 * @since 2020 -04-15 16:19:39
 */
public interface ProjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param projectNum 主键
     * @return 实例对象 project
     */
    Project queryById(String projectNum);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param project 实例对象
     * @return 对象列表 list
     */
    List<Project> queryAllByProject(Project project);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表 list
     */
    List<Project> queryAll();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<Project> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param project 实例对象
     * @return 实例对象 project
     */
    Project insert(Project project);

    /**
     * 修改数据
     *
     * @param project 实例对象
     * @return 实例对象 int
     */
    int update(Project project);

    /**
     * 通过主键删除数据
     *
     * @param projectNum 主键
     * @return 是否成功 int
     */
    int deleteById(String projectNum);

    /**
     * 查询名字是否重复
     *
     * @param projectName the project name
     * @return int
     */
    int projectNameOk(String projectName);

    /**
     * 查找项目名
     *
     * @return list
     */
    List<Project> findAllProjectName();
}