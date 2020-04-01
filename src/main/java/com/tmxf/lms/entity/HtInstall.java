package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 安装合同(HtInstall)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class HtInstall implements Serializable {
    private static final long serialVersionUID = -68935273195740752L;
    /**
     * 安装合同编号
     */
    private String htInstallNum;
    /**
     * 所属项目
     */
    private String pNum;
    /**
     * 合同签订时间
     */
    private Object htInstallDate;
    /**
     * 保养类型
     */
    private String htInstallStyle;
    /**
     * 安装电梯数量
     */
    private Integer htInstallLiftCount;
    /**
     * 合同生效日期
     */
    private Object htInstallStartdate;
    /**
     * 合同截止日期
     */
    private Object htInstallEnddate;
    /**
     * 设备公司
     */
    private String htInstallLiftCompany;
    /**
     * 安装费用
     */
    private Object htInstallMoney;
    /**
     * 合同状态
     */
    private Object htInstallState;
    /**
     * 入场安装费比例
     */
    private Integer htInstallFirstRate;
    /**
     * 调试完毕费用比例
     */
    private Integer htInstallSecondRate;
    /**
     * 质保期完成比例
     */
    private Integer htInstallThirdRate;
    /**
     * 入场安装费
     */
    private Object htInstallFirstM;
    /**
     * 调试完毕费用
     */
    private Object htInstallSecondM;
    /**
     * 质保期满费用
     */
    private Object htInstallThirdM;
    /**
     * 合同备注
     */
    private String htInstallDesc;
    /**
     * 一次费用完毕
     */
    private Object htInstallFirstReady;
    /**
     * 二次费用完毕
     */
    private Object htInstallSecondReady;
    /**
     * 三次费用完毕
     */
    private Object htInstallThirdReady;
    /**
     * 质保期
     */
    private Integer htInstallZhibaoqi;
    /**
     * 竣工日期
     */
    private Object htInstallFinishDate;
    /**
     * 计划竣工日期
     */
    private Object htInstallPlanDate;
    /**
     * 甲方代表
     */
    private String htInstallMan;
    /**
     * 甲方联系方式
     */
    private String htInstallPhone;
    /**
     * 安装地址
     */
    private String htInstallAddr;
    /**
     * 乙方代表
     */
    private String htInstallYiMan;
    /**
     * 地监
     */
    private String htInstallDijian;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}