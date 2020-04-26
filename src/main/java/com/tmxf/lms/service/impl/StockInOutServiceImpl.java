package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.StockInOut;
import com.tmxf.lms.mapper.StockInOutMapper;
import com.tmxf.lms.service.StockInOutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 进销记录(StockInOut)表服务实现类
 *
 * @author makejava
 * @since 2020 -04-20 14:50:48
 */
@Service("stockInOutService")
public class StockInOutServiceImpl implements StockInOutService {
    @Resource
    private StockInOutMapper stockInOutDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sioId 主键
     * @return 实例对象
     */
    @Override
    public StockInOut queryById(Integer sioId) {
        return this.stockInOutDao.queryById(sioId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<StockInOut> queryAllByLimit(int offset, int limit) {
        return this.stockInOutDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param stockInOut 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(StockInOut stockInOut) {
        return this.stockInOutDao.insert(stockInOut);
    }

    /**
     * 修改数据
     *
     * @param stockInOut 实例对象
     * @return 实例对象
     */
    @Override
    public StockInOut update(StockInOut stockInOut) {
        this.stockInOutDao.update(stockInOut);
        return this.queryById(stockInOut.getSioId());
    }

    /**
     * 通过主键删除数据
     *
     * @param sioId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sioId) {
        return this.stockInOutDao.deleteById(sioId) > 0;
    }

    @Override
    public List<StockInOut> findAllInStock(short type) {
        return stockInOutDao.findAllStock(type);
    }
}