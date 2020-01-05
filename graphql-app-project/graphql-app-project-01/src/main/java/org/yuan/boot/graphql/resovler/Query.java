package org.yuan.boot.graphql.resovler;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import org.yuan.boot.graphql.pojo.SysUser;

import java.util.Arrays;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 16:17
 */
@Component
public class Query implements GraphQLQueryResolver {

    public List<SysUser> findUser() {
        return Arrays.asList(SysUser.builder().id(1L).name("aaa").build());
    }

    public SysUser findUser1() {
        return SysUser.builder().id(1L).name("aaa").build();
    }

}