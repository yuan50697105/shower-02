create table device_record
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment '创建时间',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    create_user varchar(50)                         null comment '创建人',
    update_user varchar(50)                         null comment '修改人',
    device_id   bigint(15)                          null comment '设备ID',
    device_code varchar(50)                         null comment '设备编号',
    type        int                                 null comment '操作类型',
    content     varchar(50)                         null comment '详情'
)
    comment '设备运行记录' charset = utf8mb4;

