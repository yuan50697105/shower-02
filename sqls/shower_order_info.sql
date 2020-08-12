create table order_info
(
    id                bigint(15) auto_increment comment 'id'
        primary key,
    create_time       datetime                            null comment '创建时间',
    update_time       timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    create_user       varchar(50)                         null comment '创建人',
    update_user       varchar(50)                         null comment '修改人',
    order_no          varchar(50)                         null comment '订单编号',
    type              int                                 null comment '订单类型',
    customer_id       bigint(15)                          null comment '客户ID',
    customer_open_id  varchar(50)                         null comment '客户OPENID',
    customer_union_id varchar(50)                         null comment '客户UNIONID',
    device_code       varchar(50)                         null comment '设备号',
    device_id         bigint(15)                          null comment '设备ID',
    total_price       decimal(13, 4)                      null comment '总价',
    status            int                                 null comment '订单状态',
    use_start_time    datetime                            null comment '使用开始时间',
    use_end_time      datetime                            null comment '使用结束时间',
    transaction_id    varchar(255)                        null comment '微信交易号'
)
    comment 'order_info' charset = utf8mb4;

INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (1, '2020-04-02 10:09:36', '2020-05-17 22:15:29', null, null, '1245533809588441090', 2, 1, 'oGhyX5EyohxFzsaj52nZTbFJG5GI', null, 'A001', 1, 0.0100, 5, '2020-05-13 17:34:16', '2020-05-13 17:34:33', '4200000526202005173982170155');
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (2, '2020-04-20 10:17:53', '2020-05-17 21:50:51', null, null, '1252058875570556928', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'B001', 2, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (3, '2020-04-20 10:18:47', '2020-05-17 21:50:51', null, null, '1252059103212212224', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'B001', 2, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (4, '2020-04-20 10:18:48', '2020-05-17 21:50:52', null, null, '1252059108241182720', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'A001', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (5, '2020-04-20 10:18:50', '2020-05-17 21:50:52', null, null, '1252059116789174272', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'B001', 2, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (6, '2020-04-20 10:18:52', '2020-05-17 21:50:53', null, null, '1252059122329849856', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'B001', 2, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (7, '2020-04-20 10:18:53', '2020-05-17 21:50:52', null, null, '1252059126406713344', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'A001', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (8, '2020-04-20 10:19:03', '2020-05-17 21:50:52', null, null, '1252059168903401472', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'B001', 2, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (9, '2020-04-20 10:19:04', '2020-05-17 21:50:52', null, null, '1252059172787326976', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'A001', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (10, '2020-04-20 10:29:38', '2020-05-17 22:16:30', null, null, '1252061831695044608', 2, 1, 'oGhyX5EyohxFzsaj52nZTbFJG5GI', null, 'A001', 1, 0.0100, 5, '2020-05-13 17:34:31', '2020-05-13 17:34:34', null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (11, '2020-04-20 10:31:06', '2020-05-17 22:14:49', null, null, '1252062201175478282', 2, 1, 'oGhyX5EyohxFzsaj52nZTbFJG5GI', null, 'A001', 1, 0.0100, 5, '2020-05-13 17:34:30', '2020-05-13 17:34:35', '4200000547202005170731543660');
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (12, '2020-04-25 18:52:36', '2020-05-17 21:50:51', null, null, '1254000347328942080', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'A001', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (13, '2020-04-25 18:52:42', '2020-05-17 21:50:51', null, null, '1254000373409124352', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'A001', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (14, '2020-04-25 18:52:43', '2020-05-17 21:50:51', null, null, '1254000379713163264', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'A001', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (15, '2020-04-25 18:52:44', '2020-05-17 21:50:51', null, null, '1254000382384934912', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'A001', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (16, '2020-04-25 18:52:44', '2020-05-17 21:50:52', null, null, '1254000383156686848', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'A001', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (17, '2020-04-25 18:52:44', '2020-05-17 21:50:52', null, null, '1254000384066850816', 2, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, 'A001', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id, customer_open_id, customer_union_id, device_code, device_id, total_price, status, use_start_time, use_end_time, transaction_id) VALUES (25, '2020-05-10 12:22:09', '2020-05-17 21:50:52', null, null, '1259337908582748160', 1, 1246381007662354432, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, '1234', 1, 0.0100, 2, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (26, '2020-05-10 12:22:56', '2020-05-17 21:50:52', null, null, '1259338103051653120', 1, 1246381007662354432,
        'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, '1234', 1, 0.0100, 2, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (27, '2020-05-10 12:23:07', '2020-05-17 21:50:52', null, null, '1259338150904467456', 1, 1246381007662354432,
        'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, '1234', 1, 0.0100, 2, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (28, '2020-05-10 12:23:29', '2020-05-17 21:50:52', null, null, '1259338241123946496', 2, 1246381007662354432,
        'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, '1234', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (29, '2020-05-10 12:25:48', '2020-05-17 21:50:52', null, null, '1259338824635518976', 2, 1246381007662354432,
        'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, '1234', 1, 0.0100, 6, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (30, '2020-05-10 12:37:20', '2020-05-17 21:50:52', null, null, '1259341727404265472', 2, 1246381007662354432,
        'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, '1234', 1, 0.0100, 1, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (31, '2020-05-10 20:03:56', '2020-05-17 21:50:52', null, null, '1259454117240246272', 2, 1246381007662354432,
        'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, '1234', 1, 0.0100, 6, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (32, '2020-05-10 20:04:26', '2020-05-17 21:50:43', null, null, '1259454243799175168', 2, 1246381007662354432,
        'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, '1234', 1, 0.0100, 3, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (33, '2020-05-10 20:33:25', '2020-05-17 21:50:52', null, null, '1259461536582340608', 1, 1246381007662354432,
        'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, '1234', 1, 0.0100, 3, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (34, '2020-05-17 22:22:17', '2020-05-17 22:32:17', null, null, '1262025651280547840', 2, 1,
        'oGhyX5EyohxFzsaj52nZTbFJG5GI', null, 'A001', 1, 0.0000, 6, null, null, null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (35, '2020-05-17 22:38:20', '2020-05-17 22:42:33', null, null, '1262029690470797312', 2, 1,
        'oGhyX5EyohxFzsaj52nZTbFJG5GI', null, 'A001', 1, 10.0000, 3, '2020-05-17 22:38:31', '2020-05-17 22:42:33',
        null);
INSERT INTO shower.order_info (id, create_time, update_time, create_user, update_user, order_no, type, customer_id,
                               customer_open_id, customer_union_id, device_code, device_id, total_price, status,
                               use_start_time, use_end_time, transaction_id)
VALUES (36, '2020-08-11 15:32:01', '2020-08-11 15:32:24', null, null, '1293087758872612864', 2, 1,
        'oGhyX5EyohxFzsaj52nZTbFJG5GI', null, 'A001', 1, 8.0000, 3, '2020-08-11 15:32:13', '2020-08-11 15:32:24', null);