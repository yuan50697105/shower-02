package com.idea.shower.commons.utils;

import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import org.springframework.core.env.Environment;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-22 21:30
 */
public class ResourceFileUtils {
    public static String filePath(String fileName) {
        Environment environment = SpringUtil.getBean(Environment.class);
        String property = environment.getProperty("file.path");
        return StrUtil.isNotBlank(property) ? property : "" + "/" + fileName;
    }
}