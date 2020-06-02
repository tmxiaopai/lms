package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.HtSale;
import com.tmxf.lms.mapper.HtSaleMapper;
import com.tmxf.lms.service.HtSaleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 销售合同(HtSale)表服务实现类
 *
 * @author makejava
 * @since 2020 -04-17 16:11:51
 */
@Service("htSaleService")
public class HtSaleServiceImpl implements HtSaleService {
    @Resource
    private HtSaleMapper htSaleMapper;

    @Override
    public int checkSale(String htSaleNum) {
        return htSaleMapper.checkSale(htSaleNum);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param htSaleNum 主键
     * @return 实例对象
     */
    @Override
    public HtSale queryById(String htSaleNum) {
        return this.htSaleMapper.queryById(htSaleNum);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<HtSale> queryAllByLimit(int offset, int limit) {
        return this.htSaleMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param htSale 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(HtSale htSale) {
        return  this.htSaleMapper.insert(htSale);
    }

    /**
     * 修改数据
     *
     * @param htSale 实例对象
     * @return 实例对象
     */
    @Override
    public int update(HtSale htSale) {

        return this.htSaleMapper.update(htSale);
    }

    /**
     * 通过主键删除数据
     *
     * @param htSaleNum 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String htSaleNum) {
        return this.htSaleMapper.deleteById(htSaleNum) > 0;
    }

    @Override
    public List<HtSale> queryAllSale() {
        return htSaleMapper.queryAll(null);
    }

    @Override
    public List<HtSale> queryAll(HtSale htSale) {
        return htSaleMapper.queryAll(htSale);
    }
}