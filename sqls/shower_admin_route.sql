create table admin_route
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment '创建时间',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    create_user varchar(50)                         null comment '创建人',
    update_user varchar(50)                         null comment '修改人',
    url         varchar(50)                         null comment '链接',
    name        varchar(50)                         null comment '名称',
    parent_id   bigint(15)                          null comment '父类ID',
    weight      int                                 null comment 'weight',
    role_id     bigint                              null comment '角色ID'
)
    comment 'admin_route' charset = utf8mb4;

INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (28, '2020-07-31 20:34:10', '2020-07-31 20:34:10', null, null, null, '/system', null, null, 55);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (29, '2020-07-31 20:34:10', '2020-07-31 20:34:10', null, null, null, 'role', null, null, 55);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (30, '2020-07-31 20:34:10', '2020-07-31 20:34:10', null, null, null, '/system/role/add', null, null, 55);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (31, '2020-07-31 20:34:10', '2020-07-31 20:34:10', null, null, null, '/system/role/update', null, null, 55);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (32, '2020-07-31 20:34:10', '2020-07-31 20:34:10', null, null, null, '/system/role/delete', null, null, 55);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (33, '2020-07-31 20:34:11', '2020-07-31 20:34:11', null, null, null, 'user', null, null, 55);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (34, '2020-07-31 20:34:11', '2020-07-31 20:34:11', null, null, null, '/system/user/add', null, null, 55);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (35, '2020-07-31 20:34:11', '2020-07-31 20:34:11', null, null, null, '/system/user/update', null, null, 55);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (36, '2020-07-31 20:34:11', '2020-07-31 20:34:11', null, null, null, '/system/user/delete', null, null, 55);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (37, '2020-07-31 20:34:18', '2020-07-31 20:34:18', null, null, null, '/system', null, null, 49);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (38, '2020-07-31 20:34:18', '2020-07-31 20:34:18', null, null, null, 'role', null, null, 49);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (39, '2020-07-31 20:34:18', '2020-07-31 20:34:18', null, null, null, '/system/role/add', null, null, 49);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (40, '2020-07-31 20:34:18', '2020-07-31 20:34:18', null, null, null, '/system/role/update', null, null, 49);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (41, '2020-07-31 20:34:18', '2020-07-31 20:34:18', null, null, null, '/system/role/delete', null, null, 49);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (42, '2020-07-31 20:34:18', '2020-07-31 20:34:18', null, null, null, 'user', null, null, 49);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (43, '2020-07-31 20:34:18', '2020-07-31 20:34:18', null, null, null, '/system/user/add', null, null, 49);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (44, '2020-07-31 20:34:18', '2020-07-31 20:34:18', null, null, null, '/system/user/update', null, null, 49);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (45, '2020-07-31 20:34:18', '2020-07-31 20:34:18', null, null, null, '/system/user/delete', null, null, 49);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (46, '2020-07-31 22:17:05', '2020-07-31 22:17:05', null, null, null, '/system', null, null, 1);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (47, '2020-07-31 22:17:06', '2020-07-31 22:17:06', null, null, null, 'role', null, null, 1);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (48, '2020-07-31 22:17:06', '2020-07-31 22:17:06', null, null, null, '/system/role/add', null, null, 1);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (49, '2020-07-31 22:17:06', '2020-07-31 22:17:06', null, null, null, '/system/role/update', null, null, 1);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (50, '2020-07-31 22:17:06', '2020-07-31 22:17:06', null, null, null, '/system/role/delete', null, null, 1);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (51, '2020-07-31 22:17:06', '2020-07-31 22:17:06', null, null, null, 'user', null, null, 1);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (52, '2020-07-31 22:17:06', '2020-07-31 22:17:06', null, null, null, '/system/user/add', null, null, 1);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (53, '2020-07-31 22:17:06', '2020-07-31 22:17:06', null, null, null, '/system/user/update', null, null, 1);
INSERT INTO shower.admin_route (id, create_time, update_time, create_user, update_user, url, name, parent_id, weight,
                                role_id)
VALUES (54, '2020-07-31 22:17:06', '2020-07-31 22:17:06', null, null, null, '/system/user/delete', null, null, 1);