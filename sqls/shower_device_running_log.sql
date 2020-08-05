create table device_running_log
(
    id            bigint(15) auto_increment comment 'id'
        primary key,
    create_time   datetime                            null comment 'createTime',
    update_time   timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user   varchar(50)                         null comment 'createUser',
    update_user   varchar(50)                         null comment 'updateUser',
    device_id     bigint(15)                          null comment 'deviceId',
    device_code   varchar(50)                         null comment 'deviceCode',
    status        int                                 null comment 'status',
    person_status int                                 null comment 'personStatus',
    person_speed  double(16, 4)                       null comment 'personSpeed',
    temperature01 double(16, 4)                       null comment 'temperature01',
    temperature02 double(16, 4)                       null comment 'temperature02',
    volume01      double(16, 4)                       null comment 'volume01',
    volume02      double(16, 4)                       null comment 'volume02'
)
    comment 'device_running_log' charset = utf8mb4;

