package com.idea.shower.admin.route.utils;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.idea.shower.admin.route.pojo.RouteBean;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 20:53
 */
public class RouteUtils {
    private RouteUtils() {
    }

    /**
     * treeList转list
     *
     * @param list
     * @return
     */
    public static List<RouteBean> tree2list(List<RouteBean> list) {
        List<RouteBean> result = new ArrayList<>();
        for (RouteBean test : list) {
            result.add(test);
            List<RouteBean> c = test.getChildren();
            if (!CollectionUtils.isEmpty(c)) {
                result.addAll(tree2list(c));
                test.setChildren(null);//
            }
        }
        return result;
    }

    public static List<RouteBean> tree2listWithParent(List<RouteBean> list) {
        List<RouteBean> result = new ArrayList<>();
        for (RouteBean test : list) {
            List<RouteBean> c = test.getChildren();
            test.setParentId(UUID.randomUUID().toString().replace("-", ""));
            result.add(test);
            if (!CollectionUtils.isEmpty(c)) {
                result.addAll(tree2listWithParent(c));
                test.setChildren(null);//
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
    public static List<RouteBean> list2tree(List<RouteBean> list) {
        List<RouteBean> result = new ArrayList<>();

        Map<Long, RouteBean> hash = list.stream().collect(Collectors.toMap(RouteBean::getId, test -> test));
        for (RouteBean test : list) {
            RouteBean p = hash.get(test.getParentId());
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

    public static List<String> tree2Role(List<RouteBean> nodes) {
        List<RouteBean> routeBeans = tree2list(nodes);
        return routeBeans.stream().filter(Objects::nonNull).map(RouteBean::getMeta).filter(Objects::nonNull).map(RouteBean.MetaBean::getRoles).filter(Objects::nonNull).flatMap(Collection::stream).filter(Objects::nonNull).distinct().collect(Collectors.toList());
    }


    public static List<String> tree2Permission(List<RouteBean> nodes) {
        List<RouteBean> routeBeans = tree2list(nodes);
        return routeBeans.stream().filter(Objects::nonNull).map(RouteBean::getMeta).filter(Objects::nonNull).map(RouteBean.MetaBean::getPermissions).filter(Objects::nonNull).flatMap(Collection::stream).filter(Objects::nonNull).distinct().collect(Collectors.toList());
    }

    public static List<String> tree2Route(List<RouteBean> nodes) {
        List<RouteBean> routeBeans = tree2list(nodes);
        return routeBeans.stream().filter(ObjectUtil::isNotEmpty).map(RouteBean::getName).filter(ObjectUtil::isNotEmpty).distinct().collect(Collectors.toList());
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
        ArrayList<RouteBean> routeBeans = new ArrayList<>();
        JSONArray objects = JSONUtil.parseArray(json);
        for (Object object : objects) {
            JSONObject jsonObject = JSONUtil.parseObj(object);
            routeBeans.add(JSONUtil.toBean(jsonObject, RouteBean.class));
        }
        List<String> list = tree2Role(routeBeans);
        System.out.println("list = " + list);

    }

}