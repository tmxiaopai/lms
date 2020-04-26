package com.tmxf.lms.service;

import com.tmxf.lms.entity.WorkOrder;
import java.util.List;

/**
 * 故障工单(WorkOrder)表服务接口
 *
 * @author makejava
 * @since 2020 -04-16 20:59:08
 */
public interface WorkOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param faultId 主键
     * @return 实例对象 work order
     */
    WorkOrder queryById(Integer faultId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<WorkOrder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param workOrder 实例对象
     * @return 实例对象 int
     */
    int insert(WorkOrder workOrder);

    /**
     * 修改数据
     *
     * @param workOrder 实例对象
     * @return 实例对象 work order
     */
    WorkOrder update(WorkOrder workOrder);

    /**
     * 通过主键删除数据
     *
     * @param faultId 主键
     * @return 是否成功 boolean
     */
    boolean deleteById(Integer faultId);

    /**
     * 查找所有工单
     *
     * @return list
     */
    List<WorkOrder> queryAll();

    /**
     * 更新状态
     *
     * @param faultId the fault id
     * @return int
     */
    int updateConfirm(Integer faultId);

}