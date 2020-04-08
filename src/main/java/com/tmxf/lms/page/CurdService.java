package com.tmxf.lms.page;

import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/3/31 - 10:10
 * @package_name com.tmxf.lms.page
 */
public interface CurdService<T> {
    int save(T record);

    int delete(T record);

    int delete(List<T> record);

    T findById(String id);

    PageResult findPage(PageRequest pageRequest);
}
