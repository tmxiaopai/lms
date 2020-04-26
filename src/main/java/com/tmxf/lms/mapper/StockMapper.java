package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Stock;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 库存(Stock)表数据库访问层
 *
 * @author makejava
 * @since 2020 -04-20 14:13:30
 */
public interface StockMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param sName 主键
     * @return 实例对象 stock
     */
    Stock queryById(String sName);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<Stock> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stock 实例对象
     * @return 对象列表 list
     */
    List<Stock> queryAll(Stock stock);

    /**
     * 新增数据
     *
     * @param stock 实例对象
     * @return 影响行数 int
     */
    int insert(Stock stock);

    /**
     * 修改数据
     *
     * @param stock 实例对象
     * @return 影响行数 int
     */
    int update(Stock stock);

    /**
     * 更新数据
     *
     * @param num   the num
     * @param count the count
     * @return int
     */
    @Select({
            "update stock set s_in = s_in + #{count} where s_num=#{num}"
    })
    Object updateInByTwo(String num,Integer count);

    /**
     * 更新数据
     *
     * @param num   the num
     * @param count the count
     * @return int
     */
    @Select({
            "update stock set s_in = s_in - #{count},s_out = s_out + #{count} where s_num=#{num}"
    })
    Object updateOutByTwo(String num,Integer count);

    /**
     * 通过主键删除数据
     *
     * @param sName 主键
     * @return 影响行数 int
     */
    int deleteById(String sName);

    /**
     * 查询主要信息
     *
     * @return list
     */
    @Select({
            "select s_name,s_num from stock"
    })
    List<Stock> findAllStockMainInfo();

    /**
     * 查库存
     * @param num
     * @return
     */
    @Select({
            "select s_in from stock where s_num = #{num}"
    })
    int queryCountByNum(String num);

}