package com.tmxf.lms.controller;

import com.tmxf.lms.entity.Customer;
import com.tmxf.lms.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author TMXIAOPAI
 * @date 2020/4/8 - 17:49
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class UpdateDataController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private CustomerService customerService;

    @RequestMapping(value = "updateCustomer", method = RequestMethod.POST)
    public Object updateCustomer(@RequestBody Customer customer, HttpServletRequest request) {
        logger.info("----------开始Customer信息修改逻辑----------");
        logger.info("更新的信息为" + customer.toString());
        if (customer.getCustomerNum() == null) {
            return "修改失败，工号不存在";
        } else {
            customerService.updateCustomer(customer);
        }
        return "修改成功";
    }
}
