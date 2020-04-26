package com.tmxf.lms.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * The type Work order.
 */
@Getter
@Setter
public class WorkOrder {
    private Integer faultId;

    private String faultDescription;

    private String faultLift;

    private String checkInMan;

    private String checkInPhone;

    private Date faultDate;

    private String registerMan;

    private String solveMan;

    private Boolean isSolve;

    private String faultReason;

    private String solvePlan;

    private Date solveDate;

    private Boolean confirm;

}