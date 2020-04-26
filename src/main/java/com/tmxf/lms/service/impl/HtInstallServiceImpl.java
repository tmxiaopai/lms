package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.HtInstall;
import com.tmxf.lms.mapper.HtInstallMapper;
import com.tmxf.lms.service.HtInstallService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 安装合同(HtInstall)表服务实现类
 *
 * @author makejava
 * @since 2020 -04-16 22:39:08
 */
@Service("htInstallService")
public class HtInstallServiceImpl implements HtInstallService {
    @Resource
    private HtInstallMapper htInstallDao;

    /**
     * 通过ID查询单条数据
     *
     * @param htInstallNum 主键
     * @return 实例对象
     */
    @Override
    public HtInstall queryById(String htInstallNum) {
        return this.htInstallDao.queryById(htInstallNum);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<HtInstall> queryAllByLimit(int offset, int limit) {
        return this.htInstallDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param htInstall 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(HtInstall htInstall) {

        return this.htInstallDao.insert(htInstall);
    }

    /**
     * 修改数据
     *
     * @param htInstall 实例对象
     * @return 实例对象
     */
    @Override
    public HtInstall update(HtInstall htInstall) {
        this.htInstallDao.update(htInstall);
        return this.queryById(htInstall.getHtInstallNum());
    }

    /**
     * 通过主键删除数据
     *
     * @param htInstallNum 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String htInstallNum) {
        return this.htInstallDao.deleteById(htInstallNum) > 0;
    }

    @Override
    public List<HtInstall> findAllInstallHt() {
        return htInstallDao.queryAll(null);
    }
}