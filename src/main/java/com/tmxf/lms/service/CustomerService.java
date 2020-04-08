package com.tmxf.lms.service;

import com.tmxf.lms.entity.Customer;

import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/4/7 - 21:41
 * @package_name com.tmxf.lms.service
 */
public interface CustomerService {
    /**
     * 查询所有客户信息
     */
    List<Customer> FindAllCustomer();

    /**
     * 插入客户信息
     *
     * @param customer
     */
    void insertCustomerInfo(Customer customer);

    /**
     * 更新用户信息
     *
     * @param customer
     */
    void updateCustomer(Customer customer);

    /**
     * 删除单个记录
     *
     * @param customerNum
     * @return
     */
    Integer deleteCustomer(Integer customerNum);
}
