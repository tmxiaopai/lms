package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.HtSale;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface HtSaleMapper {
    @Delete({
            "delete from ht_sale",
            "where ht_sale_num = #{htSaleNum,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String htSaleNum);

    @Insert({
            "insert into ht_sale (ht_sale_num, ht_sale_startdate, ",
            "ht_sale_enddate, ht_sale_warranty, ",
            "ht_sale_money, ht_sale_upmoney, ",
            "ht_sale_state, p_num, ht_sale_paystyle, ",
            "ht_sale_dingjin, ht_sale_dingjin_rate, ",
            "ht_sale_tihuokuan_rate, ht_sale_tihuokuan, ",
            "ht_sale_desc, ht_sale_is_finish)",
            "values (#{htSaleNum,jdbcType=VARCHAR}, #{htSaleStartdate,jdbcType=DATE}, ",
            "#{htSaleEnddate,jdbcType=DATE}, #{htSaleWarranty,jdbcType=INTEGER}, ",
            "#{htSaleMoney,jdbcType=DOUBLE}, #{htSaleUpmoney,jdbcType=VARCHAR}, ",
            "#{htSaleState,jdbcType=BIT}, #{pNum,jdbcType=VARCHAR}, #{htSalePaystyle,jdbcType=VARCHAR}, ",
            "#{htSaleDingjin,jdbcType=DOUBLE}, #{htSaleDingjinRate,jdbcType=INTEGER}, ",
            "#{htSaleTihuokuanRate,jdbcType=INTEGER}, #{htSaleTihuokuan,jdbcType=DOUBLE}, ",
            "#{htSaleDesc,jdbcType=VARCHAR}, #{htSaleIsFinish,jdbcType=BIT})"
    })
    int insert(HtSale record);

    @Select({
            "select",
            "ht_sale_num, ht_sale_startdate, ht_sale_enddate, ht_sale_warranty, ht_sale_money, ",
            "ht_sale_upmoney, ht_sale_state, p_num, ht_sale_paystyle, ht_sale_dingjin, ht_sale_dingjin_rate, ",
            "ht_sale_tihuokuan_rate, ht_sale_tihuokuan, ht_sale_desc, ht_sale_is_finish",
            "from ht_sale",
            "where ht_sale_num = #{htSaleNum,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "ht_sale_num", property = "htSaleNum", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "ht_sale_startdate", property = "htSaleStartdate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_sale_enddate", property = "htSaleEnddate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_sale_warranty", property = "htSaleWarranty", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_sale_money", property = "htSaleMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_sale_upmoney", property = "htSaleUpmoney", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_sale_state", property = "htSaleState", jdbcType = JdbcType.BIT),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_sale_paystyle", property = "htSalePaystyle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_sale_dingjin", property = "htSaleDingjin", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_sale_dingjin_rate", property = "htSaleDingjinRate", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_sale_tihuokuan_rate", property = "htSaleTihuokuanRate", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_sale_tihuokuan", property = "htSaleTihuokuan", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_sale_desc", property = "htSaleDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_sale_is_finish", property = "htSaleIsFinish", jdbcType = JdbcType.BIT)
    })
    HtSale selectByPrimaryKey(String htSaleNum);

    @Select({
            "select",
            "ht_sale_num, ht_sale_startdate, ht_sale_enddate, ht_sale_warranty, ht_sale_money, ",
            "ht_sale_upmoney, ht_sale_state, p_num, ht_sale_paystyle, ht_sale_dingjin, ht_sale_dingjin_rate, ",
            "ht_sale_tihuokuan_rate, ht_sale_tihuokuan, ht_sale_desc, ht_sale_is_finish",
            "from ht_sale"
    })
    @Results({
            @Result(column = "ht_sale_num", property = "htSaleNum", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "ht_sale_startdate", property = "htSaleStartdate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_sale_enddate", property = "htSaleEnddate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_sale_warranty", property = "htSaleWarranty", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_sale_money", property = "htSaleMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_sale_upmoney", property = "htSaleUpmoney", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_sale_state", property = "htSaleState", jdbcType = JdbcType.BIT),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_sale_paystyle", property = "htSalePaystyle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_sale_dingjin", property = "htSaleDingjin", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_sale_dingjin_rate", property = "htSaleDingjinRate", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_sale_tihuokuan_rate", property = "htSaleTihuokuanRate", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_sale_tihuokuan", property = "htSaleTihuokuan", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_sale_desc", property = "htSaleDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_sale_is_finish", property = "htSaleIsFinish", jdbcType = JdbcType.BIT)
    })
    List<HtSale> selectAll();

    @Update({
            "update ht_sale",
            "set ht_sale_startdate = #{htSaleStartdate,jdbcType=DATE},",
            "ht_sale_enddate = #{htSaleEnddate,jdbcType=DATE},",
            "ht_sale_warranty = #{htSaleWarranty,jdbcType=INTEGER},",
            "ht_sale_money = #{htSaleMoney,jdbcType=DOUBLE},",
            "ht_sale_upmoney = #{htSaleUpmoney,jdbcType=VARCHAR},",
            "ht_sale_state = #{htSaleState,jdbcType=BIT},",
            "p_num = #{pNum,jdbcType=VARCHAR},",
            "ht_sale_paystyle = #{htSalePaystyle,jdbcType=VARCHAR},",
            "ht_sale_dingjin = #{htSaleDingjin,jdbcType=DOUBLE},",
            "ht_sale_dingjin_rate = #{htSaleDingjinRate,jdbcType=INTEGER},",
            "ht_sale_tihuokuan_rate = #{htSaleTihuokuanRate,jdbcType=INTEGER},",
            "ht_sale_tihuokuan = #{htSaleTihuokuan,jdbcType=DOUBLE},",
            "ht_sale_desc = #{htSaleDesc,jdbcType=VARCHAR},",
            "ht_sale_is_finish = #{htSaleIsFinish,jdbcType=BIT}",
            "where ht_sale_num = #{htSaleNum,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(HtSale record);
}