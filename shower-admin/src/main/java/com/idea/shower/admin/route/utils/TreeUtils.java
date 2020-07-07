package com.idea.shower.admin.route.utils;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.idea.shower.admin.route.pojo.TreeNode;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
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
            List<TreeNode> c = test.getChildren();
            result.add(test);
            if (!CollectionUtils.isEmpty(c)) {
                result.addAll(tree2list(c));
                test.setChildren(null);//
            }
        }
        return result;
    }

    public static List<String> tree2Role(List<TreeNode> nodes) {
        nodes = tree2list(nodes);
        return nodes.stream().filter(Objects::nonNull).map(TreeNode::getMeta).filter(Objects::nonNull).map(TreeNode.MetaBean::getRoles).filter(Objects::nonNull).flatMap(Collection::stream).filter(Objects::nonNull).distinct().collect(Collectors.toList());
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
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        JSONArray objects = JSONUtil.parseArray(json);
        for (Object object : objects) {
            JSONObject jsonObject = JSONUtil.parseObj(object);
            treeNodes.add(JSONUtil.toBean(jsonObject, TreeNode.class));
        }
        List<String> list = tree2Role(treeNodes);
        System.out.println("list = " + list);

    }
}