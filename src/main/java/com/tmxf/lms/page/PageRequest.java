package com.tmxf.lms.page;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Page request.
 *
 * @author TMXIAOPAI
 * @date 2020 /3/31 - 10:15
 * @package_name com.tmxf.lms.page
 */
@Getter
@Setter
public class PageRequest {
    private int pageNum = 1;
    private int pageSize = 10;
    private Map<String, Object> params = new HashMap<>();

    /**
     * Gets param.
     *
     * @param key the key
     * @return the param
     */
    public Object getParam(String key) {
        return getParams().get(key);
    }
}
