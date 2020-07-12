create table device_info_volume
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                         null comment 'createUser',
    update_user varchar(50)                         null comment 'updateUser',
    device_id   bigint(15)                          null comment '设备ID',
    volume      double(16, 4)                       null comment '热水容量'
)
    comment 'device_info_volume' charset = utf8mb4;

