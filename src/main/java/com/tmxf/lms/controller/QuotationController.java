package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.Quotation;
import com.tmxf.lms.service.QuotationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 报价书(Quotation)表控制层
 *
 * @author makejava
 * @since 2020-05-25 03:32:58
 */
@RestController
public class QuotationController {
    Logger logger= LoggerFactory.getLogger(getClass());
    /**
     * 服务对象
     */
    @Resource
    private QuotationService quotationService;

@PostMapping("insertQuo")
    public int insertQuo(@RequestBody Quotation quotation){
    logger.info(JSONObject.toJSONString(quotation));
    return quotationService.insert(quotation);
}

@GetMapping("findAllQuo")
    public String findAllQuo(){
    return JSONObject.toJSONString(quotationService.queryAll(null));
}
@PostMapping("findQuoByPNUm")
    public String findQuoByPNUm(@RequestBody String num){
    Quotation q=new Quotation();
    q.setQProject(num);
    return JSONObject.toJSONString(quotationService.queryAll(q));
}

}