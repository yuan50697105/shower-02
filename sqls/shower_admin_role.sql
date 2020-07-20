create table admin_role
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                             null comment 'createTime',
    update_time timestamp  default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                          null comment 'createUser',
    update_user varchar(50)                          null comment 'updateUser',
    name        varchar(50)                          null comment '角色名称',
    description varchar(1023)                        null comment '角色描述',
    enabled     tinyint(1) default 1                 null comment '是否启用',
    deleted     tinyint(1) default 0                 null comment '逻辑删除'
)
    comment '管理员角色' charset = utf8mb4;

INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (1, '2020-05-20 17:30:15', '2020-07-19 15:19:34', '', '', '超级管理员', '所有模块的权限', 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (2, '2020-05-20 17:30:18', '2020-05-20 17:30:28', '', '', '商场管理员', '只有商场模块的操作权限', 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (3, '2020-05-20 17:30:23', '2020-05-20 17:30:30', '', '', '推广管理员', '只有推广模块的操作权限', 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (32, '2020-07-19 15:32:19', '2020-07-19 15:32:19', null, null, 'sdsd', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (38, '2020-07-19 16:28:35', '2020-07-19 16:28:35', null, null, '财务专员', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (39, '2020-07-19 16:46:27', '2020-07-19 16:46:27', null, null, '', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (40, '2020-07-19 16:47:45', '2020-07-19 16:47:45', null, null, 'aaa', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (41, '2020-07-19 16:49:04', '2020-07-19 16:49:04', null, null, 'jghjhgj', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (42, '2020-07-19 16:50:24', '2020-07-19 16:50:24', null, null, 'asdfa', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (43, '2020-07-19 16:51:58', '2020-07-19 16:51:58', null, null, 'asdfaii', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (44, '2020-07-19 17:12:33', '2020-07-19 17:12:33', null, null, 'asdfaiiaaaa', null, 1, 0);
INSERT INTO shower.admin_role (id, create_time, update_time, create_user, update_user, name, description, enabled, deleted) VALUES (46, '2020-07-19 18:03:19', '2020-07-19 18:03:19', null, null, 'asdfaiiaaaaasdas', null, 1, 0);