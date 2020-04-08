package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.VisitPlan;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface VisitPlanMapper {
    @Delete({
            "delete from visit_plan",
            "where vp_id = #{vpId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer vpId);

    @Insert({
            "insert into visit_plan (vp_id, vp_date, ",
            "vp_content, vp_user, ",
            "vp_result, vp_project)",
            "values (#{vpId,jdbcType=INTEGER}, #{vpDate,jdbcType=DATE}, ",
            "#{vpContent,jdbcType=VARCHAR}, #{vpUser,jdbcType=INTEGER}, ",
            "#{vpResult,jdbcType=VARCHAR}, #{vpProject,jdbcType=VARCHAR})"
    })
    int insert(VisitPlan record);

    @Select({
            "select",
            "vp_id, vp_date, vp_content, vp_user, vp_result, vp_project",
            "from visit_plan",
            "where vp_id = #{vpId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "vp_id", property = "vpId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "vp_date", property = "vpDate", jdbcType = JdbcType.DATE),
            @Result(column = "vp_content", property = "vpContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "vp_user", property = "vpUser", jdbcType = JdbcType.INTEGER),
            @Result(column = "vp_result", property = "vpResult", jdbcType = JdbcType.VARCHAR),
            @Result(column = "vp_project", property = "vpProject", jdbcType = JdbcType.VARCHAR)
    })
    VisitPlan selectByPrimaryKey(Integer vpId);

    @Select({
            "select",
            "vp_id, vp_date, vp_content, vp_user, vp_result, vp_project",
            "from visit_plan"
    })
    @Results({
            @Result(column = "vp_id", property = "vpId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "vp_date", property = "vpDate", jdbcType = JdbcType.DATE),
            @Result(column = "vp_content", property = "vpContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "vp_user", property = "vpUser", jdbcType = JdbcType.INTEGER),
            @Result(column = "vp_result", property = "vpResult", jdbcType = JdbcType.VARCHAR),
            @Result(column = "vp_project", property = "vpProject", jdbcType = JdbcType.VARCHAR)
    })
    List<VisitPlan> selectAll();

    @Update({
            "update visit_plan",
            "set vp_date = #{vpDate,jdbcType=DATE},",
            "vp_content = #{vpContent,jdbcType=VARCHAR},",
            "vp_user = #{vpUser,jdbcType=INTEGER},",
            "vp_result = #{vpResult,jdbcType=VARCHAR},",
            "vp_project = #{vpProject,jdbcType=VARCHAR}",
            "where vp_id = #{vpId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VisitPlan record);
}