package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.Quotation;
import com.tmxf.lms.service.QuotationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 报价书(Quotation)表控制层
 *
 * @author makejava
 * @since 2020-04-24 16:06:52
 */
@RestController
public class QuotationController {
    /**
     * 服务对象
     */
    @Resource
    private QuotationService quotationService;

    @GetMapping("findAllQuo")
    public String findAllQuo() {
        return JSONObject.toJSONString(this.quotationService.queryAll(null));
    }

    @PostMapping("findQuoByPNUm")
    public String findQuoByPNUm(String projectNum){
        return JSONObject.toJSONString(quotationService.queryByProNum(projectNum));
    }

    @PostMapping("insertQuo")
    public int insertQuo(@RequestBody Quotation quotation){
        return quotationService.insert(quotation);
    }

}