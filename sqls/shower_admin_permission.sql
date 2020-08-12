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
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (29, '2020-07-19 16:51:58', '2020-07-19 16:51:58', null, null, 'sysUser:query', 43);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (30, '2020-07-19 16:51:58', '2020-07-19 16:51:58', null, null, 'sysUser:add', 43);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (31, '2020-07-19 16:51:58', '2020-07-19 16:51:58', null, null, 'sysUser:update', 43);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (32, '2020-07-19 16:51:59', '2020-07-19 16:51:59', null, null, 'sysUser:delete', 43);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (33, '2020-07-19 17:14:02', '2020-07-19 17:14:02', null, null, 'sysUser', 44);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (34, '2020-07-19 17:14:02', '2020-07-19 17:14:02', null, null, 'sysUser:query', 44);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (35, '2020-07-19 17:14:02', '2020-07-19 17:14:02', null, null, 'sysUser:add', 44);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (36, '2020-07-19 17:14:02', '2020-07-19 17:14:02', null, null, 'sysUser:update', 44);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (37, '2020-07-19 17:14:02', '2020-07-19 17:14:02', null, null, 'sysUser:delete', 44);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (39, '2020-07-19 18:06:15', '2020-07-19 18:06:15', null, null, 'sysUser', 46);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (54, '2020-07-21 23:22:15', '2020-07-21 23:22:15', null, null, 'system', 49);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (55, '2020-07-21 23:22:15', '2020-07-21 23:22:15', null, null, 'system:role', 49);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (56, '2020-07-21 23:22:15', '2020-07-21 23:22:15', null, null, 'system:role:add', 49);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (57, '2020-07-21 23:22:16', '2020-07-21 23:22:16', null, null, 'system:role:update', 49);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (58, '2020-07-21 23:22:16', '2020-07-21 23:22:16', null, null, 'system:role:delete', 49);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (59, '2020-07-21 23:22:16', '2020-07-21 23:22:16', null, null, 'system:user:query', 49);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (60, '2020-07-21 23:22:16', '2020-07-21 23:22:16', null, null, 'system:user:add', 49);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (61, '2020-07-21 23:22:16', '2020-07-21 23:22:16', null, null, 'system:user:update', 49);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (63, '2020-07-26 15:03:35', '2020-07-26 15:03:35', null, null, 'system', 1);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (64, '2020-07-26 15:03:35', '2020-07-26 15:03:35', null, null, 'system:role', 1);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (65, '2020-07-26 15:03:35', '2020-07-26 15:03:35', null, null, 'system:role:add', 1);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (66, '2020-07-26 15:03:35', '2020-07-26 15:03:35', null, null, 'system:role:update', 1);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (67, '2020-07-26 15:03:35', '2020-07-26 15:03:35', null, null, 'system:role:delete', 1);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (68, '2020-07-26 15:03:35', '2020-07-26 15:03:35', null, null, 'system:user:query', 1);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (69, '2020-07-26 15:03:35', '2020-07-26 15:03:35', null, null, 'system:user:add', 1);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (70, '2020-07-26 15:03:35', '2020-07-26 15:03:35', null, null, 'system:user:update', 1);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (71, '2020-07-26 15:03:35', '2020-07-26 15:03:35', null, null, 'system:user:delete', 1);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (72, '2020-07-26 15:03:45', '2020-07-26 15:03:45', null, null, 'system', 2);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (73, '2020-07-26 15:03:45', '2020-07-26 15:03:45', null, null, 'system:role', 2);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (74, '2020-07-26 15:03:45', '2020-07-26 15:03:45', null, null, 'system:role:add', 2);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (75, '2020-07-26 15:03:45', '2020-07-26 15:03:45', null, null, 'system:role:update', 2);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (76, '2020-07-26 15:03:45', '2020-07-26 15:03:45', null, null, 'system:role:delete', 2);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (77, '2020-07-26 15:03:45', '2020-07-26 15:03:45', null, null, 'system:user:query', 2);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (78, '2020-07-26 15:03:45', '2020-07-26 15:03:45', null, null, 'system:user:add', 2);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (79, '2020-07-26 15:03:45', '2020-07-26 15:03:45', null, null, 'system:user:update', 2);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (80, '2020-07-26 15:03:45', '2020-07-26 15:03:45', null, null, 'system:user:delete', 2);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (81, '2020-07-31 20:04:27', '2020-07-31 20:04:27', null, null, 'system:user:delete', 49);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (82, '2020-07-31 20:23:28', '2020-07-31 20:23:28', null, null, 'system', 55);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (83, '2020-07-31 20:23:28', '2020-07-31 20:23:28', null, null, 'system:role', 55);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (84, '2020-07-31 20:23:28', '2020-07-31 20:23:28', null, null, 'system:role:add', 55);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (85, '2020-07-31 20:23:28', '2020-07-31 20:23:28', null, null, 'system:role:update', 55);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (86, '2020-07-31 20:23:28', '2020-07-31 20:23:28', null, null, 'system:role:delete', 55);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (87, '2020-07-31 20:23:28', '2020-07-31 20:23:28', null, null, 'system:user:query', 55);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (88, '2020-07-31 20:23:28', '2020-07-31 20:23:28', null, null, 'system:user:add', 55);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (89, '2020-07-31 20:23:28', '2020-07-31 20:23:28', null, null, 'system:user:update', 55);
INSERT INTO shower.admin_permission (id, create_time, update_time, create_user, update_user, name, role_id)
VALUES (90, '2020-07-31 20:23:28', '2020-07-31 20:23:28', null, null, 'system:user:delete', 55);