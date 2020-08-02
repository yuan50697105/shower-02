package com.idea.shower.admin.utils.tree;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 20:53
 */
public class TreeUtils {
    private TreeUtils() {
    }

    /**
     * treeList转list
     *
     * @param list
     * @return
     */
    public static List<TreeNode> tree2list(List<TreeNode> list) {
        List<TreeNode> result = new ArrayList<>();
        for (TreeNode test : list) {
            result.add(test);
            List<TreeNode> c = test.getChildren();
            if (!CollectionUtils.isEmpty(c)) {
                result.addAll(tree2list(c));
                test.setChildren(null);//
            }
        }
        return result;
    }

    public static List<TreeNode> tree2listWithParent(List<TreeNode> list) {
        List<TreeNode> result = new ArrayList<>();
        for (TreeNode treeNode : list) {
            treeNode.setId(UUID.randomUUID().toString().replace("-", ""));
            List<TreeNode> children = treeNode.getChildren();
            result.add(treeNode);
            if (!CollectionUtils.isEmpty(children)) {
                ArrayList<TreeNode> leafTreeNodes = new ArrayList<>();
                for (TreeNode child : children) {
                    child.setParentId(treeNode.getId());
                    leafTreeNodes.add(child);
                }
                result.addAll(tree2listWithParent(leafTreeNodes));
                treeNode.setChildren(null);//
            }
        }
        return result;
    }

    /**
     * list转treeList
     *
     * @param list
     * @return
     */
    public static List<TreeNode> list2tree(List<TreeNode> list) {
        List<TreeNode> result = new ArrayList<>();
        Map<String, TreeNode> hash = list.stream().collect(Collectors.toMap(TreeNode::getId, treeNode -> treeNode));
        for (TreeNode test : list) {
            TreeNode p = hash.get(test.getParentId());
            if (p == null) {
                result.add(test);
            } else {
                if (p.getChildren() == null) {
                    p.setChildren(new ArrayList<>());
                }
                p.getChildren().add(test);
            }
        }
        return result;
    }

    public static List<String> tree2Role(List<TreeNode> nodes) {
        List<TreeNode> routeBeans = tree2list(nodes);
        return routeBeans.stream().filter(Objects::nonNull).map(TreeNode::getMeta).filter(Objects::nonNull).map(TreeNode.MetaBean::getRoles).filter(Objects::nonNull).flatMap(Collection::stream).filter(Objects::nonNull).distinct().collect(Collectors.toList());
    }


    public static List<String> tree2Permission(List<TreeNode> nodes) {
        List<TreeNode> routeBeans = tree2list(nodes);
        return routeBeans.stream().filter(Objects::nonNull).map(TreeNode::getMeta).filter(Objects::nonNull).map(TreeNode.MetaBean::getPermissions).filter(Objects::nonNull).flatMap(Collection::stream).filter(Objects::nonNull).distinct().collect(Collectors.toList());
    }

