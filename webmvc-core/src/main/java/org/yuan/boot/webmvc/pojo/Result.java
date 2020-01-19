package org.yuan.boot.webmvc.pojo;

import lombok.Builder;
import lombok.Value;

import java.io.Serializable;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:49
 */
@Value
@Builder
public class Result implements Serializable {
    private int code;
    private String message;
    private Object data;
}