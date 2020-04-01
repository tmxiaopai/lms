package com.tmxf.lms.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 电梯列表(DetailLift)实体类
 *
 * @author makejava
 * @since 2020-03-31 22:46:26
 */
@Getter
@Setter
public class DetailLift implements Serializable {
    private static final long serialVersionUID = 611210139081640924L;
    /**
     * 电梯编号
     */
    private Integer liftNum;
    /**
     * 电梯类型
     */
    private String liftType;
    /**
     * 电梯型号
     */
    private String liftModel;
    /**
     * 设备代码
     */
    private String deviceCode;
    /**
     * 载重量
     */
    private Object deadWeight;
    /**
     * 电梯速度
     */
    private Object liftSpeed;
    /**
     * 电梯编号
     */
    private String liftId;
    /**
     * 楼号
     */
    private Integer buildingNum;
    /**
     * 梯号
     */
    private Integer ladderNum;
    /**
     * 电梯品牌
     */
    private String liftBrand;
    /**
     * 出厂编号
     */
    private String factoryNum;
    /**
     * 提升高度
     */
    private Object liftingHeight;
    /**
     * 井道高度
     */
    private Object wellHeight;
    /**
     * 顶层高度
     */
    private Object topFloorHeight;
    /**
     * 主机功率
     */
    private Object mainEngine;
    /**
     * 单/对通
     */
    private String stCommunication;
    /**
     * 控制方式
     */
    private String controlModel;
    /**
     * 轿厢内尺寸
     */
    private String inDim;
    /**
     * 层站门
     */
    private String czm;
    /**
     * 合格证号
     */
    private String certificateNum;
    /**
     * 限速器编号
     */
    private String governorNum;
    /**
     * 曳引器编号
     */
    private String tractorNum;
    /**
     * 制动器编号
     */
    private String brakeNum;
    /**
     * UCMP编号
     */
    private String ucmpNum;
    /**
     * 轿厢缓冲器编号
     */
    private String carBufferNum;
    /**
     * 提货日期
     */
    private Object dateDelivery;
    /**
     * 安装日期
     */
    private Object dateInstall;
    /**
     * 完工日期
     */
    private Object dateFinish;
    /**
     * 电梯数量
     */
    private Integer liftCount;
    /**
     * 电梯单价
     */
    private Object liftPrice;
    /**
     * 所属项目
     */
    private String pNum;
    /**
     * 轿厢外尺寸
     */
    private String outDim;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}