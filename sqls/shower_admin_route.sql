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
    weight      int                                 null comment 'weight',
    role_id     bigint                              null comment '角色ID'
)
    comment 'admin_route' charset = utf8mb4;

