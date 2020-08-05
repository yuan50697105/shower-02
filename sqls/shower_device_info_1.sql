create table device_info
(
    id            bigint(15) auto_increment comment 'id'
        primary key,
    create_time   datetime                            null comment 'createTime',
    update_time   timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user   varchar(50)                         null comment 'createUser',
    update_user   varchar(50)                         null comment 'updateUser',
    code          varchar(50)                         null comment '设备编号',
    product_key   varchar(50)                         null comment '产品编号',
    device_name   varchar(50)                         null comment '设备名称',
    type          int                                 null comment '设备类型',
    price_code    varchar(50)                         null comment '定价编号',
    enabled       int       default 0                 null comment '启用状态(0:未启用；1已启用)',
    longitude     double(16, 4)                       null comment '经度',
    latitude      double(16, 4)                       null comment '纬度',
    area_id       bigint(15)                          null comment '区域ID',
    area_name     varchar(50)                         null comment '区域名称',
    building_id   bigint(15)                          null comment '楼宇ID',
    building_name varchar(50)                         null comment '楼宇名称',
    picture       varchar(50)                         null comment '设备图片',
    run_status    int       default 0                 null comment '运行状态 0 可用 1 使用中 '
)
    comment 'device_info' charset = utf8mb4;

INSERT INTO shower.device_info (id, create_time, update_time, create_user, update_user, code, product_key, device_name,
                                type, price_code, enabled, longitude, latitude, area_id, area_name, building_id,
                                building_name, picture, run_status)
VALUES (1, null, '2020-05-17 22:38:31', null, null, 'A001', 'a12mkmuZtyi', 'test_2', 1, '5', 0, null, null, 1, '山科', 1,
        '1号楼', '01.jpg', 1);