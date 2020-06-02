package com.tmxf.lms.service;

import com.tmxf.lms.entity.HtInstall;
import java.util.List;

/**
 * 安装合同(HtInstall)表服务接口
 *
 * @author makejava
 * @since 2020 -04-16 22:39:07
 */
public interface HtInstallService {

    /**
     * 通过ID查询单条数据
     *
     * @param htInstallNum 主键
     * @return 实例对象 ht install
     */
    HtInstall queryById(String htInstallNum);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表 list
     */
    List<HtInstall> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param htInstall 实例对象
     * @return 实例对象 int
     */
    int insert(HtInstall htInstall);

    /**
     * 修改数据
     *
     * @param htInstall 实例对象
     * @return 实例对象 ht install
     */
    HtInstall update(HtInstall htInstall);

    /**
     * 通过主键删除数据
     *
     * @param htInstallNum 主键
     * @return 是否成功 boolean
     */
    boolean deleteById(String htInstallNum);

    /**
     * Find all install ht list.
     *
     * @return the list
     */
    List<HtInstall> findAllInstallHt();
    List<HtInstall> queryAll(HtInstall htInstall);

}