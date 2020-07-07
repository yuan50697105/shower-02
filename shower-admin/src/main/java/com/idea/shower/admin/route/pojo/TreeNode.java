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
    private String component;
    private String redirect;
    private String name;
    private MetaBean meta;
    private List<TreeNode> children;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    @Data
    public static class MetaBean {
        /**
         * title : Table
         * icon : table
         */

        private String title;
        private String icon;
        private List<String> roles;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }
    }
}