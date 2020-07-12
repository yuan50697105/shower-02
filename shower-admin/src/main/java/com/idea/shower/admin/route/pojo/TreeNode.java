package com.idea.shower.admin.route.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 20:57
 */
@Data
public class TreeNode {
    /**
     * path : /table
     * component : Layout
     * redirect : /table/complex-table
     * name : Table
     * meta : {"title":"Table","icon":"table"}
     * children : []
     */
    private Long id;
    private Long parentId;
    private String path;
//    private String component;
    private String redirect;
    private String name;
    private MetaBean meta;
    private List<TreeNode> children;


    @Data
    public static class MetaBean {
        /**
         * title : Table
         * icon : table
         */

        private String title;
        private String icon;
        private List<String> roles;

    }
}