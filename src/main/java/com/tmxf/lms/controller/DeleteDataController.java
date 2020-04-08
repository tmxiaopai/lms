package com.tmxf.lms.controller;

import com.tmxf.lms.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author TMXIAOPAI
 * @date 2020/4/8 - 21:34
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class DeleteDataController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private CustomerService customerService;

    @RequestMapping(value = "deleteCustomer", method = RequestMethod.POST)
    public Object deleteCustomer(@RequestBody Integer customerNum) {
        if (customerNum != null) {
            customerService.deleteCustomer(customerNum);
            return "成功删除";
        }
        return "删除失败";

    }
}
