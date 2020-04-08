package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Fault;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface FaultMapper {
    @Delete({
            "delete from fault",
            "where fault_id = #{faultId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer faultId);

    @Insert({
            "insert into fault (fault_id, fault_desc, ",
            "fault_lift, fault_time)",
            "values (#{faultId,jdbcType=INTEGER}, #{faultDesc,jdbcType=VARCHAR}, ",
            "#{faultLift,jdbcType=VARCHAR}, #{faultTime,jdbcType=DATE})"
    })
    int insert(Fault record);

    @Select({
            "select",
            "fault_id, fault_desc, fault_lift, fault_time",
            "from fault",
            "where fault_id = #{faultId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "fault_id", property = "faultId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "fault_desc", property = "faultDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "fault_lift", property = "faultLift", jdbcType = JdbcType.VARCHAR),
            @Result(column = "fault_time", property = "faultTime", jdbcType = JdbcType.DATE)
    })
    Fault selectByPrimaryKey(Integer faultId);

    @Select({
            "select",
            "fault_id, fault_desc, fault_lift, fault_time",
            "from fault"
    })
    @Results({
            @Result(column = "fault_id", property = "faultId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "fault_desc", property = "faultDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "fault_lift", property = "faultLift", jdbcType = JdbcType.VARCHAR),
            @Result(column = "fault_time", property = "faultTime", jdbcType = JdbcType.DATE)
    })
    List<Fault> selectAll();

    @Update({
            "update fault",
            "set fault_desc = #{faultDesc,jdbcType=VARCHAR},",
            "fault_lift = #{faultLift,jdbcType=VARCHAR},",
            "fault_time = #{faultTime,jdbcType=DATE}",
            "where fault_id = #{faultId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Fault record);
}