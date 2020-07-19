create table admin_role
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                             null comment 'createTime',
    update_time timestamp  default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                          null comment 'createUser',
    update_user varchar(50)                          null comment 'updateUser',
    name        varchar(50)                          null comment '角色名称',
    `desc`      varchar(1023)                        null comment '角色描述',
    enabled     tinyint(1) default 1                 null comment '是否启用',
    deleted     tinyint(1) default 0                 null comment '逻辑删除'
)
    comment '管理员角色' charset = utf8mb4;

INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (1, '2020-05-20 17:30:15', '2020-05-20 17:30:26', '', '', '超级管理员', '所有模块的权限', 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (2, '2020-05-20 17:30:18', '2020-05-20 17:30:28', '', '', '商场管理员', '只有商场模块的操作权限', 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (3, '2020-05-20 17:30:23', '2020-05-20 17:30:30', '', '', '推广管理员', '只有推广模块的操作权限', 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (15, '2020-06-26 16:14:46', '2020-06-26 16:14:46', null, null, '111', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (16, '2020-06-26 16:14:54', '2020-06-26 16:14:54', null, null, 'qqq', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (17, '2020-06-26 16:15:29', '2020-06-26 16:15:29', null, null, 'qqqqqq', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (18, '2020-06-26 16:18:15', '2020-06-26 16:18:15', null, null, 'sdsx', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (19, '2020-06-26 16:19:22', '2020-06-26 16:19:22', null, null, 'sxf', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (20, '2020-06-26 16:32:22', '2020-06-26 16:32:22', null, null, 'adasfgf', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (21, '2020-06-26 16:37:27', '2020-06-26 16:37:27', null, null, 'aqzzaqz', null, 1, 0);