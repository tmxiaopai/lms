package com.tmxf.lms.service;

import com.sun.org.apache.xpath.internal.operations.Quo;
import com.tmxf.lms.entity.Quotation;
import java.util.List;

/**
 * 报价书(Quotation)表服务接口
 *
 * @author makejava
 * @since 2020-05-25 03:32:52
 */
public interface QuotationService {

    /**
     * 通过ID查询单条数据
     *
     * @param qNum 主键
     * @return 实例对象
     */
    Quotation queryById(String qNum);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Quotation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param quotation 实例对象
     * @return 实例对象
     */
    int insert(Quotation quotation);

    /**
     * 修改数据
     *
     * @param quotation 实例对象
     * @return 实例对象
     */
    Quotation update(Quotation quotation);

    /**
     * 通过主键删除数据
     *
     * @param qNum 主键
     * @return 是否成功
     */
    boolean deleteById(String qNum);

    List<Quotation> queryAll(Quotation quotation);

}