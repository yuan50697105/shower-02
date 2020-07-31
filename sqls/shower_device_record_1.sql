create table device_record
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                         null comment 'createUser',
    update_user varchar(50)                         null comment 'updateUser',
    device_id   bigint(15)                          null comment '设备ID',
    device_code varchar(50)                         null comment '设备编号',
    type        int                                 null comment '操作类型',
    content     varchar(50)                         null comment '详情'
)
    comment 'device_record' charset = utf8mb4;

