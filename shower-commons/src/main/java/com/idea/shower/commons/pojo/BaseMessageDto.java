package com.idea.shower.commons.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-17 22:48
 */
@Data
public class BaseMessageDto implements Serializable {
    private Result result;
    private String messageId;
}