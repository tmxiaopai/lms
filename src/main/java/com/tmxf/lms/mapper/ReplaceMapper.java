package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Replace;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

/**
 * The interface Replace mapper.
 */
public interface ReplaceMapper {
    /**
     * Delete by primary key int.
     *
     * @param replaceId the replace id
     * @return the int
     */
    @Delete({
        "delete from replace",
        "where replace_id = #{replaceId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer replaceId);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    @Insert({
        "insert into replace (replace_id, replace_name, ",
        "replace_count, replace_type, ",
        "replace_description, replace_date, ",
        "lift_num, replace_status)",
        "values (#{replaceId,jdbcType=INTEGER}, #{replaceName,jdbcType=VARCHAR}, ",
        "#{replaceCount,jdbcType=INTEGER}, #{replaceType,jdbcType=VARCHAR}, ",
        "#{replaceDescription,jdbcType=VARCHAR}, #{replaceDate,jdbcType=TIMESTAMP}, ",
        "#{liftNum,jdbcType=VARCHAR}, #{replaceStatus,jdbcType=SMALLINT})"
    })
    int insert(Replace record);

    /**
     * Select by primary key replace.
     *
     * @param replaceId the replace id
     * @return the replace
     */
    @Select({
        "select",
        "replace_id, replace_name, replace_count, replace_type, replace_description, ",
        "replace_date, lift_num, replace_status",
        "from replace",
        "where replace_id = #{replaceId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="replace_id", property="replaceId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="replace_name", property="replaceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="replace_count", property="replaceCount", jdbcType=JdbcType.INTEGER),
        @Result(column="replace_type", property="replaceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="replace_description", property="replaceDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="replace_date", property="replaceDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lift_num", property="liftNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="replace_status", property="replaceStatus", jdbcType=JdbcType.SMALLINT)
    })
    Replace selectByPrimaryKey(Integer replaceId);

    /**
     * Select all list.
     *
     * @return the list
     */
    @Select({
        "select",
        "replace_id, replace_name, replace_count, replace_type, replace_description, ",
        "replace_date, lift_num, replace_status",
        "from replace"
    })
    @Results({
        @Result(column="replace_id", property="replaceId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="replace_name", property="replaceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="replace_count", property="replaceCount", jdbcType=JdbcType.INTEGER),
        @Result(column="replace_type", property="replaceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="replace_description", property="replaceDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="replace_date", property="replaceDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lift_num", property="liftNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="replace_status", property="replaceStatus", jdbcType=JdbcType.SMALLINT)
    })
    List<Replace> selectAll();

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    @Update({
        "update replace",
        "set replace_name = #{replaceName,jdbcType=VARCHAR},",
          "replace_count = #{replaceCount,jdbcType=INTEGER},",
          "replace_type = #{replaceType,jdbcType=VARCHAR},",
          "replace_description = #{replaceDescription,jdbcType=VARCHAR},",
          "replace_date = #{replaceDate,jdbcType=TIMESTAMP},",
          "lift_num = #{liftNum,jdbcType=VARCHAR},",
          "replace_status = #{replaceStatus,jdbcType=SMALLINT}",
        "where replace_id = #{replaceId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Replace record);
}