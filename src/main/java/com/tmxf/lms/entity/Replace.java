package com.tmxf.lms.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * The type Replace.
 *
 * @author TMXIAOPAI
 */
@Getter
@Setter
public class Replace {
    private Integer replaceId;

    private String replaceName;

    private Integer replaceCount;

    private String replaceType;

    private String replaceDescription;

    private Date replaceDate;

    private String liftNum;

    private Short replaceStatus;
}