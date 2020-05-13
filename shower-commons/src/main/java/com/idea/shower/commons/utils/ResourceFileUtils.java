package com.idea.shower.commons.utils;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-22 21:30
 */
@Component
public class ResourceFileUtils {
    @Value("${file.path}")
    private String path;

    public String filePath(String fileName) {
        String path1 = StrUtil.isNotBlank(path) ? path : "";
        return path1 + "/" + fileName;
    }
}