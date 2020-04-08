package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.InquirySheet;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface InquirySheetMapper {
    @Delete({
            "delete from inquiry_sheet",
            "where is_id = #{isId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer isId);

    @Insert({
            "insert into inquiry_sheet (is_id, is_project, ",
            "is_install_m, is_tiaohsi_m, ",
            "is_yunshu_m, is_danjai)",
            "values (#{isId,jdbcType=INTEGER}, #{isProject,jdbcType=VARCHAR}, ",
            "#{isInstallM,jdbcType=DOUBLE}, #{isTiaohsiM,jdbcType=DOUBLE}, ",
            "#{isYunshuM,jdbcType=DOUBLE}, #{isDanjai,jdbcType=DOUBLE})"
    })
    int insert(InquirySheet record);

    @Select({
            "select",
            "is_id, is_project, is_install_m, is_tiaohsi_m, is_yunshu_m, is_danjai",
            "from inquiry_sheet",
            "where is_id = #{isId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "is_id", property = "isId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "is_project", property = "isProject", jdbcType = JdbcType.VARCHAR),
            @Result(column = "is_install_m", property = "isInstallM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "is_tiaohsi_m", property = "isTiaohsiM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "is_yunshu_m", property = "isYunshuM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "is_danjai", property = "isDanjai", jdbcType = JdbcType.DOUBLE)
    })
    InquirySheet selectByPrimaryKey(Integer isId);

    @Select({
            "select",
            "is_id, is_project, is_install_m, is_tiaohsi_m, is_yunshu_m, is_danjai",
            "from inquiry_sheet"
    })
    @Results({
            @Result(column = "is_id", property = "isId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "is_project", property = "isProject", jdbcType = JdbcType.VARCHAR),
            @Result(column = "is_install_m", property = "isInstallM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "is_tiaohsi_m", property = "isTiaohsiM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "is_yunshu_m", property = "isYunshuM", jdbcType = JdbcType.DOUBLE),
            @Result(column = "is_danjai", property = "isDanjai", jdbcType = JdbcType.DOUBLE)
    })
    List<InquirySheet> selectAll();

    @Update({
            "update inquiry_sheet",
            "set is_project = #{isProject,jdbcType=VARCHAR},",
            "is_install_m = #{isInstallM,jdbcType=DOUBLE},",
            "is_tiaohsi_m = #{isTiaohsiM,jdbcType=DOUBLE},",
            "is_yunshu_m = #{isYunshuM,jdbcType=DOUBLE},",
            "is_danjai = #{isDanjai,jdbcType=DOUBLE}",
            "where is_id = #{isId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(InquirySheet record);
}