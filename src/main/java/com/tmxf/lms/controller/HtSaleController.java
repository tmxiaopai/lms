package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.DetailSale;
import com.tmxf.lms.entity.HtSale;
import com.tmxf.lms.service.DetailSaleService;
import com.tmxf.lms.service.HtSaleService;
import org.apache.poi.hpsf.Decimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 销售合同(HtSale)表控制层
 *
 * @author makejava
 * @since 2020 -04-17 16:11:52
 */
@RestController
public class HtSaleController {
    /**
     * The Logger.
     */
    Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * 服务对象
     */
    @Resource
    private HtSaleService htSaleService;
    @Resource
    private DetailSaleService detailSaleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据 ht sale
     */
    @GetMapping("findHtSaleByNum")
    public HtSale selectOne(String id) {
        return this.htSaleService.queryById(id);
    }


    /**
     * Inset sale int.
     *
     * @param htSale the ht sale
     * @return the int
     */
    @PostMapping("insertSale")
    public int insetSale(@RequestBody HtSale htSale) {
        logger.info(JSONObject.toJSONString(htSale));
        DetailSale d1=new DetailSale(htSale.getpNum(),"销售定金",htSale.getHtSaleDingjin(),1,htSale.getHtSaleDingjin(),false,false);
        DetailSale d2=new DetailSale(htSale.getpNum(),"提货款",htSale.getHtSaleTihuokuan(),1,htSale.getHtSaleTihuokuan(),false,false);
        DetailSale d3=new DetailSale(htSale.getpNum(),"销售尾款",htSale.getHtSaleMoney().subtract(htSale.getHtSaleDingjin()).subtract(htSale.getHtSaleTihuokuan()),1,htSale.getHtSaleMoney().subtract(htSale.getHtSaleDingjin()).subtract(htSale.getHtSaleTihuokuan()),false,false);

        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(d);
        d1.setDetailSaleNum(dateString+'1');
        d2.setDetailSaleNum(dateString+'2');
        d3.setDetailSaleNum(dateString+'3');

        detailSaleService.insert(d1);
        detailSaleService.insert(d2);
        detailSaleService.insert(d3);


        htSale.setHtSaleState(false);
        return htSaleService.insert(htSale);
    }

    /**
     * Check sale int.
     *
     * @param htSaleNum the ht sale num
     * @return the int
     */
    @PostMapping("checkSale")
    public  int checkSale(@RequestBody String htSaleNum){
        return htSaleService.checkSale(htSaleNum);
    }

    /**
     * Query all sale string.
     *
     * @return the string
     */
    @GetMapping("queryAllSale")
    public String queryAllSale() {
        return JSONObject.toJSONString(htSaleService.queryAllSale());
    }

    /**
     * Update salse int.
     *
     * @param htSale the ht sale
     * @return the int
     */
    @PostMapping("updateHtSale")
    public int updateSalse(@RequestBody HtSale htSale) {
        return htSaleService.update(htSale);
    }
}