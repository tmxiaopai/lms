package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.DetailSale;
import com.tmxf.lms.service.DetailSaleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Detail sale controller.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/21 - 17:16
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class DetailSaleController {
    @Resource
    private DetailSaleService detailSaleService;

    /**
     * Find all un string.
     *
     * @return the string
     */
    @GetMapping("findAllUnReceive")
    public String findAllUn(){
        return JSONObject.toJSONString(detailSaleService.findAllUn());
    }

    /**
     * Find all in string.
     *
     * @return the string
     */
    @GetMapping("findAllOkMoney")
    public String findAllIn(){
        return JSONObject.toJSONString(detailSaleService.findAllIn());
    }

    /**
     * Receive money int.
     *
     * @param num the num
     * @return the int
     */
    @PostMapping("receiveMoney")
    public int receiveMoney(@RequestBody String num){
        return detailSaleService.okMoney(num);
    }

    /**
     * Invoice int.
     *
     * @param num the num
     * @return the int
     */
    @PostMapping("invoice")
    public int invoice(@RequestBody String num){
        return detailSaleService.invoice(num);
    }

    /**
     * Insert rm int.
     *
     * @param ds the ds
     * @return the int
     */
    @PostMapping("insertRM")
    public int insertRm(@RequestBody DetailSale ds){
        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(d);
        ds.setDetailSaleNum(dateString);
        return detailSaleService.insert(ds);
    }

    /**
     * Search sale of project string.
     *
     * @param pnum the pnum
     * @return the string
     */
    @PostMapping("searchSaleOfProject")
    public String searchSaleOfProject(@RequestBody String pnum){
        Map<String,Object> maps=new HashMap<>();
        DetailSale insal=new DetailSale();
        insal.setDetailSaleProject(pnum);
        insal.setDetailSaleStateMoney(true);
        maps.put("InDetail",detailSaleService.queryAll(insal));
        insal.setDetailSaleStateMoney(false);
        maps.put("OutDetail",detailSaleService.queryAll(insal));
        return JSONObject.toJSONString(maps);
    }

}
