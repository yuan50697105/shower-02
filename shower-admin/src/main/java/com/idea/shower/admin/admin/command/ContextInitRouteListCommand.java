package com.idea.shower.admin.admin.command;

import com.idea.shower.admin.admin.command.annotation.RouteUrl;
import com.idea.shower.app.db.module.dao.AdminRouteDao;
import com.idea.shower.app.db.module.pojo.AdminRoute;
import com.idea.shower.app.db.module.pojo.AdminRouteExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-26 17:03
 */
@Component
@Slf4j
public class ContextInitRouteListCommand implements ApplicationRunner {
    @Autowired
    private ApplicationContext context;
    @Autowired
    private AdminRouteDao adminRouteDao;


    private void saveRoute() {
        log.info("自动加载路由");
        ArrayList<AdminRoute> sysRoutes = new ArrayList<>();
        Map<String, Object> beans = context.getBeansWithAnnotation(Controller.class);
        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value.getClass().isAnnotationPresent(RequestMapping.class)) {
                RequestMapping annotation = value.getClass().getAnnotation(RequestMapping.class);
                String[] urls = annotation.value();
                for (String baseUrl : urls) {
                    AdminRoute route = new AdminRoute();
                    route.setUrl(baseUrl);
                    sysRoutes.add(route);
                    for (Method method : value.getClass().getMethods()) {
                        RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                AdminRoute sysRoute = new AdminRoute();
                                sysRoute.setUrl(baseUrl + "/" + url);
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        GetMapping requestMapping = method.getAnnotation(GetMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                AdminRoute sysRoute = new AdminRoute();
                                sysRoute.setUrl(baseUrl + "/" + url);
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        PostMapping requestMapping = method.getAnnotation(PostMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                AdminRoute sysRoute = new AdminRoute();
                                sysRoute.setUrl(baseUrl + "/" + url);
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        DeleteMapping requestMapping = method.getAnnotation(DeleteMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                AdminRoute sysRoute = new AdminRoute();
                                sysRoute.setUrl(baseUrl + "/" + url);
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        PutMapping requestMapping = method.getAnnotation(PutMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                AdminRoute sysRoute = new AdminRoute();
                                sysRoute.setUrl(baseUrl + "/" + url);
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        PatchMapping requestMapping = method.getAnnotation(PatchMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                AdminRoute sysRoute = new AdminRoute();
                                sysRoute.setUrl(baseUrl + "/" + url);
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }

                }
            } else {
                String baseUrl = "";
                for (Method method : value.getClass().getMethods()) {
                    RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
                    if (requestMapping != null) {
                        for (String url : requestMapping.value()) {
                            AdminRoute sysRoute = new AdminRoute();
                            sysRoute.setUrl(baseUrl + "/" + url);
                            sysRoutes.add(sysRoute);
                        }
                    }
                }
                for (Method method : value.getClass().getMethods()) {
                    GetMapping requestMapping = method.getAnnotation(GetMapping.class);
                    if (requestMapping != null) {
                        for (String url : requestMapping.value()) {
                            AdminRoute sysRoute = new AdminRoute();
                            sysRoute.setUrl(baseUrl + "/" + url);
                            sysRoutes.add(sysRoute);
                        }
                    }
                }
                for (Method method : value.getClass().getMethods()) {
                    PostMapping requestMapping = method.getAnnotation(PostMapping.class);
                    if (requestMapping != null) {
                        for (String url : requestMapping.value()) {
                            AdminRoute sysRoute = new AdminRoute();
                            sysRoute.setUrl(baseUrl + "/" + url);
                            sysRoutes.add(sysRoute);
                        }
                    }
                }
                for (Method method : value.getClass().getMethods()) {
                    DeleteMapping requestMapping = method.getAnnotation(DeleteMapping.class);
                    if (requestMapping != null) {
                        for (String url : requestMapping.value()) {
                            AdminRoute sysRoute = new AdminRoute();
                            sysRoute.setUrl(baseUrl + "/" + url);
                            sysRoutes.add(sysRoute);
                        }
                    }
                }
                for (Method method : value.getClass().getMethods()) {
                    PutMapping requestMapping = method.getAnnotation(PutMapping.class);
                    if (requestMapping != null) {
                        for (String url : requestMapping.value()) {
                            AdminRoute sysRoute = new AdminRoute();
                            sysRoute.setUrl(baseUrl + "/" + url);
                            sysRoutes.add(sysRoute);
                        }
                    }
                }
                for (Method method : value.getClass().getMethods()) {
                    PatchMapping requestMapping = method.getAnnotation(PatchMapping.class);
                    if (requestMapping != null) {
                        for (String url : requestMapping.value()) {
                            AdminRoute sysRoute = new AdminRoute();
                            sysRoute.setUrl(baseUrl + "/" + url);
                            sysRoutes.add(sysRoute);
                        }
                    }
                }
            }
        }
        List<AdminRoute> routes = adminRouteDao.selectByExample(new AdminRouteExample());
        List<String> routeUrls = routes.stream().map(AdminRoute::getUrl).collect(Collectors.toList());
        List<AdminRoute> sysRouteList = sysRoutes.stream().filter(sysRoute -> !routeUrls.contains(sysRoute.getUrl())).collect(Collectors.toList());
        for (AdminRoute adminRoute : sysRouteList) {
            adminRouteDao.insert(adminRoute);
        }
        log.info("加载路由完毕");
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        Map<String, Object> beans = context.getBeansWithAnnotation(Controller.class);
        List<AdminRoute> adminRoutes = new ArrayList<>();
        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            Object value = entry.getValue();
            String baseUrl = "";
            if (value.getClass().isAnnotationPresent(RouteUrl.class)) {
                baseUrl = value.getClass().getAnnotation(RouteUrl.class).value();
            }
            for (Method method : value.getClass().getMethods()) {
                if (method.isAnnotationPresent(RouteUrl.class)) {
                    String url = method.getAnnotation(RouteUrl.class).value();
                    url = baseUrl + "/" + url;
                    AdminRoute adminRoute = new AdminRoute();
                    adminRoute.setUrl(url);
                    adminRoutes.add(adminRoute);
                }
            }
        }
        List<AdminRoute> adminRouteList = adminRouteDao.selectByExample(new AdminRouteExample());
        List<String> routeList = adminRouteList.stream().map(AdminRoute::getUrl).collect(Collectors.toList());
        if (routeList.size() > 0) {
            adminRoutes = adminRoutes.stream().filter(adminRoute -> routeList.contains(adminRoute.getUrl())).collect(Collectors.toList());
        }
        for (AdminRoute adminRoute : adminRoutes) {
            adminRouteDao.insert(adminRoute);
        }
    }
}