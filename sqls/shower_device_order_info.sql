create table device_order_info
(
    id          bigint(15)                          not null comment 'id'
        primary key,
    create_time datetime                            null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                         null comment 'createUser',
    update_user varchar(50)                         null comment 'updateUser',
    device_id   bigint(15)                          null comment '设备ID',
    device_code varchar(50)                         null comment '设备编号',
    order_id    bigint(15)                          null comment '订单ID',
    order_no    varchar(50)                         null comment '订单号',
    status      int                                 null comment '设备订单状态',
    content     varchar(50)                         null comment '详情'
)
    comment '设备订单信息（旧）' charset = utf8mb4;

