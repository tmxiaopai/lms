package com.tmxf.lms.service;

import com.tmxf.lms.entity.DetailSale;

import java.util.List;

/**
 * The interface Detail sale service.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/21 - 17:11
 * @package_name com.tmxf.lms.service
 */
public interface DetailSaleService {
    /**
     * Ok money int.
     *
     * @param num the num
     * @return the int
     */
    int okMoney(String num);

    /**
     * Find all un list.
     *
     * @return the list
     */
    List<DetailSale> findAllUn();

    /**
     * Find all in list.
     *
     * @return the list
     */
    List<DetailSale> findAllIn();

    /**
     * Insert int.
     *
     * @param detailSale the detail sale
     * @return the int
     */
    int insert(DetailSale detailSale);

    /**
     * Invoice int.
     *
     * @param num the num
     * @return the int
     */
    int invoice(String num);

    /**
     * Query all list.
     *
     * @param detailSale the detail sale
     * @return the list
     */
    List<DetailSale> queryAll(DetailSale detailSale);
}
