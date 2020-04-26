package com.tmxf.lms.service;

import com.tmxf.lms.entity.Stock;
import java.util.List;

/**
 * 库存(Stock)表服务接口
 *
 * @author makejava
 * @since 2020 -04-20 14:13:30
 */
public interface StockService {

    /**
     * 通过ID查询单条数据
     *
     * @param sName 主键
     * @return 实例对象 stock
     */
    Stock queryById(String sName);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<Stock> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stock 实例对象
     * @return 实例对象 stock
     */
    Stock insert(Stock stock);

    /**
     * 修改数据
     *
     * @param stock 实例对象
     * @return 实例对象 stock
     */
    Stock update(Stock stock);

    /**
     * 通过主键删除数据
     *
     * @param sName 主键
     * @return 是否成功 boolean
     */
    boolean deleteById(String sName);

    /**
     * 查询库存
     *
     * @return list
     */
    List<Stock> findAllStock();

    /**
     * Find all stock main info list.
     *
     * @return the list
     */
    List<Stock> findAllStockMainInfo();

    /**
     * Update in by two int.
     *
     * @param num   the num
     * @param count the count
     * @return the int
     */
    int updateInByTwo(String num,Integer count);

    /**
     * Update out by two int.
     *
     * @param num   the num
     * @param count the count
     * @return the int
     */
    int updateOutByTwo(String num,Integer count);

    /**
     * 查库存
     * @param num
     * @return
     */
    int queryCountByNum(String num);

}