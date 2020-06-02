package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.HtMaintenance;
import com.tmxf.lms.mapper.HtMaintenanceMapper;
import com.tmxf.lms.service.HtMaintenanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 维保合同(HtMaintenance)表服务实现类
 *
 * @author makejava
 * @since 2020 -04-17 16:20:42
 */
@Service("htMaintenanceService")
public class HtMaintenanceServiceImpl implements HtMaintenanceService {
    @Resource
    private HtMaintenanceMapper htMaintenanceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param htMNum 主键
     * @return 实例对象
     */
    @Override
    public HtMaintenance queryById(String htMNum) {
        return this.htMaintenanceDao.queryById(htMNum);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<HtMaintenance> queryAllByLimit(int offset, int limit) {
        return this.htMaintenanceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param htMaintenance 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(HtMaintenance htMaintenance) {

        return  this.htMaintenanceDao.insert(htMaintenance);
    }

    /**
     * 修改数据
     *
     * @param htMaintenance 实例对象
     * @return 实例对象
     */
    @Override
    public HtMaintenance update(HtMaintenance htMaintenance) {
        this.htMaintenanceDao.update(htMaintenance);
        return this.queryById(htMaintenance.getHtMNum());
    }

    /**
     * 通过主键删除数据
     *
     * @param htMNum 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String htMNum) {
        return this.htMaintenanceDao.deleteById(htMNum) > 0;
    }

    @Override
    public List<HtMaintenance> findAllMaHt() {
        return htMaintenanceDao.queryAll(null);
    }

    @Override
    public List<HtMaintenance> queryAll(HtMaintenance htMaintenance) {
        return htMaintenanceDao.queryAll(htMaintenance);
    }
}