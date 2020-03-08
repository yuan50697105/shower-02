package com.idea.shower.shower.app.commons.web.controller;

import com.idea.shower.web.webmvc.controller.ResultController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:39
 */
public abstract class BaseController extends ResultController {
    public final static String HTTP_METHOD_POST = "POST";
    public final static String HTTP_METHOD_GET = "GET";
    public final static String HTTP_METHOD_DELETE = "DELETE";
    public final static String HTTP_METHOD_PUT = "PUT";
    public final static String APPLICATION_JSON_UTF8 = "application/problem+json;charset=UTF-8";

}