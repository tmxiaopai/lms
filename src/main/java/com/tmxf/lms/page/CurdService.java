package com.tmxf.lms.page;

import java.util.List;

/**
 * The interface Curd service.
 *
 * @param <T> the type parameter
 * @author TMXIAOPAI
 * @date 2020 /3/31 - 10:10
 * @package_name com.tmxf.lms.page
 */
public interface CurdService<T> {
    /**
     * Save int.
     *
     * @param record the record
     * @return the int
     */
    int save(T record);

    /**
     * Delete int.
     *
     * @param record the record
     * @return the int
     */
    int delete(T record);

    /**
     * Delete int.
     *
     * @param record the record
     * @return the int
     */
    int delete(List<T> record);

    /**
     * Find by id t.
     *
     * @param id the id
     * @return the t
     */
    T findById(String id);

    /**
     * Find page page result.
     *
     * @param pageRequest the page request
     * @return the page result
     */
    PageResult findPage(PageRequest pageRequest);
}
