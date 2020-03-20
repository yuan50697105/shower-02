package com.idea.shower.app.commons.exception;

import com.idea.shower.app.commons.utils.ResultUtils;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-12 16:57
 */
public class GoodsInfoNotExistResultRuntimeException extends ResultRuntimeException {
    public GoodsInfoNotExistResultRuntimeException() {
        super(ResultUtils.goodsInfoNotExistError());
    }
}