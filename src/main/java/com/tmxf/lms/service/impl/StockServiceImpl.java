package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Stock;
import com.tmxf.lms.mapper.StockMapper;
import com.tmxf.lms.service.StockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 库存(Stock)表服务实现类
 *
 * @author makejava
 * @since 2020 -04-20 14:13:30
 */
@Service("stockService")
public class StockServiceImpl implements StockService {
    @Resource
    private StockMapper stockMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param sName 主键
     * @return 实例对象
     */
    @Override
    public Stock queryById(String sName) {
        return this.stockMapper.queryById(sName);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Stock> queryAllByLimit(int offset, int limit) {
        return this.stockMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param stock 实例对象
     * @return 实例对象
     */
    @Override
    public Stock insert(Stock stock) {
        this.stockMapper.insert(stock);
        return stock;
    }

    /**
     * 修改数据
     *
     * @param stock 实例对象
     * @return 实例对象
     */
    @Override
    public Stock update(Stock stock) {
        this.stockMapper.update(stock);
        return this.queryById(stock.getSName());
    }

    /**
     * 通过主键删除数据
     *
     * @param sName 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String sName) {
        return this.stockMapper.deleteById(sName) > 0;
    }

    @Override
    public List<Stock> findAllStock() {
        return stockMapper.queryAll(null);
    }

    @Override
    public List<Stock> findAllStockMainInfo() {
        return stockMapper.findAllStockMainInfo();
    }

    @Override
    public int updateInByTwo(String num, Integer count) {
        return stockMapper.updateInByTwo(num,count)==null? 1:0;
    }

    @Override
    public int updateOutByTwo(String num, Integer count) {
        return stockMapper.updateOutByTwo(num,count)==null? 1:0;
    }

    @Override
    public int queryCountByNum(String num) {
        return stockMapper.queryCountByNum(num);
    }
}