package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Project;
import com.tmxf.lms.mapper.ProjectMapper;
import com.tmxf.lms.service.ProjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目(Project)表服务实现类
 *
 * @author makejava
 * @since 2020 -04-15 16:19:39
 */
@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectMapper projectMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param projectNum 主键
     * @return 实例对象
     */
    @Override
    public Project queryById(String projectNum) {
        return this.projectMapper.queryById(projectNum);
    }

    @Override
    public List<Project> queryAllByProject(Project project) {
        return projectMapper.queryAllByProject(project);
    }

    @Override
    public List<Project> queryAll() {
        return projectMapper.queryAll();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Project> queryAllByLimit(int offset, int limit) {
        return this.projectMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param project 实例对象
     * @return 实例对象
     */
    @Override
    public Project insert(Project project) {
        this.projectMapper.insert(project);
        return project;
    }

    /**
     * 修改数据
     *
     * @param project 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Project project) {

        return this.projectMapper.update(project);
    }

    /**
     * 通过主键删除数据
     *
     * @param projectNum 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(String projectNum) {
        return this.projectMapper.deleteById(projectNum);
    }

    @Override
    public int projectNameOk(String projectName) {
        String flag = projectMapper.nameOk(projectName);
        System.out.println("flag为："+flag);
        if (flag == null || flag.equals("")) {
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public List<Project> findAllProjectName() {
        return projectMapper.findAllProjectName();
    }
}