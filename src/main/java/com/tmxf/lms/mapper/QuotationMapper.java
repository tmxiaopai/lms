package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Quotation;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface QuotationMapper {
    @Delete({
            "delete from quotation",
            "where quotation_num = #{quotationNum,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String quotationNum);

    @Insert({
            "insert into quotation (quotation_num, quotation_start_date, ",
            "quotation_end_date, quotation_money, ",
            "quotation_up_money, quotation_state, ",
            "quotation_review_man, quotation_review_date, ",
            "quotation_create_date, p_num)",
            "values (#{quotationNum,jdbcType=VARCHAR}, #{quotationStartDate,jdbcType=DATE}, ",
            "#{quotationEndDate,jdbcType=DATE}, #{quotationMoney,jdbcType=DOUBLE}, ",
            "#{quotationUpMoney,jdbcType=VARCHAR}, #{quotationState,jdbcType=VARCHAR}, ",
            "#{quotationReviewMan,jdbcType=VARCHAR}, #{quotationReviewDate,jdbcType=TIMESTAMP}, ",
            "#{quotationCreateDate,jdbcType=TIMESTAMP}, #{pNum,jdbcType=VARCHAR})"
    })
    int insert(Quotation record);

    @Select({
            "select",
            "quotation_num, quotation_start_date, quotation_end_date, quotation_money, quotation_up_money, ",
            "quotation_state, quotation_review_man, quotation_review_date, quotation_create_date, ",
            "p_num",
            "from quotation",
            "where quotation_num = #{quotationNum,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "quotation_num", property = "quotationNum", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "quotation_start_date", property = "quotationStartDate", jdbcType = JdbcType.DATE),
            @Result(column = "quotation_end_date", property = "quotationEndDate", jdbcType = JdbcType.DATE),
            @Result(column = "quotation_money", property = "quotationMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "quotation_up_money", property = "quotationUpMoney", jdbcType = JdbcType.VARCHAR),
            @Result(column = "quotation_state", property = "quotationState", jdbcType = JdbcType.VARCHAR),
            @Result(column = "quotation_review_man", property = "quotationReviewMan", jdbcType = JdbcType.VARCHAR),
            @Result(column = "quotation_review_date", property = "quotationReviewDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "quotation_create_date", property = "quotationCreateDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR)
    })
    Quotation selectByPrimaryKey(String quotationNum);

    @Select({
            "select",
            "quotation_num, quotation_start_date, quotation_end_date, quotation_money, quotation_up_money, ",
            "quotation_state, quotation_review_man, quotation_review_date, quotation_create_date, ",
            "p_num",
            "from quotation"
    })
    @Results({
            @Result(column = "quotation_num", property = "quotationNum", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "quotation_start_date", property = "quotationStartDate", jdbcType = JdbcType.DATE),
            @Result(column = "quotation_end_date", property = "quotationEndDate", jdbcType = JdbcType.DATE),
            @Result(column = "quotation_money", property = "quotationMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "quotation_up_money", property = "quotationUpMoney", jdbcType = JdbcType.VARCHAR),
            @Result(column = "quotation_state", property = "quotationState", jdbcType = JdbcType.VARCHAR),
            @Result(column = "quotation_review_man", property = "quotationReviewMan", jdbcType = JdbcType.VARCHAR),
            @Result(column = "quotation_review_date", property = "quotationReviewDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "quotation_create_date", property = "quotationCreateDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR)
    })
    List<Quotation> selectAll();

    @Update({
            "update quotation",
            "set quotation_start_date = #{quotationStartDate,jdbcType=DATE},",
            "quotation_end_date = #{quotationEndDate,jdbcType=DATE},",
            "quotation_money = #{quotationMoney,jdbcType=DOUBLE},",
            "quotation_up_money = #{quotationUpMoney,jdbcType=VARCHAR},",
            "quotation_state = #{quotationState,jdbcType=VARCHAR},",
            "quotation_review_man = #{quotationReviewMan,jdbcType=VARCHAR},",
            "quotation_review_date = #{quotationReviewDate,jdbcType=TIMESTAMP},",
            "quotation_create_date = #{quotationCreateDate,jdbcType=TIMESTAMP},",
            "p_num = #{pNum,jdbcType=VARCHAR}",
            "where quotation_num = #{quotationNum,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Quotation record);
}