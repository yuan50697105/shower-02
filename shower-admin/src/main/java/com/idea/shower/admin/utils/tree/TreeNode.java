package com.idea.shower.admin.utils.tree;

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
public class TreeNode {

    private String id;
    private String parentId;
    private String path;
    private String name;
    private MetaBean meta;
    private List<TreeNode> children;

    @NoArgsConstructor
    @Data
    public static class MetaBean {
        private String title;
        private String icon;
        private List<String> roles;
        private List<String> permissions;
    }
}