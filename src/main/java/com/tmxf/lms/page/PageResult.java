package com.tmxf.lms.page;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The type Page result.
 *
 * @author TMXIAOPAI
 * @date 2020 /3/31 - 10:18
 * @package_name com.tmxf.lms.page
 */
@Getter
@Setter
public class PageResult {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数
     */
    private long totalSize;
    /**
     * 页码总数
     */
    private int totalPages;
    /**
     * 分页数据
     */
    private List<?> content;

}
