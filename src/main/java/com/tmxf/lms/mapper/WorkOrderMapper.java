package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.WorkOrder;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * The interface Work order mapper.
 */
public interface WorkOrderMapper {
    /**
     * 通过ID查询单条数据
     *
     * @param faultId 主键
     * @return 实例对象 work order
     */
    WorkOrder queryById(Integer faultId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<WorkOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param workOrder 实例对象
     * @return 对象列表 list
     */
    List<WorkOrder> queryAll(WorkOrder workOrder);

    /**
     * 新增数据
     *
     * @param workOrder 实例对象
     * @return 影响行数 int
     */
    int insert(WorkOrder workOrder);

    /**
     * 修改数据
     *
     * @param workOrder 实例对象
     * @return 影响行数 int
     */
    int update(WorkOrder workOrder);

    /**
     * 通过主键删除数据
     *
     * @param faultId 主键
     * @return 影响行数 int
     */
    int deleteById(Integer faultId);

    /**
     * 更新客户确认状态
     *
     * @param faultId the fault id
     * @return int
     */
    @Update({
            "update work_order set confirm = 1 where fault_id=#{faultId}"
    })
    int updateConfirm(Integer faultId);

}