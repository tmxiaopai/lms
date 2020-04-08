package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.HtInstall;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface HtInstallMapper {
    @Delete({
            "delete from ht_install",
            "where ht_install_num = #{htInstallNum,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String htInstallNum);

    @Insert({
            "insert into ht_install (ht_install_num, p_num, ",
            "ht_install_date, ht_install_style, ",
            "ht_install_lift_count, ht_install_startdate, ",
            "ht_install_enddate, ht_install_lift_company, ",
            "ht_install_money, ht_install_state, ",
            "ht_install_first_rate, ht_install_second_rate, ",
            "ht_install_third_rate, ht_install_first_m, ",
            "ht_install_second_m, ht_install_third_m, ",
            "ht_install_desc, ht_install_first_ready, ",
            "ht_install_second_ready, ht_install_third_ready, ",
            "ht_install_zhibaoqi, ht_install_finish_date, ",
            "ht_install_plan_date, ht_install_man, ",
            "ht_install_phone, ht_install_addr, ",
            "ht_install_yi_man, ht_install_dijian)",
            "values (#{htInstallNum,jdbcType=VARCHAR}, #{pNum,jdbcType=VARCHAR}, ",
            "#{htInstallDate,jdbcType=DATE}, #{htInstallStyle,jdbcType=VARCHAR}, ",
            "#{htInstallLiftCount,jdbcType=INTEGER}, #{htInstallStartdate,jdbcType=DATE}, ",
            "#{htInstallEnddate,jdbcType=DATE}, #{htInstallLiftCompany,jdbcType=VARCHAR}, ",
            "#{htInstallMoney,jdbcType=DOUBLE}, #{htInstallState,jdbcType=BIT}, ",
            "#{htInstallFirstRate,jdbcType=INTEGER}, #{htInstallSecondRate,jdbcType=INTEGER}, ",
            "#{htInstallThirdRate,jdbcType=INTEGER}, #{htInstallFirstM,jdbcType=DOUBLE}, ",
            "#{htInstallSecondM,jdbcType=DOUBLE}, #{htInstallThirdM,jdbcType=DOUBLE}, ",
            "#{htInstallDesc,jdbcType=VARCHAR}, #{htInstallFirstReady,jdbcType=BIT}, ",
            "#{htInstallSecondReady,jdbcType=BIT}, #{htInstallThirdReady,jdbcType=BIT}, ",
            "#{htInstallZhibaoqi,jdbcType=INTEGER}, #{htInstallFinishDate,jdbcType=DATE}, ",
            "#{htInstallPlanDate,jdbcType=DATE}, #{htInstallMan,jdbcType=VARCHAR}, ",
            "#{htInstallPhone,jdbcType=VARCHAR}, #{htInstallAddr,jdbcType=VARCHAR}, ",
            "#{htInstallYiMan,jdbcType=VARCHAR}, #{htInstallDijian,jdbcType=VARCHAR})"
    })
    int insert(HtInstall record);

    @Select({
            "select",
            "ht_install_num, p_num, ht_install_date, ht_install_style, ht_install_lift_count, ",
            "ht_install_startdate, ht_install_enddate, ht_install_lift_company, ht_install_money, ",
            "ht_install_state, ht_install_first_rate, ht_install_second_rate, ht_install_third_rate, ",
            "ht_install_first_m, ht_install_second_m, ht_install_third_m, ht_install_desc, ",
            "ht_install_first_ready, ht_install_second_ready, ht_install_third_ready, ht_install_zhibaoqi, ",
            "ht_install_finish_date, ht_install_plan_date, ht_install_man, ht_install_phone, ",
            "ht_install_addr, ht_install_yi_man, ht_install_dijian",
            "from ht_install",
            "where ht_install_num = #{htInstallNum,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "ht_install_num", property = "htInstallNum", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_date", property = "htInstallDate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_install_style", property = "htInstallStyle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_lift_count", property = "htInstallLiftCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_install_startdate", property = "htInstallStartdate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_install_enddate", property = "htInstallEnddate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_install_lift_company", property = "htInstallLiftCompany", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_money", property = "htInstallMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_install_state", property = "htInstallState", jdbcType = JdbcType.BIT),
            @Result(column = "ht_install_first_rate", property = "htInstallFirstRate", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_install_second_rate", property = "htInstallSecondRate", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_install_third_rate", property = "htInstallThirdRate", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_install_first_m", property = "htInstallFirstM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_install_second_m", property = "htInstallSecondM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_install_third_m", property = "htInstallThirdM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_install_desc", property = "htInstallDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_first_ready", property = "htInstallFirstReady", jdbcType = JdbcType.BIT),
            @Result(column = "ht_install_second_ready", property = "htInstallSecondReady", jdbcType = JdbcType.BIT),
            @Result(column = "ht_install_third_ready", property = "htInstallThirdReady", jdbcType = JdbcType.BIT),
            @Result(column = "ht_install_zhibaoqi", property = "htInstallZhibaoqi", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_install_finish_date", property = "htInstallFinishDate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_install_plan_date", property = "htInstallPlanDate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_install_man", property = "htInstallMan", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_phone", property = "htInstallPhone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_addr", property = "htInstallAddr", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_yi_man", property = "htInstallYiMan", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_dijian", property = "htInstallDijian", jdbcType = JdbcType.VARCHAR)
    })
    HtInstall selectByPrimaryKey(String htInstallNum);

    @Select({
            "select",
            "ht_install_num, p_num, ht_install_date, ht_install_style, ht_install_lift_count, ",
            "ht_install_startdate, ht_install_enddate, ht_install_lift_company, ht_install_money, ",
            "ht_install_state, ht_install_first_rate, ht_install_second_rate, ht_install_third_rate, ",
            "ht_install_first_m, ht_install_second_m, ht_install_third_m, ht_install_desc, ",
            "ht_install_first_ready, ht_install_second_ready, ht_install_third_ready, ht_install_zhibaoqi, ",
            "ht_install_finish_date, ht_install_plan_date, ht_install_man, ht_install_phone, ",
            "ht_install_addr, ht_install_yi_man, ht_install_dijian",
            "from ht_install"
    })
    @Results({
            @Result(column = "ht_install_num", property = "htInstallNum", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_date", property = "htInstallDate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_install_style", property = "htInstallStyle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_lift_count", property = "htInstallLiftCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_install_startdate", property = "htInstallStartdate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_install_enddate", property = "htInstallEnddate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_install_lift_company", property = "htInstallLiftCompany", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_money", property = "htInstallMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_install_state", property = "htInstallState", jdbcType = JdbcType.BIT),
            @Result(column = "ht_install_first_rate", property = "htInstallFirstRate", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_install_second_rate", property = "htInstallSecondRate", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_install_third_rate", property = "htInstallThirdRate", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_install_first_m", property = "htInstallFirstM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_install_second_m", property = "htInstallSecondM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_install_third_m", property = "htInstallThirdM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "ht_install_desc", property = "htInstallDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_first_ready", property = "htInstallFirstReady", jdbcType = JdbcType.BIT),
            @Result(column = "ht_install_second_ready", property = "htInstallSecondReady", jdbcType = JdbcType.BIT),
            @Result(column = "ht_install_third_ready", property = "htInstallThirdReady", jdbcType = JdbcType.BIT),
            @Result(column = "ht_install_zhibaoqi", property = "htInstallZhibaoqi", jdbcType = JdbcType.INTEGER),
            @Result(column = "ht_install_finish_date", property = "htInstallFinishDate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_install_plan_date", property = "htInstallPlanDate", jdbcType = JdbcType.DATE),
            @Result(column = "ht_install_man", property = "htInstallMan", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_phone", property = "htInstallPhone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_addr", property = "htInstallAddr", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_yi_man", property = "htInstallYiMan", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ht_install_dijian", property = "htInstallDijian", jdbcType = JdbcType.VARCHAR)
    })
    List<HtInstall> selectAll();

    @Update({
            "update ht_install",
            "set p_num = #{pNum,jdbcType=VARCHAR},",
            "ht_install_date = #{htInstallDate,jdbcType=DATE},",
            "ht_install_style = #{htInstallStyle,jdbcType=VARCHAR},",
            "ht_install_lift_count = #{htInstallLiftCount,jdbcType=INTEGER},",
            "ht_install_startdate = #{htInstallStartdate,jdbcType=DATE},",
            "ht_install_enddate = #{htInstallEnddate,jdbcType=DATE},",
            "ht_install_lift_company = #{htInstallLiftCompany,jdbcType=VARCHAR},",
            "ht_install_money = #{htInstallMoney,jdbcType=DOUBLE},",
            "ht_install_state = #{htInstallState,jdbcType=BIT},",
            "ht_install_first_rate = #{htInstallFirstRate,jdbcType=INTEGER},",
            "ht_install_second_rate = #{htInstallSecondRate,jdbcType=INTEGER},",
            "ht_install_third_rate = #{htInstallThirdRate,jdbcType=INTEGER},",
            "ht_install_first_m = #{htInstallFirstM,jdbcType=DOUBLE},",
            "ht_install_second_m = #{htInstallSecondM,jdbcType=DOUBLE},",
            "ht_install_third_m = #{htInstallThirdM,jdbcType=DOUBLE},",
            "ht_install_desc = #{htInstallDesc,jdbcType=VARCHAR},",
            "ht_install_first_ready = #{htInstallFirstReady,jdbcType=BIT},",
            "ht_install_second_ready = #{htInstallSecondReady,jdbcType=BIT},",
            "ht_install_third_ready = #{htInstallThirdReady,jdbcType=BIT},",
            "ht_install_zhibaoqi = #{htInstallZhibaoqi,jdbcType=INTEGER},",
            "ht_install_finish_date = #{htInstallFinishDate,jdbcType=DATE},",
            "ht_install_plan_date = #{htInstallPlanDate,jdbcType=DATE},",
            "ht_install_man = #{htInstallMan,jdbcType=VARCHAR},",
            "ht_install_phone = #{htInstallPhone,jdbcType=VARCHAR},",
            "ht_install_addr = #{htInstallAddr,jdbcType=VARCHAR},",
            "ht_install_yi_man = #{htInstallYiMan,jdbcType=VARCHAR},",
            "ht_install_dijian = #{htInstallDijian,jdbcType=VARCHAR}",
            "where ht_install_num = #{htInstallNum,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(HtInstall record);
}