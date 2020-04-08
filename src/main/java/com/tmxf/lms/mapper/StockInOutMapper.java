package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.StockInOut;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface StockInOutMapper {
    @Delete({
            "delete from stock_in_out",
            "where sio_id = #{sioId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer sioId);

    @Insert({
            "insert into stock_in_out (sio_id)",
            "values (#{sioId,jdbcType=INTEGER})"
    })
    int insert(StockInOut record);

    @Select({
            "select",
            "sio_id",
            "from stock_in_out"
    })
    @Results({
            @Result(column = "sio_id", property = "sioId", jdbcType = JdbcType.INTEGER, id = true)
    })
    List<StockInOut> selectAll();
}