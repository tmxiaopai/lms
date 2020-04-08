package com.tmxf.lms.controller;

import com.tmxf.lms.entity.Customer;
import com.tmxf.lms.entity.Notice;
import com.tmxf.lms.service.CustomerService;
import com.tmxf.lms.service.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author TMXIAOPAI
 * @date 2020/4/8 - 21:48
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class InsertDataController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private CustomerService customerService;
    @Resource
    private NoticeService noticeService;

    /**
     * 插入客户信息
     *
     * @param customer
     * @return
     */
    @PostMapping("insertCustomer")
    public Object insertCustomerInfo(@RequestBody Customer customer) {
        if (customer.getCustomerName() != null && customer.getCustomerType() != null) {
            customerService.insertCustomerInfo(customer);
            return "成功保存";
        } else if (customer.getCustomerName() == null || "".equals(customer.getCustomerName())) {
            return "客户名称为空";
        } else {
            return "输入数据无效";
        }
    }

    @PostMapping("insertNotice")
    public Object insertNotice(@RequestBody Notice notice, HttpServletRequest request) {
        notice.setNoticeDate(new Date());
        notice.setNticeMan((String) request.getSession().getAttribute("userName"));
        if (noticeService.insertNotice(notice) == 1) {
            return "成功保存";
        } else {
            return "插入失败，请检查数据";
        }
    }
}