    public static List<String> tree2Route(List<TreeNode> nodes) {
        List<TreeNode> routeBeans = tree2list(nodes);
        return routeBeans.stream().filter(ObjectUtil::isNotEmpty).map(TreeNode::getName).filter(ObjectUtil::isNotEmpty).distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String json = "[" +
                "  {" +
                "    path: '/permission'," +
                "    redirect: '/permission/page'," +
                "    alwaysShow: true," +
                "    name: 'Permission'," +
                "    meta: {" +
                "      title: '权限设置'," +
                "      icon: 'lock'," +
                "      roles: ['超级管理员', 'editor']" +
                "    }," +
                "    children: [" +
                "      {" +
                "        path: 'page'," +
                "        name: 'PagePermission'," +
                "        meta: {" +
                "          title: 'Page Permission'," +
                "          roles: ['超级管理员']" +
                "        }" +
                "      }," +
                "      {" +
                "        path: 'directive'," +
                "        name: 'DirectivePermission'," +
                "        meta: {" +
                "          title: 'Directive Permission'" +
                "          " +
                "        }" +
                "      }," +
                "      {" +
                "        path: 'role'," +
                "        name: 'RolePermission'," +
                "        meta: {" +
                "          title: '用户角色设置'," +
                "          roles: ['超级管理员']" +
                "        }" +
                "      }" +
                "    ]" +
                "  }," +
                "" +
                "  {" +
                "    path: '/icon'," +
                "    children: [" +
                "      {" +
                "        path: 'index'," +
                "        name: 'Icons'," +
                "        meta: { title: 'Icons', icon: 'icon', noCache: true }" +
                "      }" +
                "    ]" +
                "  }," +
                "  {" +
                "    path: '/example'," +
                "    redirect: '/example/list'," +
                "    name: 'Example'," +
                "    meta: {" +
                "      title: 'Example'," +
                "      icon: 'example'" +
                "    }," +
                "    children: [" +
                "      {" +
                "        path: 'create'," +
                "        name: 'CreateArticle'," +
                "        meta: { title: 'Create Article', icon: 'edit' }" +
                "      }," +
                "      {" +
                "        path: 'edit/:id(\\\\d+)'," +
                "        name: 'EditArticle'," +
                "        meta: { title: 'Edit Article', noCache: true, activeMenu: '/example/list' }," +
                "        hidden: true" +
                "      }," +
                "      {" +
                "        path: 'list'," +
                "        name: 'ArticleList'," +
                "        meta: { title: 'Article List', icon: 'list' }" +
                "      }" +
                "    ]" +
                "  }," +
                "" +
                "  {" +
                "    path: '/tab'," +
                "    children: [" +
                "      {" +
                "        path: 'index'," +
                "        name: 'Tab'," +
                "        meta: { title: 'Tab', icon: 'tab' }" +
                "      }" +
                "    ]" +
                "  }," +
                "" +
                "  {" +
                "    path: '/error'," +
                "    redirect: 'noRedirect'," +
                "    name: 'ErrorPages'," +
                "    meta: {" +
                "      title: 'Error Pages'," +
                "      icon: '404'" +
                "    }," +
                "    children: [" +
                "      {" +
                "        path: '401'," +
                "        name: 'Page401'," +
                "        meta: { title: '401', noCache: true }" +
                "      }," +
                "      {" +
                "        path: '404'," +
                "        name: 'Page404'," +
                "        meta: { title: '404', noCache: true }" +
                "      }" +
                "    ]" +
                "  }," +
                "" +
                "  {" +
                "    path: '/error-log'," +
                "    children: [" +
                "      {" +
                "        path: 'log'," +
                "        name: 'ErrorLog'," +
                "        meta: { title: 'Error Log', icon: 'bug' }" +
                "      }" +
                "    ]" +
                "  }," +
                "" +
                "  {" +
                "    path: '/excel'," +
                "    redirect: '/excel/export-excel'," +
                "    name: 'Excel'," +
                "    meta: {" +
                "      title: 'Excel'," +
                "      icon: 'excel'" +
                "    }," +
                "    children: [" +
                "      {" +
                "        path: 'export-excel'," +
                "        name: 'ExportExcel'," +
                "        meta: { title: 'Export Excel' }" +
                "      }," +
                "      {" +
                "        path: 'export-selected-excel'," +
                "        name: 'SelectExcel'," +
                "        meta: { title: 'Export Selected' }" +
                "      }," +
                "      {" +
                "        path: 'export-merge-header'," +
                "        name: 'MergeHeader'," +
                "        meta: { title: 'Merge Header' }" +
                "      }," +
                "      {" +
                "        path: 'upload-excel'," +
                "        name: 'UploadExcel'," +
                "        meta: { title: 'Upload Excel' }" +
                "      }" +
                "    ]" +
                "  }," +
                "" +
                "  {" +
                "    path: '/zip'," +
                "    redirect: '/zip/download'," +
                "    alwaysShow: true," +
                "    name: 'Zip'," +
                "    meta: { title: 'Zip', icon: 'zip' }," +
                "    children: [" +
                "      {" +
                "        path: 'download'," +
                "        name: 'ExportZip'," +
                "        meta: { title: 'Export Zip' }" +
                "      }" +
                "    ]" +
                "  }," +
                "" +
                "  {" +
                "    path: '/pdf'," +
                "    redirect: '/pdf/index'," +
                "    children: [" +
                "      {" +
                "        path: 'index'," +
                "        name: 'PDF'," +
                "        meta: { title: 'PDF', icon: 'pdf' }" +
                "      }" +
                "    ]" +
                "  }," +
                "  {" +
                "    path: '/pdf/download'," +
                "    hidden: true" +
                "  }," +
                "" +
                "  {" +
                "    path: '/theme'," +
                "    children: [" +
                "      {" +
                "        path: 'index'," +
                "        name: 'Theme'," +
                "        meta: { title: 'Theme', icon: 'theme' }" +
                "      }" +
                "    ]" +
                "  }," +
                "" +
                "  {" +
                "    path: '/clipboard'," +
                "    children: [" +
                "      {" +
                "        path: 'index'," +
                "        name: 'ClipboardDemo'," +
                "        meta: { title: 'Clipboard', icon: 'clipboard' }" +
                "      }" +
                "    ]" +
                "  }," +
                "" +
                "  {" +
                "    path: 'external-link'," +
                "    children: [" +
                "      {" +
                "        path: 'https://github.com/PanJiaChen/vue-element-admin'," +
                "        meta: { title: 'External Link', icon: 'link' }" +
                "      }" +
                "    ]" +
                "  }," +
                "" +
                "  { path: '*', redirect: '/404', hidden: true }" +
                "]";
        json = json.replaceAll("[\\s]*", "");
        ArrayList<TreeNode> routeBeans = new ArrayList<>();
        JSONArray objects = JSONUtil.parseArray(json);
        for (Object object : objects) {
            JSONObject jsonObject = JSONUtil.parseObj(object);
            routeBeans.add(JSONUtil.toBean(jsonObject, TreeNode.class));
        }
        List<TreeNode> list = tree2listWithParent(routeBeans);
        System.out.println("JSON.toJSONString(list) = " + JSON.toJSONString(list));
        System.out.println("list = " + list);

    }

}