package org.yuan.boot.shower.commons.exception;

import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.webmvc.exception.ResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

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