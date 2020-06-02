package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.DetailSale;
import com.tmxf.lms.entity.HtInstall;
import com.tmxf.lms.service.DetailSaleService;
import com.tmxf.lms.service.HtInstallService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 安装合同(HtInstall)表控制层
 *
 * @author makejava
 * @since 2020 -04-17 21:41:54
 */
@RestController
public class HtInstallController {
    /**
     * 服务对象
     */
    @Resource
    private HtInstallService htInstallService;
    @Resource
    private DetailSaleService detailSaleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据 ht install
     */
    @GetMapping("findInstallHtById")
    public HtInstall selectOne(String id) {
        return this.htInstallService.queryById(id);
    }


    /**
     * Insert install ht int.
     *
     * @param htInstall the ht install
     * @param request   the request
     * @return the int
     */
    @PostMapping("insertInstallHt")
    public int insertInstallHt(@RequestBody HtInstall htInstall, HttpServletRequest request) {

        Integer userNum = (Integer) request.getSession().getAttribute("userNum");
        DetailSale d1 = new DetailSale(htInstall.getPNum(), "入场安装费", htInstall.getHtInstallFirstM().divide(new BigDecimal(htInstall.getHtInstallLiftCount()), 2, RoundingMode.DOWN), htInstall.getHtInstallLiftCount(), htInstall.getHtInstallFirstM(), false, false);
        DetailSale d2 = new DetailSale(htInstall.getPNum(), "调试费", htInstall.getHtInstallSecondM().divide(new BigDecimal(htInstall.getHtInstallLiftCount()), 2, RoundingMode.DOWN), htInstall.getHtInstallLiftCount(), htInstall.getHtInstallSecondM(), false, false);
        DetailSale d3 = new DetailSale(htInstall.getPNum(), "安装尾款", htInstall.getHtInstallThirdM().divide(new BigDecimal(htInstall.getHtInstallLiftCount()), 2, RoundingMode.DOWN), htInstall.getHtInstallLiftCount(), htInstall.getHtInstallThirdM(), false, false);
        d1.setDetailSaleUser(userNum);
        d2.setDetailSaleUser(userNum);
        d3.setDetailSaleUser(userNum);
        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(d);
        d1.setDetailSaleNum(dateString + '1');
        d2.setDetailSaleNum(dateString + '2');
        d3.setDetailSaleNum(dateString + '3');

        detailSaleService.insert(d1);
        detailSaleService.insert(d2);
        detailSaleService.insert(d3);

        return htInstallService.insert(htInstall);
    }

    @PostMapping("queryHtInstallByE")
    public String queryHtInstallByE(@RequestBody HtInstall htInstall){
        return JSONObject.toJSONString(htInstallService.queryAll(htInstall));
    }

    /**
     * Find all install ht string.
     *
     * @return the string
     */
    @GetMapping("findAllInstallHt")
    public String findAllInstallHt() {
        return JSONObject.toJSONString(htInstallService.findAllInstallHt());
    }
}