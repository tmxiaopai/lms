package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Recordma;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Recordma)表数据库访问层
 *
 * @author makejava
 * @since 2020 -04-23 21:45:08
 */
public interface RecordmaMapper {


    /**
     * 通过实体作为筛选条件查询
     *
     * @param recordma 实例对象
     * @return 对象列表 list
     */
    List<Recordma> queryAll(Recordma recordma);

    /**
     * 新增数据
     *
     * @param recordma 实例对象
     * @return 影响行数 int
     */
    int insert(Recordma recordma);

}