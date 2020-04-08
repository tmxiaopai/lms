package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.ApplicationPj;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ApplicationPjMapper {
    @Delete({
            "delete from application_pj",
            "where ap_id = #{apId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer apId);

    @Insert({
            "insert into application_pj (ap_id, ap_name, ",
            "ap_count, ap_lift, ",
            "ap_state)",
            "values (#{apId,jdbcType=INTEGER}, #{apName,jdbcType=VARCHAR}, ",
            "#{apCount,jdbcType=INTEGER}, #{apLift,jdbcType=VARCHAR}, ",
            "#{apState,jdbcType=VARCHAR})"
    })
    int insert(ApplicationPj record);

    @Select({
            "select",
            "ap_id, ap_name, ap_count, ap_lift, ap_state",
            "from application_pj",
            "where ap_id = #{apId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "ap_id", property = "apId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "ap_name", property = "apName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ap_count", property = "apCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "ap_lift", property = "apLift", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ap_state", property = "apState", jdbcType = JdbcType.VARCHAR)
    })
    ApplicationPj selectByPrimaryKey(Integer apId);

    @Select({
            "select",
            "ap_id, ap_name, ap_count, ap_lift, ap_state",
            "from application_pj"
    })
    @Results({
            @Result(column = "ap_id", property = "apId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "ap_name", property = "apName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ap_count", property = "apCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "ap_lift", property = "apLift", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ap_state", property = "apState", jdbcType = JdbcType.VARCHAR)
    })
    List<ApplicationPj> selectAll();

    @Update({
            "update application_pj",
            "set ap_name = #{apName,jdbcType=VARCHAR},",
            "ap_count = #{apCount,jdbcType=INTEGER},",
            "ap_lift = #{apLift,jdbcType=VARCHAR},",
            "ap_state = #{apState,jdbcType=VARCHAR}",
            "where ap_id = #{apId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ApplicationPj record);
}