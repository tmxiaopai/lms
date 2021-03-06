package com.tmxf.lms.page;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tmxf.lms.utils.ReflectionUtils;

import java.util.List;

/**
 * The type Mybatis page helper.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/2 - 17:36
 * @package_name com.tmxf.lms.page
 */
public class MybatisPageHelper {
    /**
     * The constant findPage.
     */
    public static final String findPage = "findPage";

    /**
     * Find page page result.
     *
     * @param pageRequest the page request
     * @param mapper      the mapper
     * @return the page result
     */
    public static PageResult findPage(PageRequest pageRequest, Object mapper) {
        return findPage(pageRequest, mapper, findPage);
    }

    /**
     * Find page page result.
     *
     * @param pageRequest     the page request
     * @param mapper          the mapper
     * @param queryMethodName the query method name
     * @param args            the args
     * @return the page result
     */
    public static PageResult findPage(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args) {
        // 设置分页参数
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 利用反射调用查询方法
        Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
        return getPageResult(pageRequest, new PageInfo((List) result));
    }

    private static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
