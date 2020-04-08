package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.ProjectContact;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ProjectContactMapper {
    @Delete({
            "delete from project_contact",
            "where p_contact_num = #{pContactNum,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer pContactNum);

    @Insert({
            "insert into project_contact (p_contact_num, p_contact_name, ",
            "p_contact_job, p_contact_phone, ",
            "p_contact_email, p_contact_desc, ",
            "p_num)",
            "values (#{pContactNum,jdbcType=INTEGER}, #{pContactName,jdbcType=VARCHAR}, ",
            "#{pContactJob,jdbcType=VARCHAR}, #{pContactPhone,jdbcType=VARCHAR}, ",
            "#{pContactEmail,jdbcType=VARCHAR}, #{pContactDesc,jdbcType=VARCHAR}, ",
            "#{pNum,jdbcType=VARCHAR})"
    })
    int insert(ProjectContact record);

    @Select({
            "select",
            "p_contact_num, p_contact_name, p_contact_job, p_contact_phone, p_contact_email, ",
            "p_contact_desc, p_num",
            "from project_contact",
            "where p_contact_num = #{pContactNum,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "p_contact_num", property = "pContactNum", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "p_contact_name", property = "pContactName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "p_contact_job", property = "pContactJob", jdbcType = JdbcType.VARCHAR),
            @Result(column = "p_contact_phone", property = "pContactPhone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "p_contact_email", property = "pContactEmail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "p_contact_desc", property = "pContactDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR)
    })
    ProjectContact selectByPrimaryKey(Integer pContactNum);

    @Select({
            "select",
            "p_contact_num, p_contact_name, p_contact_job, p_contact_phone, p_contact_email, ",
            "p_contact_desc, p_num",
            "from project_contact"
    })
    @Results({
            @Result(column = "p_contact_num", property = "pContactNum", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "p_contact_name", property = "pContactName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "p_contact_job", property = "pContactJob", jdbcType = JdbcType.VARCHAR),
            @Result(column = "p_contact_phone", property = "pContactPhone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "p_contact_email", property = "pContactEmail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "p_contact_desc", property = "pContactDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR)
    })
    List<ProjectContact> selectAll();

    @Update({
            "update project_contact",
            "set p_contact_name = #{pContactName,jdbcType=VARCHAR},",
            "p_contact_job = #{pContactJob,jdbcType=VARCHAR},",
            "p_contact_phone = #{pContactPhone,jdbcType=VARCHAR},",
            "p_contact_email = #{pContactEmail,jdbcType=VARCHAR},",
            "p_contact_desc = #{pContactDesc,jdbcType=VARCHAR},",
            "p_num = #{pNum,jdbcType=VARCHAR}",
            "where p_contact_num = #{pContactNum,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProjectContact record);
}