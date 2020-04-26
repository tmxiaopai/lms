package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.DetailLift;
import com.tmxf.lms.mapper.DetailLiftMapper;
import com.tmxf.lms.service.DetailLiftService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 电梯需求(DetailLift)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 14:54:43
 */
@Service("detailLiftService")
public class DetailLiftServiceImpl implements DetailLiftService {
    @Resource
    private DetailLiftMapper detailLiftDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DetailLift queryById(Integer id) {
        return this.detailLiftDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DetailLift> queryAllByLimit(int offset, int limit) {
        return this.detailLiftDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param detailLift 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(DetailLift detailLift) {
        return this.detailLiftDao.insert(detailLift);
    }

    /**
     * 修改数据
     *
     * @param detailLift 实例对象
     * @return 实例对象
     */
    @Override
    public DetailLift update(DetailLift detailLift) {
        this.detailLiftDao.update(detailLift);
        return this.queryById(detailLift.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.detailLiftDao.deleteById(id) > 0;
    }

    @Override
    public List<DetailLift> queryAllLift() {
        return detailLiftDao.queryAll(null);
    }

    @Override
    public List<DetailLift> queryUnFinish() {
        return detailLiftDao.queryUnFinish();
    }

    @Override
    public List<Integer> findAllLiftInProject(String projectNum) {
        return detailLiftDao.findAllLiftInProject(projectNum);
    }

    @Override
    public List<DetailLift> queryLiftByProNum(String projectNum) {
        return detailLiftDao.queryLiftByProNum(projectNum);
    }

}