package com.idea.shower.admin.security.handler;

import ai.yue.library.base.view.ResultInfo;
import cn.hutool.json.JSONUtil;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-31 16:12
 */
public class JWTAuthenticationEntryPoint implements org.springframework.security.web.AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        response.setCharacterEncoding("utf-8");
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter().write(JSONUtil.toJsonPrettyStr(ResultInfo.unauthorized()));
    }
}