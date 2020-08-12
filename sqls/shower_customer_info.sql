create table customer_info
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment '创建时间',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    create_user varchar(50)                         null comment '创建人',
    update_user varchar(50)                         null comment '修改人',
    open_id     varchar(50)                         null comment '用户微信OpenId',
    union_id    varchar(50)                         null comment '用户微信UNIONID（未使用）',
    nick_name   varchar(50)                         null comment '用户微信昵称',
    gender      int                                 null comment '性别',
    phone_num   varchar(50)                         null comment '电话'
)
    comment 'customer_info' charset = utf8mb4;

INSERT INTO shower.customer_info (id, create_time, update_time, create_user, update_user, open_id, union_id, nick_name, gender, phone_num) VALUES (1, null, '2020-03-23 17:16:52', null, null, 'oGhyX5EyohxFzsaj52nZTbFJG5GI', null, null, null, '18238593848');
INSERT INTO shower.customer_info (id, create_time, update_time, create_user, update_user, open_id, union_id, nick_name, gender, phone_num) VALUES (1243844801036685312, '2020-03-28 18:18:05', '2020-03-28 18:18:05', null, null, 'adasd', null, null, null, null);
INSERT INTO shower.customer_info (id, create_time, update_time, create_user, update_user, open_id, union_id, nick_name, gender, phone_num) VALUES (1246370604622417920, '2020-04-04 17:34:43', '2020-04-04 17:34:43', null, null, null, null, null, null, null);
INSERT INTO shower.customer_info (id, create_time, update_time, create_user, update_user, open_id, union_id, nick_name, gender, phone_num) VALUES (1246374427441106944, '2020-04-04 17:49:55', '2020-04-04 17:49:55', null, null, null, null, null, null, null);
INSERT INTO shower.customer_info (id, create_time, update_time, create_user, update_user, open_id, union_id, nick_name, gender, phone_num) VALUES (1246381007662354432, '2020-04-04 18:16:04', '2020-04-04 18:16:04', null, null, 'oGhyX5FRP9H9LH3NxZP3n-_5OIvM', null, null, null, '18369940116');
INSERT INTO shower.customer_info (id, create_time, update_time, create_user, update_user, open_id, union_id, nick_name, gender, phone_num) VALUES (1246381007662354433, '2020-05-17 16:44:11', '2020-05-17 16:44:11', null, null, 'oGhyX5EG6lpho3KiPAbia581KZWk', null, null, null, '13210080029');
INSERT INTO shower.customer_info (id, create_time, update_time, create_user, update_user, open_id, union_id, nick_name, gender, phone_num) VALUES (1246381007662354434, '2020-06-13 10:49:49', '2020-06-13 10:49:49', null, null, 'oGhyX5LHKOMMx7Zh2G2gxQqOyJxU', null, null, null, '18713583172');
INSERT INTO shower.customer_info (id, create_time, update_time, create_user, update_user, open_id, union_id, nick_name, gender, phone_num) VALUES (1246381007662354435, '2020-06-17 18:28:18', '2020-06-17 18:28:18', null, null, 'oGhyX5NtMINgqwNe45mjdGokIrbg', null, null, null, '17554263036');