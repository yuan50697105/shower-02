create table shower_log
(
    id          int auto_increment
        primary key,
    admin       varchar(45)          null comment '管理员',
    ip          varchar(45)          null comment '管理员地址',
    type        int                  null comment '操作分类',
    action      varchar(45)          null comment '操作动作',
    status      tinyint(1)           null comment '操作状态',
    result      varchar(127)         null comment '操作结果，或者成功消息，或者失败消息',
    comment     varchar(255)         null comment '补充信息',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除'
)
    comment '操作日志表' collate = utf8mb4_unicode_ci;

INSERT INTO shower.shower_log (id, admin, ip, type, action, status, result, comment, add_time, update_time, deleted)
VALUES (1, 'admin123', '0:0:0:0:0:0:0:1', 1, '登录', 1, '', '', '2020-05-20 17:52:56', '2020-05-20 17:52:56', 0);
INSERT INTO shower.shower_log (id, admin, ip, type, action, status, result, comment, add_time, update_time, deleted)
VALUES (2, 'admin123', '0:0:0:0:0:0:0:1', 1, '登录', 1, '', '', '2020-05-20 17:56:54', '2020-05-20 17:56:54', 0);