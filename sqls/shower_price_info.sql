create table price_info
(
    id             bigint(15) auto_increment comment 'id'
        primary key,
    create_time    datetime                            null comment 'createTime',
    update_time    timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user    varchar(50)                         null comment 'createUser',
    update_user    varchar(50)                         null comment 'updateUser',
    code           varchar(50)                         null comment '编号',
    type           int                                 null comment '类型',
    price_code     varchar(50)                         null comment '地区码',
    time_price     decimal(13, 4)                      null comment '时间定价',
    time_interval  double(16, 4)                       null comment '时间计费间隔',
    time_unit      int                                 null comment '时间单位',
    water_price    decimal(13, 4)                      null comment '水定价',
    water_interval double(16, 4)                       null comment '水计费间隔',
    water_unit     int                                 null comment '水计费单位',
    enabled        int                                 null comment '有效'
)
    comment 'price_info' charset = utf8mb4;

INSERT INTO shower.price_info (id, create_time, update_time, create_user, update_user, code, type, price_code, time_price, time_interval, time_unit, water_price, water_interval, water_unit, enabled) VALUES (1, '2020-04-02 10:06:02', '2020-04-02 10:05:57', null, null, '5', 1, '5', 1.0000, 1, null, 1.0000, 1, null, 0);
INSERT INTO shower.price_info (id, create_time, update_time, create_user, update_user, code, type, price_code, time_price, time_interval, time_unit, water_price, water_interval, water_unit, enabled) VALUES (2, '2020-04-02 10:24:56', '2020-04-16 13:41:04', null, null, '1245537668494921728', 2, '5', 6.0000, 30, 2, 1.0000, 5, 2, 1);
INSERT INTO shower.price_info (id, create_time, update_time, create_user, update_user, code, type, price_code, time_price, time_interval, time_unit, water_price, water_interval, water_unit, enabled) VALUES (3, '2020-04-02 10:24:56', '2020-04-02 10:24:56', null, null, '1245537668792717312', 1, '3', 6.0000, 30, 2, 1.0000, 5, 2, 1);
INSERT INTO shower.price_info (id, create_time, update_time, create_user, update_user, code, type, price_code, time_price, time_interval, time_unit, water_price, water_interval, water_unit, enabled) VALUES (4, '2020-04-02 10:32:53', '2020-04-02 10:32:53', null, null, '1245539670830485504', 1, 'A1234', 6.0000, 30, 2, 1.0000, 5, 2, 1);
INSERT INTO shower.price_info (id, create_time, update_time, create_user, update_user, code, type, price_code, time_price, time_interval, time_unit, water_price, water_interval, water_unit, enabled) VALUES (6, '2020-04-04 17:53:17', '2020-04-16 13:41:04', null, null, '1246375275026059264', 2, '3', 6.0000, 30, 2, 1.0000, 5, 2, 1);
INSERT INTO shower.price_info (id, create_time, update_time, create_user, update_user, code, type, price_code, time_price, time_interval, time_unit, water_price, water_interval, water_unit, enabled) VALUES (7, '2020-04-04 17:53:17', '2020-04-16 13:41:20', null, null, '1246375275353214976', 2, 'A1234', 6.0000, 30, 2, 1.0000, 5, 2, 1);