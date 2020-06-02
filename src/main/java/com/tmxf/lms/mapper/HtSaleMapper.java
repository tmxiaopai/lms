package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.HtSale;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 销售合同(HtSale)表数据库访问层
 *
 * @author makejava
 * @since 2020 -04-17 16:11:49
 */
public interface HtSaleMapper {
    /**
     * 审核
     *
     * @param htSaleNum the ht sale num
     * @return int int
     */
    @Update({
            "update ht_sale set ht_sale_state = true where ht_sale_num=#{hrSaleNum,jdbcType=VARCHAR}"
    })
    int checkSale(String htSaleNum);

    /**
     * 通过ID查询单条数据
     *
     * @param htSaleNum 主键
     * @return 实例对象 ht sale
     */
    HtSale queryById(String htSaleNum);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<HtSale> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param htSale 实例对象
     * @return 对象列表 list
     */
    List<HtSale> queryAll(HtSale htSale);

    /**
     * 新增数据
     *
     * @param htSale 实例对象
     * @return 影响行数 int
     */
    int insert(HtSale htSale);

    /**
     * 修改数据
     *
     * @param htSale 实例对象
     * @return 影响行数 int
     */
    int update(HtSale htSale);

    /**
     * 通过主键删除数据
     *
     * @param htSaleNum 主键
     * @return 影响行数 int
     */
    int deleteById(String htSaleNum);

}