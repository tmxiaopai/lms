package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Visit;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * The interface Visit mapper.
 */
@Mapper
public interface VisitMapper {
    /**
     * Delete by primary key int.
     *
     * @param visitId the visit id
     * @return the int
     */
    @Delete({
        "delete from visit",
        "where visit_id = #{visitId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer visitId);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    @Insert({
        "insert into visit (visit_id, p_num, ",
        "send_man, visit_date, ",
        "receive_man, content, ",
        "result, degree, ",
        "mans)",
        "values (#{visitId,jdbcType=INTEGER}, #{pNum,jdbcType=VARCHAR}, ",
        "#{sendMan,jdbcType=VARCHAR}, #{visitDate,jdbcType=DATE}, ",
        "#{receiveMan,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{result,jdbcType=VARCHAR}, #{degree,jdbcType=INTEGER}, ",
        "#{mans,jdbcType=VARCHAR})"
    })
    int insert(Visit record);

    /**
     * Select by primary key visit.
     *
     * @param visitId the visit id
     * @return the visit
     */
    @Select({
        "select",
        "visit_id, p_num, send_man, visit_date, receive_man, content, result, degree, ",
        "mans",
        "from visit",
        "where visit_id = #{visitId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="visit_id", property="visitId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="p_num", property="pNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="send_man", property="sendMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="visit_date", property="visitDate", jdbcType=JdbcType.DATE),
        @Result(column="receive_man", property="receiveMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="result", property="result", jdbcType=JdbcType.VARCHAR),
        @Result(column="degree", property="degree", jdbcType=JdbcType.INTEGER),
        @Result(column="mans", property="mans", jdbcType=JdbcType.VARCHAR)
    })
    Visit selectByPrimaryKey(Integer visitId);

    /**
     * Select all list.
     *
     * @return the list
     */
    @Select({
        "select",
        "visit_id, p_num, send_man, visit_date, receive_man, content, result, degree, ",
        "mans",
        "from visit"
    })
    @Results({
        @Result(column="visit_id", property="visitId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="p_num", property="pNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="send_man", property="sendMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="visit_date", property="visitDate", jdbcType=JdbcType.DATE),
        @Result(column="receive_man", property="receiveMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="result", property="result", jdbcType=JdbcType.VARCHAR),
        @Result(column="degree", property="degree", jdbcType=JdbcType.INTEGER),
        @Result(column="mans", property="mans", jdbcType=JdbcType.VARCHAR)
    })
    List<Visit> selectAll();

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    @Update({
        "update visit",
        "set p_num = #{pNum,jdbcType=VARCHAR},",
          "send_man = #{sendMan,jdbcType=VARCHAR},",
          "visit_date = #{visitDate,jdbcType=DATE},",
          "receive_man = #{receiveMan,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "result = #{result,jdbcType=VARCHAR},",
          "degree = #{degree,jdbcType=INTEGER},",
          "mans = #{mans,jdbcType=VARCHAR}",
        "where visit_id = #{visitId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Visit record);
}