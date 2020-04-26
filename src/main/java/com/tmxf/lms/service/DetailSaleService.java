package com.tmxf.lms.service;

import com.tmxf.lms.entity.DetailSale;

import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/4/21 - 17:11
 * @package_name com.tmxf.lms.service
 */
public interface DetailSaleService {
    int okMoney(String num);
    List<DetailSale> findAllUn();
    List<DetailSale> findAllIn();
    int insert(DetailSale detailSale);
    int invoice(String num);
    List<DetailSale> queryAll(DetailSale detailSale);
}
