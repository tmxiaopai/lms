package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.RecordMaintenance;
import com.tmxf.lms.mapper.RecordMaintenanceMapper;
import com.tmxf.lms.service.RecordMaintenanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 维保记录(RecordMaintenance)表服务实现类
 *
 * @author makejava
 * @since 2020-05-23 21:40:49
 */
@Service("recordMaintenanceService")
public class RecordMaintenanceServiceImpl implements RecordMaintenanceService {
    @Resource
    private RecordMaintenanceMapper recordMaintenanceMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param rmId 主键
     * @return 实例对象
     */
    @Override
    public RecordMaintenance queryById(Integer rmId) {
        return this.recordMaintenanceMapper.queryById(rmId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RecordMaintenance> queryAllByLimit(int offset, int limit) {
        return this.recordMaintenanceMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param recordMaintenance 实例对象
     * @return 实例对象
     */
    @Override
    public RecordMaintenance insert(RecordMaintenance recordMaintenance) {
        this.recordMaintenanceMapper.insert(recordMaintenance);
        return recordMaintenance;
    }

    /**
     * 修改数据
     *
     * @param recordMaintenance 实例对象
     * @return 实例对象
     */
    @Override
    public int update(RecordMaintenance recordMaintenance) {

        return this.recordMaintenanceMapper.update(recordMaintenance);
    }

    /**
     * 通过主键删除数据
     *
     * @param rmId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rmId) {
        return this.recordMaintenanceMapper.deleteById(rmId) > 0;
    }


    @Override
    public void insertMany(Integer liftNum, Date mDate, int count) {
        recordMaintenanceMapper.insertMany(liftNum,mDate,count);
    }
}