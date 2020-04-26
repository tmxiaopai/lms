package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.HtInstall;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 安装合同(HtInstall)表数据库访问层
 *
 * @author makejava
 * @since 2020 -04-16 22:39:07
 */
public interface HtInstallMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param htInstallNum 主键
     * @return 实例对象 ht install
     */
    HtInstall queryById(String htInstallNum);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<HtInstall> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param htInstall 实例对象
     * @return 对象列表 list
     */
    List<HtInstall> queryAll(HtInstall htInstall);

    /**
     * 新增数据
     *
     * @param htInstall 实例对象
     * @return 影响行数 int
     */
    int insert(HtInstall htInstall);

    /**
     * 修改数据
     *
     * @param htInstall 实例对象
     * @return 影响行数 int
     */
    int update(HtInstall htInstall);

    /**
     * 通过主键删除数据
     *
     * @param htInstallNum 主键
     * @return 影响行数 int
     */
    int deleteById(String htInstallNum);

}