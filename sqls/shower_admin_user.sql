create table admin_user
(
    id              bigint(15) auto_increment comment 'id'
        primary key,
    create_time     datetime                               null comment '创建时间',
    update_time     timestamp    default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    create_user     varchar(50)                            null comment '创建人',
    update_user     varchar(50)                            null comment '修改人',
    username        varchar(50)                            null comment '账户',
    password        varchar(255)                           null comment '密码',
    name            varchar(50)                            null comment '姓名',
    enabled         int                                    null comment '启用状态',
    last_login_ip   varchar(63)  default ''                null comment '最近一次登录IP地址',
    last_login_time datetime                               null comment '最近一次登录时间',
    avatar          varchar(255) default ''''              null comment '头像图片',
    deleted         tinyint(1)   default 0                 null comment '逻辑删除'
)
    comment '管理员用户' charset = utf8mb4;

INSERT INTO shower.admin_user (id, create_time, update_time, create_user, update_user, username, password, name,
                               enabled, last_login_ip, last_login_time, avatar, deleted)
VALUES (11, '2020-07-08 20:38:18', '2020-07-08 20:38:18', null, null, 'yuanenzhi',
        '$2a$10$S.PzrwijX2IxYy0F4MnTuO0vCHPozixvv6.qDIcfZq0wwkntDhOim', null, null, '', null, '''', 0);
INSERT INTO shower.admin_user (id, create_time, update_time, create_user, update_user, username, password, name,
                               enabled, last_login_ip, last_login_time, avatar, deleted)
VALUES (12, '2020-07-31 21:02:39', '2020-07-31 21:02:39', null, null, 'aaaa',
        '$2a$10$W0cLCtmSXs3/g7PxuCGJ2.YNJNuNZPHfXqGQmEFPa1uBM2YHUq6wW', 'aaa', null, '', null, '''', 0);