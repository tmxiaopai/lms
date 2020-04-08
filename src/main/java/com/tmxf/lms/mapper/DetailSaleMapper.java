package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.DetailSale;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface DetailSaleMapper {
    @Delete({
            "delete from detail_sale",
            "where detail_sale_id = #{detailSaleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer detailSaleId);

    @Insert({
            "insert into detail_sale (detail_sale_id, detail_sale_money, ",
            "detail_sale_name, detail_sale_date, ",
            "detail_sale_project, detail_sale_price, ",
            "detail_sale_count, detail_sale_invoice, ",
            "detail_sale_user, detail_sale_state_money, ",
            "detail_sale_state_invoic, detail_sale_ok_date)",
            "values (#{detailSaleId,jdbcType=INTEGER}, #{detailSaleMoney,jdbcType=DOUBLE}, ",
            "#{detailSaleName,jdbcType=VARCHAR}, #{detailSaleDate,jdbcType=DATE}, ",
            "#{detailSaleProject,jdbcType=VARCHAR}, #{detailSalePrice,jdbcType=DOUBLE}, ",
            "#{detailSaleCount,jdbcType=INTEGER}, #{detailSaleInvoice,jdbcType=INTEGER}, ",
            "#{detailSaleUser,jdbcType=INTEGER}, #{detailSaleStateMoney,jdbcType=BIT}, ",
            "#{detailSaleStateInvoic,jdbcType=BIT}, #{detailSaleOkDate,jdbcType=DATE})"
    })
    int insert(DetailSale record);

    @Select({
            "select",
            "detail_sale_id, detail_sale_money, detail_sale_name, detail_sale_date, detail_sale_project, ",
            "detail_sale_price, detail_sale_count, detail_sale_invoice, detail_sale_user, ",
            "detail_sale_state_money, detail_sale_state_invoic, detail_sale_ok_date",
            "from detail_sale",
            "where detail_sale_id = #{detailSaleId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "detail_sale_id", property = "detailSaleId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "detail_sale_money", property = "detailSaleMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "detail_sale_name", property = "detailSaleName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "detail_sale_date", property = "detailSaleDate", jdbcType = JdbcType.DATE),
            @Result(column = "detail_sale_project", property = "detailSaleProject", jdbcType = JdbcType.VARCHAR),
            @Result(column = "detail_sale_price", property = "detailSalePrice", jdbcType = JdbcType.DOUBLE),
            @Result(column = "detail_sale_count", property = "detailSaleCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "detail_sale_invoice", property = "detailSaleInvoice", jdbcType = JdbcType.INTEGER),
            @Result(column = "detail_sale_user", property = "detailSaleUser", jdbcType = JdbcType.INTEGER),
            @Result(column = "detail_sale_state_money", property = "detailSaleStateMoney", jdbcType = JdbcType.BIT),
            @Result(column = "detail_sale_state_invoic", property = "detailSaleStateInvoic", jdbcType = JdbcType.BIT),
            @Result(column = "detail_sale_ok_date", property = "detailSaleOkDate", jdbcType = JdbcType.DATE)
    })
    DetailSale selectByPrimaryKey(Integer detailSaleId);

    @Select({
            "select",
            "detail_sale_id, detail_sale_money, detail_sale_name, detail_sale_date, detail_sale_project, ",
            "detail_sale_price, detail_sale_count, detail_sale_invoice, detail_sale_user, ",
            "detail_sale_state_money, detail_sale_state_invoic, detail_sale_ok_date",
            "from detail_sale"
    })
    @Results({
            @Result(column = "detail_sale_id", property = "detailSaleId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "detail_sale_money", property = "detailSaleMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "detail_sale_name", property = "detailSaleName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "detail_sale_date", property = "detailSaleDate", jdbcType = JdbcType.DATE),
            @Result(column = "detail_sale_project", property = "detailSaleProject", jdbcType = JdbcType.VARCHAR),
            @Result(column = "detail_sale_price", property = "detailSalePrice", jdbcType = JdbcType.DOUBLE),
            @Result(column = "detail_sale_count", property = "detailSaleCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "detail_sale_invoice", property = "detailSaleInvoice", jdbcType = JdbcType.INTEGER),
            @Result(column = "detail_sale_user", property = "detailSaleUser", jdbcType = JdbcType.INTEGER),
            @Result(column = "detail_sale_state_money", property = "detailSaleStateMoney", jdbcType = JdbcType.BIT),
            @Result(column = "detail_sale_state_invoic", property = "detailSaleStateInvoic", jdbcType = JdbcType.BIT),
            @Result(column = "detail_sale_ok_date", property = "detailSaleOkDate", jdbcType = JdbcType.DATE)
    })
    List<DetailSale> selectAll();

    @Update({
            "update detail_sale",
            "set detail_sale_money = #{detailSaleMoney,jdbcType=DOUBLE},",
            "detail_sale_name = #{detailSaleName,jdbcType=VARCHAR},",
            "detail_sale_date = #{detailSaleDate,jdbcType=DATE},",
            "detail_sale_project = #{detailSaleProject,jdbcType=VARCHAR},",
            "detail_sale_price = #{detailSalePrice,jdbcType=DOUBLE},",
            "detail_sale_count = #{detailSaleCount,jdbcType=INTEGER},",
            "detail_sale_invoice = #{detailSaleInvoice,jdbcType=INTEGER},",
            "detail_sale_user = #{detailSaleUser,jdbcType=INTEGER},",
            "detail_sale_state_money = #{detailSaleStateMoney,jdbcType=BIT},",
            "detail_sale_state_invoic = #{detailSaleStateInvoic,jdbcType=BIT},",
            "detail_sale_ok_date = #{detailSaleOkDate,jdbcType=DATE}",
            "where detail_sale_id = #{detailSaleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DetailSale record);
}