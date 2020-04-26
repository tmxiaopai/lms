package com.tmxf.lms.service;

import com.tmxf.lms.entity.StockInOut;
import java.util.List;

/**
 * 进销记录(StockInOut)表服务接口
 *
 * @author makejava
 * @since 2020 -04-20 14:50:48
 */
public interface StockInOutService {

    /**
     * 通过ID查询单条数据
     *
     * @param sioId 主键
     * @return 实例对象 stock in out
     */
    StockInOut queryById(Integer sioId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<StockInOut> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stockInOut 实例对象
     * @return 实例对象 int
     */
    int insert(StockInOut stockInOut);

    /**
     * 修改数据
     *
     * @param stockInOut 实例对象
     * @return 实例对象 stock in out
     */
    StockInOut update(StockInOut stockInOut);

    /**
     * 通过主键删除数据
     *
     * @param sioId 主键
     * @return 是否成功 boolean
     */
    boolean deleteById(Integer sioId);

    /**
     * 查询记录
     * @param type
     * @return
     */
    List<StockInOut> findAllInStock(short type);

}