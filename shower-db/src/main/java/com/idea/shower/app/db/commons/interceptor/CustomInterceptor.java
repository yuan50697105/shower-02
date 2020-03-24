package com.idea.shower.app.db.commons.interceptor;

import cn.hutool.core.lang.Snowflake;
import com.idea.shower.app.db.commons.interceptor.annotation.CreateTime;
import com.idea.shower.app.db.commons.interceptor.annotation.Id;
import com.idea.shower.app.db.commons.interceptor.annotation.UpdateTime;
import lombok.AllArgsConstructor;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-19 21:34
 */
@Component
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
@AllArgsConstructor
public class CustomInterceptor implements Interceptor {
    private final Snowflake snowflake;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement statement = ((MappedStatement) invocation.getArgs()[0]);
        SqlCommandType sqlCommandType = statement.getSqlCommandType();
        Object parameter = invocation.getArgs()[1];
        List<Field> fields = getAllField(parameter);
        for (Field field : fields) {
            if (field.getAnnotation(Id.class) != null) {
                if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, snowflake.nextId());
                }
            }
            if (field.getAnnotation(CreateTime.class) != null) {
                if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, new Date());
                }
            }
            if (field.getAnnotation(UpdateTime.class) != null) {
                if (SqlCommandType.INSERT.equals(sqlCommandType) || SqlCommandType.UPDATE.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, new Date());
                }
            }

        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }

    private List<Field> getAllField(Object object) {
        Class<?> type = object.getClass();
        Field[] declaredFields = type.getDeclaredFields();
        ArrayList<Field> fields = new ArrayList<>(Arrays.asList(declaredFields));
        while ((type = type.getSuperclass()) != null) {
            fields.addAll(Arrays.asList(type.getDeclaredFields()));
        }
        return fields;
    }
}