package com.idea.shower.admin.route.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 20:57
 */
@Data
@JsonInclude()
public class RouteBean {

    private Long id;
    private String parentId;
    private String path;
    private String name;
    private MetaBean meta;
    private List<RouteBean> children;

    @NoArgsConstructor
    @Data
    public static class MetaBean {
        private String title;
        private String icon;
        private List<String> roles;
        private List<String> permissions;
    }
}