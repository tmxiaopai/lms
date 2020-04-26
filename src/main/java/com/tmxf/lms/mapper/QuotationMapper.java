package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Quotation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 报价书(Quotation)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-24 16:06:52
 */
public interface QuotationMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param qNum 主键
     * @return 实例对象
     */
    Quotation queryById(String qNum);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Quotation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Quotation> queryByProNum(String projectNum);
    /**
     * 通过实体作为筛选条件查询
     *
     * @param quotation 实例对象
     * @return 对象列表
     */
    List<Quotation> queryAll(Quotation quotation);

    /**
     * 新增数据
     *
     * @param quotation 实例对象
     * @return 影响行数
     */
    int insert(Quotation quotation);

    /**
     * 修改数据
     *
     * @param quotation 实例对象
     * @return 影响行数
     */
    int update(Quotation quotation);

    /**
     * 通过主键删除数据
     *
     * @param qNum 主键
     * @return 影响行数
     */
    int deleteById(String qNum);

}