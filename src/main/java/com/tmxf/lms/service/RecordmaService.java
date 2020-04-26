package com.tmxf.lms.service;

import com.tmxf.lms.entity.Recordma;
import java.util.List;

/**
 * (Recordma)表服务接口
 *
 * @author makejava
 * @since 2020-04-23 21:45:08
 */
public interface RecordmaService {



    /**
     * 通过实体作为筛选条件查询
     *
     * @param recordma 实例对象
     * @return 对象列表
     */
    List<Recordma> queryAll(Recordma recordma);

    /**
     * 新增数据
     *
     * @param recordma 实例对象
     * @return 影响行数
     */
    int insert(Recordma recordma);

}