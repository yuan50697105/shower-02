create table admin_permission
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                         null comment 'createUser',
    update_user varchar(50)                         null comment 'updateUser',
    name        varchar(50)                         null comment 'name',
    role_id     bigint                              null comment '角色ID'
)
    comment '管理员权限' charset = utf8mb4;

INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (1, '2020-07-19 16:27:40', '2020-07-19 16:27:40', null, null, 'sysUser', 37);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (2, '2020-07-19 16:27:40', '2020-07-19 16:27:40', null, null, 'sysUser:query', 37);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (3, '2020-07-19 16:28:35', '2020-07-19 16:28:35', null, null, 'sysUser', 38);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (4, '2020-07-19 16:28:35', '2020-07-19 16:28:35', null, null, 'sysUser:query', 38);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (5, '2020-07-19 16:28:35', '2020-07-19 16:28:35', null, null, 'sysUser:add', 38);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (6, '2020-07-19 16:28:36', '2020-07-19 16:28:36', null, null, 'sysUser:update', 38);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (7, '2020-07-19 16:28:36', '2020-07-19 16:28:36', null, null, 'sysUser:delete', 38);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (8, '2020-07-19 16:47:05', '2020-07-19 16:47:05', null, null, 'sysUser', 39);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (9, '2020-07-19 16:47:05', '2020-07-19 16:47:05', null, null, 'sysUser:query', 39);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (10, '2020-07-19 16:47:05', '2020-07-19 16:47:05', null, null, 'sysUser:add', 39);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (11, '2020-07-19 16:47:05', '2020-07-19 16:47:05', null, null, 'sysUser:update', 39);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (12, '2020-07-19 16:47:05', '2020-07-19 16:47:05', null, null, 'sysUser:delete', 39);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (13, '2020-07-19 16:48:30', '2020-07-19 16:48:30', null, null, 'sysUser', 40);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (14, '2020-07-19 16:48:31', '2020-07-19 16:48:31', null, null, 'sysUser:query', 40);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (15, '2020-07-19 16:48:31', '2020-07-19 16:48:31', null, null, 'sysUser:add', 40);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (16, '2020-07-19 16:48:31', '2020-07-19 16:48:31', null, null, 'sysUser:update', 40);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (17, '2020-07-19 16:48:31', '2020-07-19 16:48:31', null, null, 'sysUser:delete', 40);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (18, '2020-07-19 16:49:44', '2020-07-19 16:49:44', null, null, 'sysUser', 41);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (19, '2020-07-19 16:49:44', '2020-07-19 16:49:44', null, null, 'sysUser:query', 41);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (20, '2020-07-19 16:49:44', '2020-07-19 16:49:44', null, null, 'sysUser:add', 41);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (21, '2020-07-19 16:49:44', '2020-07-19 16:49:44', null, null, 'sysUser:update', 41);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (22, '2020-07-19 16:49:44', '2020-07-19 16:49:44', null, null, 'sysUser:delete', 41);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (23, '2020-07-19 16:50:58', '2020-07-19 16:50:58', null, null, 'sysUser', 42);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (24, '2020-07-19 16:50:58', '2020-07-19 16:50:58', null, null, 'sysUser:query', 42);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (25, '2020-07-19 16:50:58', '2020-07-19 16:50:58', null, null, 'sysUser:add', 42);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (26, '2020-07-19 16:50:58', '2020-07-19 16:50:58', null, null, 'sysUser:update', 42);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (27, '2020-07-19 16:50:58', '2020-07-19 16:50:58', null, null, 'sysUser:delete', 42);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (28, '2020-07-19 16:51:58', '2020-07-19 16:51:58', null, null, 'sysUser', 43);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (29, '2020-07-19 16:51:58', '2020-07-19 16:51:58', null, null, 'sysUser:query', 43);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (30, '2020-07-19 16:51:58', '2020-07-19 16:51:58', null, null, 'sysUser:add', 43);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (31, '2020-07-19 16:51:58', '2020-07-19 16:51:58', null, null, 'sysUser:update', 43);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (32, '2020-07-19 16:51:59', '2020-07-19 16:51:59', null, null, 'sysUser:delete', 43);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (33, '2020-07-19 17:14:02', '2020-07-19 17:14:02', null, null, 'sysUser', 44);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (34, '2020-07-19 17:14:02', '2020-07-19 17:14:02', null, null, 'sysUser:query', 44);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (35, '2020-07-19 17:14:02', '2020-07-19 17:14:02', null, null, 'sysUser:add', 44);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (36, '2020-07-19 17:14:02', '2020-07-19 17:14:02', null, null, 'sysUser:update', 44);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (37, '2020-07-19 17:14:02', '2020-07-19 17:14:02', null, null, 'sysUser:delete', 44);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id) VALUES (39, '2020-07-19 18:06:15', '2020-07-19 18:06:15', null, null, 'sysUser', 46);