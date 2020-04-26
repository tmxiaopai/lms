package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.WorkOrder;
import com.tmxf.lms.mapper.WorkOrderMapper;
import com.tmxf.lms.service.WorkOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 故障工单(WorkOrder)表服务实现类
 *
 * @author makejava
 * @since 2020 -04-16 20:59:08
 */
@Service("workOrderService")
public class WorkOrderServiceImpl implements WorkOrderService {
    @Resource
    private WorkOrderMapper workOrderMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param faultId 主键
     * @return 实例对象
     */
    @Override
    public WorkOrder queryById(Integer faultId) {
        return this.workOrderMapper.queryById(faultId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WorkOrder> queryAllByLimit(int offset, int limit) {
        return this.workOrderMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param workOrder 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(WorkOrder workOrder) {

        return this.workOrderMapper.insert(workOrder);
    }

    /**
     * 修改数据
     *
     * @param workOrder 实例对象
     * @return 实例对象
     */
    @Override
    public WorkOrder update(WorkOrder workOrder) {
        this.workOrderMapper.update(workOrder);
        return this.queryById(workOrder.getFaultId());
    }

    /**
     * 通过主键删除数据
     *
     * @param faultId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer faultId) {
        return this.workOrderMapper.deleteById(faultId) > 0;
    }

    @Override
    public List<WorkOrder> queryAll() {
        return workOrderMapper.queryAll(null);
    }

    @Override
    public int updateConfirm(Integer faultId) {
        return workOrderMapper.updateConfirm(faultId);
    }
}