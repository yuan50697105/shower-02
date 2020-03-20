package com.idea.shower.app.commons.configuration;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 01:46
 */
@Configuration
@Log4j2
public class CacheConfiguration {
    @Bean
    KeyGenerator keyGenerator() {
        return new KeyGenerator() {
            private final static int NO_PARAM_KEY = 0;
            private String keyPrefix = "jf";// key前缀，用于区分不同项目的缓存，建议每个项目单独设置


            @Override
            public Object generate(Object target, Method method, Object... params) {

                char sp = ':';
                StringBuilder strBuilder = new StringBuilder(30);
                strBuilder.append(keyPrefix);
                strBuilder.append(sp);
                // 类名
                strBuilder.append(target.getClass().getSimpleName());
                strBuilder.append(sp);
                // 方法名
                strBuilder.append(method.getName());
                strBuilder.append(sp);
                if (params.length > 0) {
                    // 参数值
                    for (Object object : params) {
                        if (ObjectUtil.isBasicType(object.getClass())) {
                            strBuilder.append(object);
                        } else {
                            strBuilder.append(JSONUtil.toJsonStr(object).hashCode());
                        }
                    }
                } else {
                    strBuilder.append(NO_PARAM_KEY);
                }
                log.info(strBuilder.toString());
                return strBuilder.toString();
            }


            public String getKeyPrefix() {
                return keyPrefix;
            }

            public void setKeyPrefix(String keyPrefix) {
                this.keyPrefix = keyPrefix;
            }

        };
    }
}