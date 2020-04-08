package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.WorkOrder;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface WorkOrderMapper {
    @Delete({
            "delete from work_order",
            "where wo_id = #{woId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer woId);

    @Insert({
            "insert into work_order (wo_id, wo_project, ",
            "wo_type, wo_num, wo_date, ",
            "wo_user, wo_date_resolve, ",
            "wo_date_leave, wo_desc, ",
            "wo_state, wo_lift_num)",
            "values (#{woId,jdbcType=INTEGER}, #{woProject,jdbcType=VARCHAR}, ",
            "#{woType,jdbcType=VARCHAR}, #{woNum,jdbcType=VARCHAR}, #{woDate,jdbcType=DATE}, ",
            "#{woUser,jdbcType=INTEGER}, #{woDateResolve,jdbcType=TIMESTAMP}, ",
            "#{woDateLeave,jdbcType=TIMESTAMP}, #{woDesc,jdbcType=VARCHAR}, ",
            "#{woState,jdbcType=BIT}, #{woLiftNum,jdbcType=VARCHAR})"
    })
    int insert(WorkOrder record);

    @Select({
            "select",
            "wo_id, wo_project, wo_type, wo_num, wo_date, wo_user, wo_date_resolve, wo_date_leave, ",
            "wo_desc, wo_state, wo_lift_num",
            "from work_order",
            "where wo_id = #{woId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "wo_id", property = "woId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "wo_project", property = "woProject", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wo_type", property = "woType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wo_num", property = "woNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wo_date", property = "woDate", jdbcType = JdbcType.DATE),
            @Result(column = "wo_user", property = "woUser", jdbcType = JdbcType.INTEGER),
            @Result(column = "wo_date_resolve", property = "woDateResolve", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "wo_date_leave", property = "woDateLeave", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "wo_desc", property = "woDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wo_state", property = "woState", jdbcType = JdbcType.BIT),
            @Result(column = "wo_lift_num", property = "woLiftNum", jdbcType = JdbcType.VARCHAR)
    })
    WorkOrder selectByPrimaryKey(Integer woId);

    @Select({
            "select",
            "wo_id, wo_project, wo_type, wo_num, wo_date, wo_user, wo_date_resolve, wo_date_leave, ",
            "wo_desc, wo_state, wo_lift_num",
            "from work_order"
    })
    @Results({
            @Result(column = "wo_id", property = "woId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "wo_project", property = "woProject", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wo_type", property = "woType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wo_num", property = "woNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wo_date", property = "woDate", jdbcType = JdbcType.DATE),
            @Result(column = "wo_user", property = "woUser", jdbcType = JdbcType.INTEGER),
            @Result(column = "wo_date_resolve", property = "woDateResolve", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "wo_date_leave", property = "woDateLeave", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "wo_desc", property = "woDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wo_state", property = "woState", jdbcType = JdbcType.BIT),
            @Result(column = "wo_lift_num", property = "woLiftNum", jdbcType = JdbcType.VARCHAR)
    })
    List<WorkOrder> selectAll();

    @Update({
            "update work_order",
            "set wo_project = #{woProject,jdbcType=VARCHAR},",
            "wo_type = #{woType,jdbcType=VARCHAR},",
            "wo_num = #{woNum,jdbcType=VARCHAR},",
            "wo_date = #{woDate,jdbcType=DATE},",
            "wo_user = #{woUser,jdbcType=INTEGER},",
            "wo_date_resolve = #{woDateResolve,jdbcType=TIMESTAMP},",
            "wo_date_leave = #{woDateLeave,jdbcType=TIMESTAMP},",
            "wo_desc = #{woDesc,jdbcType=VARCHAR},",
            "wo_state = #{woState,jdbcType=BIT},",
            "wo_lift_num = #{woLiftNum,jdbcType=VARCHAR}",
            "where wo_id = #{woId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(WorkOrder record);
}