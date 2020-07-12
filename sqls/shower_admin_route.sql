create table admin_route
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                         null comment 'createUser',
    update_user varchar(50)                         null comment 'updateUser',
    url         varchar(50)                         null comment 'url',
    name        varchar(50)                         null comment 'name',
    parent_id   bigint(15)                          null comment 'parentId',
    weight      int                                 null comment 'weight'
)
    comment 'admin_route' charset = utf8mb4;

INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (1, '2020-07-02 21:26:59', '2020-07-02 21:26:59', null, null, 'admin/getUserInfo', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (2, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/logout', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (3, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (4, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/permission/add', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (5, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/permission/get', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (6, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/permission/list', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (7, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/permission/data', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (8, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/permission/delete', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (9, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/permission/modify', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (10, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/permission', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (11, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/role/add', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (12, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/role/get', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (13, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/role/list', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (14, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/role/data', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (15, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/role/delete', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (16, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/role/modify', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (17, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/role', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (18, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/user/add', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (19, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/user/get', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (20, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/user/list', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (21, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/user/data', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (22, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/user/delete', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (23, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/user/get/role', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (24, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/user/get/user', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (25, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/user/modify/role', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (26, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/user/modify/user', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (27, '2020-07-02 21:27:00', '2020-07-02 21:27:00', null, null, 'admin/user', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (28, '2020-07-02 21:27:01', '2020-07-02 21:27:01', null, null, '${server.error.path:${error.path:/error}}', null, null, null);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight) VALUES (29, '2020-07-08 20:30:43', '2020-07-08 20:30:43', null, null, 'admin/getRouteList', null, null, null);