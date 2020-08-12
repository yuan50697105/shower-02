create table device_running_log
(
    id            bigint(15) auto_increment comment 'id'
        primary key,
    create_time   datetime                            null comment '创建时间',
    update_time   timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    create_user   varchar(50)                         null comment '创建人',
    device_id     bigint(15)                          null comment '设备ID',
    update_user   varchar(50)                         null comment '修改人',
    device_code   varchar(50)                         null comment '设备编号',
    status        int                                 null comment '运行状态',
    person_status int                                 null comment '人员状态',
    person_speed  double(16, 4)                       null comment '人员消费',
    temperature01 double(16, 4)                       null comment '温度01',
    temperature02 double(16, 4)                       null comment '温度02',
    volume01      double(16, 4)                       null comment '水箱容量01',
    volume02      double(16, 4)                       null comment '水箱容量02'
)
    comment '设备运行日志' charset = utf8mb4;

