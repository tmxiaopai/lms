package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.StockInOut;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 进销记录(StockInOut)表数据库访问层
 *
 * @author makejava
 * @since 2020 -04-20 14:50:48
 */
public interface StockInOutMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param sioId 主键
     * @return 实例对象 stock in out
     */
    StockInOut queryById(Integer sioId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<StockInOut> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stockInOut 实例对象
     * @return 对象列表 list
     */
    List<StockInOut> queryAll(StockInOut stockInOut);

    /**
     * 新增数据
     *
     * @param stockInOut 实例对象
     * @return 影响行数 int
     */
    int insert(StockInOut stockInOut);

    /**
     * 修改数据
     *
     * @param stockInOut 实例对象
     * @return 影响行数 int
     */
    int update(StockInOut stockInOut);

    /**
     * 通过主键删除数据
     *
     * @param sioId 主键
     * @return 影响行数 int
     */
    int deleteById(Integer sioId);

    /**
     * 查询记录
     * @param type
     * @return
     */
    @Select({
            "select * from stock_in_out where sio_type = #{type} order by sio_date desc"
    })
    List<StockInOut> findAllStock(short type);

}