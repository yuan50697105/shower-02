create table area_info
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                         null comment 'createUser',
    update_user varchar(50)                         null comment 'updateUser',
    name        varchar(50)                         null comment '区域名称',
    code        varchar(50)                         null comment '区域编号'
)
    comment '区域信息' charset = utf8mb4;

INSERT INTO shower.area_info (id, create_time, update_time, create_user, update_user, name, code)
VALUES (1, '2020-03-24 09:12:34', '2020-03-24 09:12:40', null, null, '山科', '1');
INSERT INTO shower.area_info (id, create_time, update_time, create_user, update_user, name, code)
VALUES (2, '2020-03-24 09:13:00', '2020-03-24 09:13:05', null, null, '青职', '2');