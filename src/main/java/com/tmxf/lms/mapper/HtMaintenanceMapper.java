package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.HtMaintenance;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface HtMaintenanceMapper {
    @Delete({
            "delete from ht_maintenance",
            "where ht_m_num = #{htMNum,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String htMNum);

    @Insert({
            "insert into ht_maintenance (ht_m_num, p_num, ",
            "ht_m_customer, ht_m_lift_count, ",
            "ht_m_money, ht_m_paydate_style, ",
            "ht_m_pay_style, ht_m_style, ",
            "ht_m_startdate, ht_m_enddate, ",
            "ht_m_sign_date, ht_m_desc)",
            "values (#{htMNum,jdbcType=VARCHAR}, #{pNum,jdbcType=VARCHAR}, ",
            "#{htMCustomer,jdbcType=VARCHAR}, #{htMLiftCount,jdbcType=INTEGER}, ",
            "#{htMMoney,jdbcType=DOUBLE}, #{htMPaydateStyle,jdbcType=VARCHAR}, ",
            "#{htMPayStyle,jdbcType=VARCHAR}, #{htMStyle,jdbcType=VARCHAR}, ",
            "#{htMStartdate,jdbcType=DATE}, #{htMEnddate,jdbcType=DATE}, ",
            "#{htMSignDate,jdbcType=DATE}, #{htMDesc,jdbcType=VARCHAR})"
    })
    int insert(HtMaintenance record);

    @Select({
            "select",
            "ht_m_num, p_num, ht_m_customer, ht_m_lift_count, ht_m_money, ht_m_paydate_style, ",
            "ht_m_pay_style, ht_m_style, ht_m_startdate, ht_m_enddate, ht_m_sign_date, ht_m_desc",
            "from ht_maintenance",
            "where ht_m_num = #{htMNum,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "ht_m_num", property = "htMNum", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_m_customer", property = "htMCustomer", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_m_lift_count", property = "htMLiftCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_m_money", property = "htMMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_m_paydate_style", property = "htMPaydateStyle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_m_pay_style", property = "htMPayStyle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_m_style", property = "htMStyle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_m_startdate", property = "htMStartdate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_m_enddate", property = "htMEnddate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_m_sign_date", property = "htMSignDate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_m_desc", property = "htMDesc", jdbcType = JdbcType.VARCHAR)
    })
    HtMaintenance selectByPrimaryKey(String htMNum);

    @Select({
            "select",
            "ht_m_num, p_num, ht_m_customer, ht_m_lift_count, ht_m_money, ht_m_paydate_style, ",
            "ht_m_pay_style, ht_m_style, ht_m_startdate, ht_m_enddate, ht_m_sign_date, ht_m_desc",
            "from ht_maintenance"
    })
    @Results({
            @Result(column = "ht_m_num", property = "htMNum", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_m_customer", property = "htMCustomer", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_m_lift_count", property = "htMLiftCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_m_money", property = "htMMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_m_paydate_style", property = "htMPaydateStyle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_m_pay_style", property = "htMPayStyle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_m_style", property = "htMStyle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_m_startdate", property = "htMStartdate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_m_enddate", property = "htMEnddate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_m_sign_date", property = "htMSignDate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_m_desc", property = "htMDesc", jdbcType = JdbcType.VARCHAR)
    })
    List<HtMaintenance> selectAll();

    @Update({
            "update ht_maintenance",
            "set p_num = #{pNum,jdbcType=VARCHAR},",
            "ht_m_customer = #{htMCustomer,jdbcType=VARCHAR},",
            "ht_m_lift_count = #{htMLiftCount,jdbcType=INTEGER},",
            "ht_m_money = #{htMMoney,jdbcType=DOUBLE},",
            "ht_m_paydate_style = #{htMPaydateStyle,jdbcType=VARCHAR},",
            "ht_m_pay_style = #{htMPayStyle,jdbcType=VARCHAR},",
            "ht_m_style = #{htMStyle,jdbcType=VARCHAR},",
            "ht_m_startdate = #{htMStartdate,jdbcType=DATE},",
            "ht_m_enddate = #{htMEnddate,jdbcType=DATE},",
            "ht_m_sign_date = #{htMSignDate,jdbcType=DATE},",
            "ht_m_desc = #{htMDesc,jdbcType=VARCHAR}",
            "where ht_m_num = #{htMNum,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(HtMaintenance record);
}