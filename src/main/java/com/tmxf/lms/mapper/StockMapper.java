package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Stock;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface StockMapper {
    @Delete({
            "delete from stock",
            "where stock_id = #{stockId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer stockId);

    @Insert({
            "insert into stock (stock_id, stock_name, ",
            "stock_count)",
            "values (#{stockId,jdbcType=INTEGER}, #{stockName,jdbcType=VARCHAR}, ",
            "#{stockCount,jdbcType=INTEGER})"
    })
    int insert(Stock record);

    @Select({
            "select",
            "stock_id, stock_name, stock_count",
            "from stock",
            "where stock_id = #{stockId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "stock_id", property = "stockId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "stock_name", property = "stockName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "stock_count", property = "stockCount", jdbcType = JdbcType.INTEGER)
    })
    Stock selectByPrimaryKey(Integer stockId);

    @Select({
            "select",
            "stock_id, stock_name, stock_count",
            "from stock"
    })
    @Results({
            @Result(column = "stock_id", property = "stockId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "stock_name", property = "stockName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "stock_count", property = "stockCount", jdbcType = JdbcType.INTEGER)
    })
    List<Stock> selectAll();

    @Update({
            "update stock",
            "set stock_name = #{stockName,jdbcType=VARCHAR},",
            "stock_count = #{stockCount,jdbcType=INTEGER}",
            "where stock_id = #{stockId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Stock record);
}