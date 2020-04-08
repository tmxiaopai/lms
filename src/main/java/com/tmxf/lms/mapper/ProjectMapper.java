package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Project;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * @author TMXIAOPAI
 */
@Mapper
public interface ProjectMapper {
    /**
     * @param record
     * @return
     */
    @Insert({
            "insert into project (project_num, project_name, ",
            "project_type, project_addr, ",
            "customer_num, project_coop_in, ",
            "project_need_count, project_desc, ",
            "project_saleman, project_design_date)",
            "values (#{projectNum,jdbcType=VARCHAR}, #{projectName,jdbcType=VARCHAR}, ",
            "#{projectType,jdbcType=VARCHAR}, #{projectAddr,jdbcType=VARCHAR}, ",
            "#{customerNum,jdbcType=INTEGER}, #{projectCoopIn,jdbcType=VARCHAR}, ",
            "#{projectNeedCount,jdbcType=INTEGER}, #{projectDesc,jdbcType=VARCHAR}, ",
            "#{projectSaleman,jdbcType=INTEGER}, #{projectDesignDate,jdbcType=TIMESTAMP})"
    })
    int insert(Project record);

    @Select({
            "select",
            "project_num, project_name, project_type, project_addr, customer_num, project_coop_in, ",
            "project_need_count, project_desc, project_saleman, project_design_date",
            "from project",
            "where project_num = #{projectNum,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "project_num", property = "projectNum", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "project_name", property = "projectName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_type", property = "projectType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_addr", property = "projectAddr", jdbcType = JdbcType.VARCHAR),
            @Result(column = "customer_num", property = "customerNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "project_coop_in", property = "projectCoopIn", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_need_count", property = "projectNeedCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "project_desc", property = "projectDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_saleman", property = "projectSaleman", jdbcType = JdbcType.INTEGER),
            @Result(column = "project_design_date", property = "projectDesignDate", jdbcType = JdbcType.TIMESTAMP)
    })
    Project selectByPrimaryKey(String projectNum);

    @Select({
            "select",
            "project_num, project_name, project_type, project_addr, customer_num, project_coop_in, ",
            "project_need_count, project_desc, project_saleman, project_design_date",
            "from project"
    })
    @Results({
            @Result(column = "project_num", property = "projectNum", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "project_name", property = "projectName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_type", property = "projectType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_addr", property = "projectAddr", jdbcType = JdbcType.VARCHAR),
            @Result(column = "customer_num", property = "customerNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "project_coop_in", property = "projectCoopIn", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_need_count", property = "projectNeedCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "project_desc", property = "projectDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_saleman", property = "projectSaleman", jdbcType = JdbcType.INTEGER),
            @Result(column = "project_design_date", property = "projectDesignDate", jdbcType = JdbcType.TIMESTAMP)
    })
    List<Project> selectAll();

    @Update({
            "update project",
            "set project_name = #{projectName,jdbcType=VARCHAR},",
            "project_type = #{projectType,jdbcType=VARCHAR},",
            "project_addr = #{projectAddr,jdbcType=VARCHAR},",
            "customer_num = #{customerNum,jdbcType=INTEGER},",
            "project_coop_in = #{projectCoopIn,jdbcType=VARCHAR},",
            "project_need_count = #{projectNeedCount,jdbcType=INTEGER},",
            "project_desc = #{projectDesc,jdbcType=VARCHAR},",
            "project_saleman = #{projectSaleman,jdbcType=INTEGER},",
            "project_design_date = #{projectDesignDate,jdbcType=TIMESTAMP}",
            "where project_num = #{projectNum,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Project record);
}