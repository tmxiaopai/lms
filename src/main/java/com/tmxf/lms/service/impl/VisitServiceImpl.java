package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Visit;
import com.tmxf.lms.mapper.VisitDao;
import com.tmxf.lms.service.VisitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 拜访计划(Visit)表服务实现类
 *
 * @author makejava
 * @since 2020 -04-16 17:24:44
 */
@Service("visitService")
public class VisitServiceImpl implements VisitService {
    @Resource
    private VisitDao visitDao;

    /**
     * 通过ID查询单条数据
     *
     * @param visitId 主键
     * @return 实例对象
     */
    @Override
    public Visit queryById(Integer visitId) {
        return this.visitDao.queryById(visitId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Visit> queryAllByLimit(int offset, int limit) {
        return this.visitDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param visit 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Visit visit) {

        return this.visitDao.insert(visit);
    }

    /**
     * 修改数据
     *
     * @param visit 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Visit visit) {

        return this.visitDao.update(visit);
    }

    /**
     * 通过主键删除数据
     *
     * @param visitId 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer visitId) {
        return this.visitDao.deleteById(visitId);
    }

    @Override
    public List<Visit> findAllPlan() {
        return visitDao.queryAll(null);
    }

    @Override
    public List<Visit> queryAll(Visit visit) {
        return visitDao.queryAll(visit);
    }
}