package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.DetailSale;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * The interface Detail sale mapper.
 * @author TMXIAOPAI
 */
public interface DetailSaleMapper {
    @Update({
            "update detail_sale set detail_sale_state_money = 1,detail_sale_ok_date=#{d} where detail_sale_num =#{num}"
    })
    int okMoney(String num, Date d);

    @Update({
            "update detail_sale set detail_sale_state_invoice = 1 where detail_sale_num =#{num} "
    })
    int invoice(String num);


    /**
     * 新增数据
     *
     * @param detailSale 实例对象
     * @return 影响行数
     */
    int insert(DetailSale detailSale);



    /**
     * Select all list.
     *
     * @return the list
     */
    @Select({
        "select",
        "detail_sale_num, detail_sale_user, detail_sale_date, detail_sale_money, detail_sale_project, ",
        "detail_sale_name, detail_sale_price, detail_sale_count, detail_sale_total, detail_sale_invoice, ",
        "detail_sale_state_money, detail_sale_state_invoice, detail_sale_pre_date, detail_sale_ok_date",
        "from detail_sale where detail_sale_state_money = 0"
    })
    @Results({
        @Result(column="detail_sale_num", property="detailSaleNum", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="detail_sale_user", property="detailSaleUser", jdbcType=JdbcType.INTEGER),
        @Result(column="detail_sale_date", property="detailSaleDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="detail_sale_money", property="detailSaleMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="detail_sale_project", property="detailSaleProject", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail_sale_name", property="detailSaleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail_sale_price", property="detailSalePrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="detail_sale_count", property="detailSaleCount", jdbcType=JdbcType.INTEGER),
        @Result(column="detail_sale_total", property="detailSaleTotal", jdbcType=JdbcType.DECIMAL),
        @Result(column="detail_sale_invoice", property="detailSaleInvoice", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail_sale_state_money", property="detailSaleStateMoney", jdbcType=JdbcType.BIT),
        @Result(column="detail_sale_state_invoice", property="detailSaleStateInvoice", jdbcType=JdbcType.BIT),
        @Result(column="detail_sale_pre_date", property="detailSalePreDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="detail_sale_ok_date", property="detailSaleOkDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DetailSale> selectAllUn();

    @Select({
            "select",
            "detail_sale_num, detail_sale_user, detail_sale_date, detail_sale_money, detail_sale_project, ",
            "detail_sale_name, detail_sale_price, detail_sale_count, detail_sale_total, detail_sale_invoice, ",
            "detail_sale_state_money, detail_sale_state_invoice, detail_sale_pre_date, detail_sale_ok_date",
            "from detail_sale where detail_sale_state_money = 1"
    })
    @Results({
            @Result(column="detail_sale_num", property="detailSaleNum", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="detail_sale_user", property="detailSaleUser", jdbcType=JdbcType.INTEGER),
            @Result(column="detail_sale_date", property="detailSaleDate", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="detail_sale_money", property="detailSaleMoney", jdbcType=JdbcType.DECIMAL),
            @Result(column="detail_sale_project", property="detailSaleProject", jdbcType=JdbcType.VARCHAR),
            @Result(column="detail_sale_name", property="detailSaleName", jdbcType=JdbcType.VARCHAR),
            @Result(column="detail_sale_price", property="detailSalePrice", jdbcType=JdbcType.DECIMAL),
            @Result(column="detail_sale_count", property="detailSaleCount", jdbcType=JdbcType.INTEGER),
            @Result(column="detail_sale_total", property="detailSaleTotal", jdbcType=JdbcType.DECIMAL),
            @Result(column="detail_sale_invoice", property="detailSaleInvoice", jdbcType=JdbcType.VARCHAR),
            @Result(column="detail_sale_state_money", property="detailSaleStateMoney", jdbcType=JdbcType.BIT),
            @Result(column="detail_sale_state_invoice", property="detailSaleStateInvoice", jdbcType=JdbcType.BIT),
            @Result(column="detail_sale_pre_date", property="detailSalePreDate", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="detail_sale_ok_date", property="detailSaleOkDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DetailSale> selectAllOk();

    /**
     * 通过ID查询单条数据
     *
     * @param detailSaleNum 主键
     * @return 实例对象
     */
    DetailSale queryById(String detailSaleNum);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DetailSale> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param detailSale 实例对象
     * @return 对象列表
     */
    List<DetailSale> queryAll(DetailSale detailSale);



    /**
     * 修改数据
     *
     * @param detailSale 实例对象
     * @return 影响行数
     */
    int update(DetailSale detailSale);

    /**
     * 通过主键删除数据
     *
     * @param detailSaleNum 主键
     * @return 影响行数
     */
    int deleteById(String detailSaleNum);
}