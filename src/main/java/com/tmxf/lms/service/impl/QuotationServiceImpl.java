package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Quotation;
import com.tmxf.lms.mapper.QuotationMapper;
import com.tmxf.lms.service.QuotationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 报价书(Quotation)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 03:32:57
 */
@Service("quotationService")
public class QuotationServiceImpl implements QuotationService {
    @Resource
    private QuotationMapper quotationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param qNum 主键
     * @return 实例对象
     */
    @Override
    public Quotation queryById(String qNum) {
        return this.quotationDao.queryById(qNum);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Quotation> queryAllByLimit(int offset, int limit) {
        return this.quotationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param quotation 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Quotation quotation) {

        return this.quotationDao.insert(quotation);
    }

    /**
     * 修改数据
     *
     * @param quotation 实例对象
     * @return 实例对象
     */
    @Override
    public Quotation update(Quotation quotation) {
        this.quotationDao.update(quotation);
        return this.queryById(quotation.getQNum());
    }

    /**
     * 通过主键删除数据
     *
     * @param qNum 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String qNum) {
        return this.quotationDao.deleteById(qNum) > 0;
    }

    @Override
    public List<Quotation> queryAll(Quotation quotation) {
        return quotationDao.queryAll(quotation);
    }
}