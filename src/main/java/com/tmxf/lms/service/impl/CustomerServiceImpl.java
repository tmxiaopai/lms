package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Customer;
import com.tmxf.lms.mapper.CustomerMapper;
import com.tmxf.lms.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/4/7 - 21:42
 * @package_name com.tmxf.lms.service.impl
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> FindAllCustomer() {
        return customerMapper.findAllCustomer();
    }

    @Override
    public void insertCustomerInfo(Customer customer) {
        customerMapper.insertCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerMapper.updateCustomer(customer);
    }

    @Override
    public Integer deleteCustomer(Integer customerNum) {
        Integer flag = customerMapper.deleteCustomerByCustomerNum(customerNum);
        logger.info("删除的标志" + flag);
        return flag;
    }
}
