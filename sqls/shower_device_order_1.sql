create table device_order
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                         null comment 'createUser',
    update_user varchar(50)                         null comment 'updateUser',
    device_id   bigint(15)                          null comment '设备ID',
    device_code varchar(50)                         null comment '设备编号',
    range_code  varchar(50)                         null comment '地区码',
    device_type int                                 null comment '设备类型',
    order_id    bigint(15)                          null comment '订单ID',
    order_no    varchar(50)                         null comment '订单号',
    order_type  int                                 null comment '订单类型',
    customer_id bigint(15)                          null comment '客户ID',
    union_id    varchar(50)                         null comment '客户UNIONID',
    open_id     varchar(50)                         null comment '客户OPENID',
    status      int                                 null comment '订单状态',
    start_time  datetime                            null comment '使用开始时间',
    end_time    datetime                            null comment '结束时间、离开时间'
)
    comment 'device_order' charset = utf8mb4;

INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (1, '2020-04-02 10:09:36', '2020-05-12 21:41:04', null, null, 1, 'A001', '5', null, 1, '1245533809588441088', 2,
        1, null, 'oGhyX5EyohxFzsaj52nZTbFJG5GI', 2, '2020-04-02 10:09:36', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (2, '2020-04-20 10:17:53', '2020-04-20 10:17:53', null, null, 2, 'B001', '3', null, 2, '1252058875570556928', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-20 10:17:53', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (3, '2020-04-20 10:18:47', '2020-04-20 10:18:47', null, null, 2, 'B001', '3', null, 3, '1252059103212212224', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-20 10:18:47', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (4, '2020-04-20 10:18:48', '2020-04-20 10:18:48', null, null, 1, 'A001', '5', null, 4, '1252059108241182720', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-20 10:18:48', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (5, '2020-04-20 10:18:50', '2020-04-20 10:18:50', null, null, 2, 'B001', '3', null, 5, '1252059116789174272', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-20 10:18:50', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (6, '2020-04-20 10:18:52', '2020-04-20 10:18:52', null, null, 2, 'B001', '3', null, 6, '1252059122329849856', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-20 10:18:52', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (7, '2020-04-20 10:18:53', '2020-04-20 10:18:53', null, null, 1, 'A001', '5', null, 7, '1252059126406713344', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-20 10:18:53', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (8, '2020-04-20 10:19:03', '2020-04-20 10:19:03', null, null, 2, 'B001', '3', null, 8, '1252059168903401472', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-20 10:19:03', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (9, '2020-04-20 10:19:04', '2020-04-20 10:19:04', null, null, 1, 'A001', '5', null, 9, '1252059172787326976', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-20 10:19:04', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (10, '2020-04-20 10:29:39', '2020-05-12 21:38:40', null, null, 2, 'B001', '3', null, 10, '1252061831695044608',
        2, 1, null, 'oGhyX5EyohxFzsaj52nZTbFJG5GI', 2, '2020-04-20 10:29:38', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (11, '2020-04-20 10:31:06', '2020-04-20 10:31:06', null, null, 1, 'A001', '5', null, 11, '1252062201175478272',
        2, 1, null, 'oGhyX5EyohxFzsaj52nZTbFJG5GI', 1, '2020-04-20 10:31:06', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (12, '2020-04-25 18:52:36', '2020-04-25 18:52:36', null, null, 1, 'A001', '5', null, 12, '1254000347328942080',
        2, 1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-25 18:52:36', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (13, '2020-04-25 18:52:42', '2020-04-25 18:52:42', null, null, 1, 'A001', '5', null, 13, '1254000373409124352',
        2, 1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-25 18:52:42', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (14, '2020-04-25 18:52:43', '2020-04-25 18:52:43', null, null, 1, 'A001', '5', null, 14, '1254000379713163264',
        2, 1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-25 18:52:43', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (15, '2020-04-25 18:52:44', '2020-04-25 18:52:44', null, null, 1, 'A001', '5', null, 15, '1254000382384934912',
        2, 1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-25 18:52:44', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (16, '2020-04-25 18:52:44', '2020-04-25 18:52:44', null, null, 1, 'A001', '5', null, 16, '1254000383156686848',
        2, 1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-25 18:52:44', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (17, '2020-04-25 18:52:44', '2020-04-25 18:52:44', null, null, 1, 'A001', '5', null, 17, '1254000384066850816',
        2, 1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-04-25 18:52:44', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (25, '2020-05-10 12:22:10', '2020-05-10 12:22:21', null, null, 1, '1234', '5', 1, 25, '1259337908582748160', 1,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 2, '2020-05-10 12:22:09', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (26, '2020-05-10 12:22:56', '2020-05-10 12:22:56', null, null, 1, '1234', '5', 1, 26, '1259338103051653120', 1,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 2, '2020-05-10 12:22:56', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (27, '2020-05-10 12:23:07', '2020-05-10 12:23:08', null, null, 1, '1234', '5', 1, 27, '1259338150904467456', 1,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 2, '2020-05-10 12:23:07', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (28, '2020-05-10 12:23:29', '2020-05-10 12:23:29', null, null, 1, '1234', '5', 1, 28, '1259338241123946496', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-05-10 12:23:29', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (29, '2020-05-10 12:25:48', '2020-05-10 12:25:58', null, null, 1, '1234', '5', 1, 29, '1259338824635518976', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 6, '2020-05-10 12:25:48', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (30, '2020-05-10 12:37:20', '2020-05-10 12:37:20', null, null, 1, '1234', '5', 1, 30, '1259341727404265472', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 1, '2020-05-10 12:37:20', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (31, '2020-05-10 20:03:56', '2020-05-10 20:13:57', null, null, 1, '1234', '5', 1, 31, '1259454117240246272', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 6, '2020-05-10 20:03:56', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (32, '2020-05-10 20:04:26', '2020-05-10 20:14:27', null, null, 1, '1234', '5', 1, 32, '1259454243799175168', 2,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 6, '2020-05-10 20:04:26', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (33, '2020-05-10 20:33:25', '2020-05-10 20:33:26', null, null, 1, '1234', '5', 1, 33, '1259461536582340608', 1,
        1246381007662354432, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', 2, '2020-05-10 20:33:25', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (34, '2020-05-17 22:22:17', '2020-05-17 22:32:17', null, null, 1, 'A001', '5', 1, 34, '1262025651280547840', 2,
        1, null, 'oGhyX5EyohxFzsaj52nZTbFJG5GI', 6, '2020-05-17 22:22:17', null);
INSERT INTO shower.device_order (id, create_time, update_time, create_user, update_user, device_id, device_code,
                                 range_code, device_type, order_id, order_no, order_type, customer_id, union_id,
                                 open_id, status, start_time, end_time)
VALUES (35, '2020-05-17 22:38:20', '2020-05-17 22:38:31', null, null, 1, 'A001', '5', 1, 35, '1262029690470797312', 2,
        1, null, 'oGhyX5EyohxFzsaj52nZTbFJG5GI', 2, '2020-05-17 22:38:20', null);