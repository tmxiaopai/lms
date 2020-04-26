package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.Stock;
import com.tmxf.lms.service.StockService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 库存(Stock)表控制层
 *
 * @author makejava
 * @since 2020 -04-20 14:13:30
 */
@RestController
public class StockController {
    /**
     * 服务对象
     */
    @Resource
    private StockService stockService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据 stock
     */
    @GetMapping("findStockById")
    public Stock selectOne(String id) {
        return this.stockService.queryById(id);
    }

    /**
     * Find all stock string.
     *
     * @return the string
     */
    @GetMapping("findAllStock")
    public String findAllStock(){
        return JSONObject.toJSONString(stockService.findAllStock());
    }

    /**
     * Find stock main info string.
     *
     * @return the string
     */
    @GetMapping("findStockMainInfo")
    public String findStockMainInfo(){
        return JSONObject.toJSONString(stockService.findAllStockMainInfo());
    }

}