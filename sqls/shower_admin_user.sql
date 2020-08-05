create table admin_user
(
    id              bigint(15) auto_increment comment 'id'
        primary key,
    create_time     datetime                               null comment 'createTime',
    update_time     timestamp    default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user     varchar(50)                            null comment 'createUser',
    update_user     varchar(50)                            null comment 'updateUser',
    username        varchar(50)                            null comment 'username',
    password        varchar(255)                           null comment 'password',
    name            varchar(50)                            null comment 'name',
    enabled         int                                    null comment 'enabled',
    last_login_ip   varchar(63)  default ''                null comment '最近一次登录IP地址',
    last_login_time datetime                               null comment '最近一次登录时间',
    avatar          varchar(255) default ''''              null comment '头像图片',
    deleted         tinyint(1)   default 0                 null comment '逻辑删除'
)
    comment '管理员用户' charset = utf8mb4;

INSERT INTO shower.admin_user (id, create_time, update_time, create_user, update_user, username, password, name, enabled, last_login_ip, last_login_time, avatar, deleted) VALUES (1, '2020-05-20 17:32:03', '2020-06-20 19:24:57', null, null, 'admin1234', 'admin1234', '超级管理员', 1, '', '2020-05-20 17:31:19', 'https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif', 0);
INSERT INTO shower.admin_user (id, create_time, update_time, create_user, update_user, username, password, name, enabled, last_login_ip, last_login_time, avatar, deleted) VALUES (2, '2020-06-20 18:48:37', '2020-06-20 18:48:39', null, null, 'admin2', '$2a$10$F0VlYeZwYzkko6kxFGAb.u6t56LQ.a9MPmz8u1Rqy3e', null, null, '', null, '''', 0);
INSERT INTO shower.admin_user (id, create_time, update_time, create_user, update_user, username, password, name, enabled, last_login_ip, last_login_time, avatar, deleted) VALUES (10, '2020-06-20 19:33:31', '2020-06-20 19:33:31', null, null, 'admin', '$2a$10$3KFKppIzIIliHqPy7hQV.OPy3QKxSmZ.hLqbFk/eZC1EV3NIV1uz.', '管理员', null, '', null, '''', 0);
INSERT INTO shower.admin_user (id, create_time, update_time, create_user, update_user, username, password, name, enabled, last_login_ip, last_login_time, avatar, deleted) VALUES (11, '2020-07-08 20:38:18', '2020-07-08 20:38:18', null, null, 'yuanenzhi', '$2a$10$S.PzrwijX2IxYy0F4MnTuO0vCHPozixvv6.qDIcfZq0wwkntDhOim', null, null, '', null, '''', 0);