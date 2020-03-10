package com.idea.shower.app.commons.exception;

import com.idea.shower.app.commons.utils.Results;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-12 16:53
 */
public class DeviceInfoResultRuntimeException extends ResultRuntimeException {
    public DeviceInfoResultRuntimeException() {
        super(Results.deviceInfoNotExistError());
    }
}