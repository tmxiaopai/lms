package com.tmxf.lms.service;

import com.tmxf.lms.entity.HtSale;
import java.util.List;

/**
 * 销售合同(HtSale)表服务接口
 *
 * @author makejava
 * @since 2020 -04-17 16:11:51
 */
public interface HtSaleService {
    /**
     * 合同审核
     *
     * @param htSaleNum the ht sale num
     * @return int int
     */
    int checkSale(String htSaleNum);

    /**
     * 通过ID查询单条数据
     *
     * @param htSaleNum 主键
     * @return 实例对象 ht sale
     */
    HtSale queryById(String htSaleNum);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<HtSale> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param htSale 实例对象
     * @return 实例对象 int
     */
    int insert(HtSale htSale);

    /**
     * 修改数据
     *
     * @param htSale 实例对象
     * @return 实例对象 int
     */
    int update(HtSale htSale);

    /**
     * 通过主键删除数据
     *
     * @param htSaleNum 主键
     * @return 是否成功 boolean
     */
    boolean deleteById(String htSaleNum);

    /**
     * Query all sale list.
     *
     * @return the list
     */
    List<HtSale> queryAllSale();

    List<HtSale> queryAll(HtSale htSale);

}