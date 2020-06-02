package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.DetailSale;
import com.tmxf.lms.mapper.DetailSaleMapper;
import com.tmxf.lms.service.DetailSaleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * The type Detail sale service.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/21 - 17:11
 * @package_name com.tmxf.lms.service.impl
 */
@Service
public class DetailSaleServiceImpl implements DetailSaleService {
    @Resource
    private DetailSaleMapper detailSaleMapper;
    @Override
    public int okMoney(String num) {
        return detailSaleMapper.okMoney(num,new Date());
    }

    @Override
    public List<DetailSale> findAllUn() {
        return detailSaleMapper.selectAllUn();
    }

    @Override
    public List<DetailSale> findAllIn() {
        return detailSaleMapper.selectAllOk();
    }

    @Override
    public int insert(DetailSale detailSale) {
        return detailSaleMapper.insert(detailSale);
    }

    @Override
    public int invoice(String num) {
        return detailSaleMapper.invoice(num);
    }

    @Override
    public List<DetailSale> queryAll(DetailSale detailSale) {
        return detailSaleMapper.queryAll(detailSale);
    }
}
