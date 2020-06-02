package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Recordma;
import com.tmxf.lms.mapper.RecordmaMapper;
import com.tmxf.lms.service.RecordmaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Recordma)表服务实现类
 *
 * @author makejava
 * @since 2020 -04-23 21:45:08
 */
@Service("recordmaService")
public class RecordmaServiceImpl implements RecordmaService {
    @Resource
    private RecordmaMapper recordmaDao;

    @Override
    public List<Recordma> queryAll(Recordma recordma) {
        return recordmaDao.queryAll(recordma);
    }

    @Override
    public int insert(Recordma recordma) {
        return recordmaDao.insert(recordma);
    }
}