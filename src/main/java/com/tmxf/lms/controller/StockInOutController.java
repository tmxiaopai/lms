package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.StockInOut;
import com.tmxf.lms.service.StockInOutService;
import com.tmxf.lms.service.StockService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 进销记录(StockInOut)表控制层
 *
 * @author makejava
 * @since 2020 -04-20 14:50:48
 */
@RestController
public class StockInOutController {
    /**
     * 服务对象
     */
    @Resource
    private StockInOutService stockInOutService;
    @Resource
    private StockService stockService;

    /**
     * Insert in stock int.
     *
     * @param stockInOut the stock in out
     * @param request    the request
     * @return the int
     */
    @PostMapping("insertInStock")
    public int insertInStock(@RequestBody StockInOut stockInOut, HttpServletRequest request) {
        stockInOut.setSioType((short) 0);
        stockInOut.setSioDate(new Date());
        stockInOut.setSioUser((String) request.getSession().getAttribute("userName"));
        if (stockInOutService.insert(stockInOut) != 1) {
            return 0;
        }
        return stockService.updateInByTwo(stockInOut.getStockNum(), stockInOut.getSioCount());
    }

    /**
     * Insert out stock int.
     *
     * @param stockInOut the stock in out
     * @param request    the request
     * @return the int
     */
    @PostMapping("insertOutStock")
    public int insertOutStock(@RequestBody StockInOut stockInOut, HttpServletRequest request) {
        if (stockService.queryCountByNum(stockInOut.getStockNum()) < stockInOut.getSioCount()) {
            return 2;
        }
        stockInOut.setSioType((short) 1);
        stockInOut.setSioDate(new Date());
        stockInOut.setSioUser((String) request.getSession().getAttribute("userName"));
        if (stockInOutService.insert(stockInOut) != 1) {
            return 0;
        }
        return stockService.updateOutByTwo(stockInOut.getStockNum(), stockInOut.getSioCount());
    }

    /**
     * Find all in stock string.
     *
     * @return the string
     */
    @GetMapping("findAllInStock")
    public String findAllInStock(){
        return JSONObject.toJSONString(stockInOutService.findAllInStock((short) 0));
    }

    /**
     * Find all out stock string.
     *
     * @return the string
     */
    @GetMapping("findAllOutStock")
    public String findAllOutStock(){
        return JSONObject.toJSONString(stockInOutService.findAllInStock((short) 1));
    }
}