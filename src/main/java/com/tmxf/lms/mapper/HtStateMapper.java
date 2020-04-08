package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.HtState;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface HtStateMapper {
    @Delete({
            "delete from ht_state",
            "where hts_id = #{htsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer htsId);

    @Insert({
            "insert into ht_state (hts_id, hts_state_det, ",
            "hts_date, hts_desc, hts_user)",
            "values (#{htsId,jdbcType=INTEGER}, #{htsStateDet,jdbcType=VARCHAR}, ",
            "#{htsDate,jdbcType=DATE}, #{htsDesc,jdbcType=VARCHAR}, #{htsUser,jdbcType=INTEGER})"
    })
    int insert(HtState record);

    @Select({
            "select",
            "hts_id, hts_state_det, hts_date, hts_desc, hts_user",
            "from ht_state",
            "where hts_id = #{htsId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "hts_id", property = "htsId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "hts_state_det", property = "htsStateDet", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hts_date", property = "htsDate", jdbcType = JdbcType.DATE),
            @Result(column = "hts_desc", property = "htsDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hts_user", property = "htsUser", jdbcType = JdbcType.INTEGER)
    })
    HtState selectByPrimaryKey(Integer htsId);

    @Select({
            "select",
            "hts_id, hts_state_det, hts_date, hts_desc, hts_user",
            "from ht_state"
    })
    @Results({
            @Result(column = "hts_id", property = "htsId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "hts_state_det", property = "htsStateDet", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hts_date", property = "htsDate", jdbcType = JdbcType.DATE),
            @Result(column = "hts_desc", property = "htsDesc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hts_user", property = "htsUser", jdbcType = JdbcType.INTEGER)
    })
    List<HtState> selectAll();

    @Update({
            "update ht_state",
            "set hts_state_det = #{htsStateDet,jdbcType=VARCHAR},",
            "hts_date = #{htsDate,jdbcType=DATE},",
            "hts_desc = #{htsDesc,jdbcType=VARCHAR},",
            "hts_user = #{htsUser,jdbcType=INTEGER}",
            "where hts_id = #{htsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HtState record);
}