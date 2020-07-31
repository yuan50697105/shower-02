create table order_item
(
    id             bigint(15) auto_increment comment 'id'
        primary key,
    create_time    datetime                            null comment 'createTime',
    update_time    timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user    varchar(50)                         null comment 'createUser',
    update_user    varchar(50)                         null comment 'updateUser',
    order_id       bigint(15)                          null comment '订单ID',
    order_no       varchar(50)                         null comment '订单号',
    device_id      bigint(15)                          null comment '设备ID',
    device_code    varchar(50)                         null comment '设备编号',
    device_type    int                                 null comment '设备类型',
    price_code     varchar(50)                         null comment '价格码',
    price_id       bigint(15)                          null comment '定价ID',
    price_type     int                                 null comment '定价类型',
    time_price     decimal(13, 4)                      null comment '时间价格',
    time_interval  double(16, 4)                       null comment '时间计费间隔',
    time_unit      int                                 null comment '时间计费单位',
    start_time     datetime                            null comment '开始时间',
    end_time       datetime                            null comment '结束时间',
    time_use       double(16, 4)                       null comment '用时',
    water_price    decimal(13, 4)                      null comment '水价',
    water_interval double(16, 4)                       null comment '水计费间隔',
    water_unit     int                                 null comment '水计费单位',
    water_use      double(16, 4)                       null comment '水用量',
    total_price    decimal(13, 4)                      null comment '总价'
)
    comment 'order_item' charset = utf8mb4;

INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (1, '2020-04-02 10:09:36', '2020-04-02 10:09:36', null, null, 1, '1245533809588441088', 1, 'A001', null, '5', 1,
        1, 0.0000, 1, null, '2020-04-02 10:09:36', '2020-04-02 10:01:36', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (2, '2020-04-20 10:17:53', '2020-04-20 10:17:53', null, null, 2, '1252058875570556928', 2, 'B001', null,
        '1245537668792717312', 3, 1, 0.0000, 30, 2, '2020-04-20 10:17:53', '2020-04-20 10:30:53', 30, 1.0000, 5, null,
        5, 7.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (3, '2020-04-20 10:18:47', '2020-04-20 10:18:47', null, null, 3, '1252059103212212224', 2, 'B001', null,
        '1245537668792717312', 3, 1, 0.0000, 30, 2, '2020-04-20 10:18:47', '2020-04-20 10:30:47', 30, 1.0000, 5, null,
        5, 7.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (4, '2020-04-20 10:18:48', '2020-04-20 10:18:48', null, null, 4, '1252059108241182720', 1, 'A001', null, '5', 1,
        1, 0.0000, 1, null, '2020-04-20 10:18:48', '2020-04-20 10:01:48', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (5, '2020-04-20 10:18:50', '2020-04-20 10:18:50', null, null, 5, '1252059116789174272', 2, 'B001', null,
        '1245537668792717312', 3, 1, 0.0000, 30, 2, '2020-04-20 10:18:50', '2020-04-20 10:30:50', 30, 1.0000, 5, null,
        5, 7.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (6, '2020-04-20 10:18:52', '2020-04-20 10:18:52', null, null, 6, '1252059122329849856', 2, 'B001', null,
        '1245537668792717312', 3, 1, 0.0000, 30, 2, '2020-04-20 10:18:52', '2020-04-20 10:30:52', 30, 1.0000, 5, null,
        5, 7.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (7, '2020-04-20 10:18:53', '2020-04-20 10:18:53', null, null, 7, '1252059126406713344', 1, 'A001', null, '5', 1,
        1, 0.0000, 1, null, '2020-04-20 10:18:53', '2020-04-20 10:01:53', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (8, '2020-04-20 10:19:03', '2020-04-20 10:19:03', null, null, 8, '1252059168903401472', 2, 'B001', null,
        '1245537668792717312', 3, 1, 0.0000, 30, 2, '2020-04-20 10:19:03', '2020-04-20 10:30:03', 30, 1.0000, 5, null,
        5, 7.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (9, '2020-04-20 10:19:04', '2020-04-20 10:19:04', null, null, 9, '1252059172787326976', 1, 'A001', null, '5', 1,
        1, 0.0000, 1, null, '2020-04-20 10:19:04', '2020-04-20 10:01:04', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (10, '2020-04-20 10:29:39', '2020-04-20 10:29:39', null, null, 10, '1252061831695044608', 2, 'B001', null,
        '1245537668792717312', 3, 1, 0.0000, 30, 2, '2020-04-20 10:29:39', '2020-04-20 10:30:39', 30, 1.0000, 5, null,
        5, 7.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (11, '2020-04-20 10:31:06', '2020-04-20 10:31:06', null, null, 11, '1252062201175478272', 1, 'A001', null, '5',
        1, 1, 0.0000, 1, null, '2020-04-20 10:31:06', '2020-04-20 10:01:06', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (12, '2020-04-25 18:52:36', '2020-04-25 18:52:36', null, null, 12, '1254000347328942080', 1, 'A001', null, '5',
        1, 1, 0.0000, 1, null, '2020-04-25 18:52:36', '2020-04-25 18:01:36', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (13, '2020-04-25 18:52:42', '2020-04-25 18:52:42', null, null, 13, '1254000373409124352', 1, 'A001', null, '5',
        1, 1, 0.0000, 1, null, '2020-04-25 18:52:42', '2020-04-25 18:01:42', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (14, '2020-04-25 18:52:43', '2020-04-25 18:52:43', null, null, 14, '1254000379713163264', 1, 'A001', null, '5',
        1, 1, 0.0000, 1, null, '2020-04-25 18:52:43', '2020-04-25 18:01:43', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (15, '2020-04-25 18:52:44', '2020-04-25 18:52:44', null, null, 15, '1254000382384934912', 1, 'A001', null, '5',
        1, 1, 0.0000, 1, null, '2020-04-25 18:52:44', '2020-04-25 18:01:44', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (16, '2020-04-25 18:52:44', '2020-04-25 18:52:44', null, null, 16, '1254000383156686848', 1, 'A001', null, '5',
        1, 1, 0.0000, 1, null, '2020-04-25 18:52:44', '2020-04-25 18:01:44', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (17, '2020-04-25 18:52:44', '2020-04-25 18:52:44', null, null, 17, '1254000384066850816', 1, 'A001', null, '5',
        1, 1, 0.0000, 1, null, '2020-04-25 18:52:44', '2020-04-25 18:01:44', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (25, '2020-05-10 12:22:10', '2020-05-10 12:22:10', null, null, 25, '1259337908582748160', 1, '1234', 1, '5', 1,
        1, 0.0000, 1, null, '2020-05-10 12:22:10', '2020-05-10 12:01:10', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (26, '2020-05-10 12:22:56', '2020-05-10 12:22:56', null, null, 26, '1259338103051653120', 1, '1234', 1, '5', 1,
        1, 0.0000, 1, null, '2020-05-10 12:22:56', '2020-05-10 12:01:56', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (27, '2020-05-10 12:23:07', '2020-05-10 12:23:07', null, null, 27, '1259338150904467456', 1, '1234', 1, '5', 1,
        1, 0.0000, 1, null, '2020-05-10 12:23:07', '2020-05-10 12:01:07', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (28, '2020-05-10 12:23:29', '2020-05-10 12:23:29', null, null, 28, '1259338241123946496', 1, '1234', 1, '5', 1,
        1, 0.0000, 1, null, '2020-05-10 12:23:29', '2020-05-10 12:01:29', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (29, '2020-05-10 12:25:48', '2020-05-10 12:25:48', null, null, 29, '1259338824635518976', 1, '1234', 1, '5', 1,
        1, 0.0000, 1, null, '2020-05-10 12:25:48', '2020-05-10 12:01:48', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (30, '2020-05-10 12:37:20', '2020-05-10 12:37:20', null, null, 30, '1259341727404265472', 1, '1234', 1, '5', 1,
        1, 0.0000, 1, null, '2020-05-10 12:37:20', '2020-05-10 12:01:20', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (31, '2020-05-10 20:00:18', '2020-05-10 20:00:18', null, null, 30, '1259341727404265472', 1, '1234', 2,
        '1245537668494921728', 2, 2, 6.0000, 30, 2, '2020-05-10 12:01:20', '2020-05-10 20:00:17', 478, 1.0000, 5, 2, -1,
        0.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (32, '2020-05-10 20:01:21', '2020-05-10 20:01:21', null, null, 30, '1259341727404265472', 1, '1234', 2,
        '1245537668494921728', 2, 2, 6.0000, 30, 2, '2020-05-10 12:01:20', '2020-05-10 20:00:44', 479, 1.0000, 5, 2, -1,
        0.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (33, '2020-05-10 20:01:51', '2020-05-10 20:01:51', null, null, 30, '1259341727404265472', 1, '1234', 2,
        '1245537668494921728', 2, 2, 6.0000, 30, 2, '2020-05-10 12:01:20', '2020-05-10 20:01:50', 480, 1.0000, 5, 2, -1,
        0.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (34, '2020-05-10 20:03:56', '2020-05-10 20:03:56', null, null, 31, '1259454117240246272', 1, '1234', 1, '5', 1,
        1, 0.0000, 1, null, '2020-05-10 20:03:56', '2020-05-10 20:01:56', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (35, '2020-05-10 20:04:26', '2020-05-10 20:11:36', null, null, 32, '1259454243799175168', 1, '1234', 1, '5', 1,
        1, 10.0000, 1, null, '2020-05-10 10:04:26', '2020-05-10 10:01:26', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (40, '2020-05-10 20:12:13', '2020-05-10 20:12:13', null, null, 32, '1259454243799175168', 1, '1234', 2,
        '1245537668494921728', 2, 2, 6.0000, 30, 2, '2020-05-10 10:01:26', '2020-05-10 20:12:13', 610, 1.0000, 5, 2, -1,
        0.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (41, '2020-05-10 20:19:28', '2020-05-10 20:19:28', null, null, 32, '1259454243799175168', 1, '1234', 2,
        '1245537668494921728', 2, 2, 6.0000, 30, 2, '2020-05-10 10:01:26', '2020-05-10 20:19:27', 618, 1.0000, 5, 2, -1,
        0.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (42, '2020-05-10 20:20:24', '2020-05-10 20:20:24', null, null, 32, '1259454243799175168', 1, '1234', 2,
        '1245537668494921728', 2, 2, 6.0000, 30, 2, '2020-05-10 10:01:26', '2020-05-10 20:19:44', 618, 1.0000, 5, 2, -1,
        0.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (43, '2020-05-10 20:21:05', '2020-05-10 20:21:05', null, null, 32, '1259454243799175168', 1, '1234', 2,
        '1245537668494921728', 2, 2, 6.0000, 30, 2, '2020-05-10 10:01:26', '2020-05-10 20:21:02', 619, 1.0000, 5, 2, -1,
        123.6000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (44, '2020-05-10 20:24:18', '2020-05-10 20:24:18', null, null, 32, '1259454243799175168', 1, '1234', 2,
        '1245537668494921728', 2, 2, 6.0000, 30, 2, '2020-05-10 10:01:26', '2020-05-10 20:23:39', 622, 1.0000, 5, 2, -1,
        124.2000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (45, '2020-05-10 20:31:58', '2020-05-10 20:31:58', null, null, 32, '1259454243799175168', 1, '1234', 2, '5', 2,
        2, 6.0000, 30, 2, '2020-05-10 10:01:26', '2020-05-10 20:31:55', 630, 1.0000, 5, 2, -1, 125.8000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (46, '2020-05-10 20:33:25', '2020-05-10 20:33:25', null, null, 33, '1259461536582340608', 1, '1234', 1, '5', 1,
        1, 0.0000, 1, null, '2020-05-10 20:33:25', '2020-05-10 20:01:25', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (47, '2020-05-12 21:32:28', '2020-05-12 21:32:28', null, null, 11, '1252062201175478272', 1, 'A001', 2, '5', 2,
        2, 6.0000, 30, 2, '2020-04-20 10:01:06', '2020-05-12 21:32:26', 32371, 1.0000, 5, 2, -1, 6474.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (48, '2020-05-12 21:50:49', '2020-05-12 21:50:49', null, null, 10, '1252061831695044608', 1, 'A001', 2, '5', 2,
        2, 6.0000, 30, 2, '2020-04-20 10:30:39', '2020-05-12 21:50:48', 32360, 1.0000, 5, 2, -5, 6471.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (49, '2020-05-12 21:51:49', '2020-05-12 21:51:49', null, null, 1, '1245533809588441088', 1, 'A001', 2, '5', 2, 2,
        6.0000, 30, 2, '2020-04-02 10:01:36', '2020-05-12 21:51:49', 58310, 1.0000, 5, 2, -1, 11661.8000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (50, '2020-05-17 22:22:17', '2020-05-17 22:22:17', null, null, 34, '1262025651280547840', 1, 'A001', 1, '5', 1,
        1, 0.0000, 1, null, '2020-05-17 22:22:17', '2020-05-17 22:01:17', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (51, '2020-05-17 22:38:20', '2020-05-17 22:38:20', null, null, 35, '1262029690470797312', 1, 'A001', 1, '5', 1,
        1, 0.0000, 1, null, '2020-05-17 22:38:20', '2020-05-17 22:01:20', 1, 1.0000, 1, null, 1, 2.0000);
INSERT INTO shower.order_item (id, create_time, update_time, create_user, update_user, order_id, order_no, device_id,
                               device_code, device_type, price_code, price_id, price_type, time_price, time_interval,
                               time_unit, start_time, end_time, time_use, water_price, water_interval, water_unit,
                               water_use, total_price)
VALUES (52, '2020-05-17 22:42:33', '2020-05-17 22:42:33', null, null, 35, '1262029690470797312', 1, 'A001', 2, '5', 2,
        2, 6.0000, 30, 2, '2020-05-17 22:01:20', '2020-05-17 22:42:33', 41, 1.0000, 5, 2, -1, 8.0000);