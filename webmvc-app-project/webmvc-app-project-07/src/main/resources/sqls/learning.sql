create schema if not exists learning collate utf8mb4_0900_ai_ci;

create table if not exists base_customer_info
(
    id                    bigint(15) auto_increment comment 'id'
        primary key,
    name                  varchar(50) null comment 'name',
    age                   int         null comment 'age',
    identification_number varchar(50) null comment 'identificationNumber',
    mailing_address       varchar(50) null comment 'mailingAddress',
    contact_number        varchar(50) null comment 'contactNumber',
    work_place            varchar(50) null comment 'workPlace',
    create_user           varchar(50) null comment 'createUser',
    update_user           varchar(50) null comment 'updateUser',
    create_time           datetime    null comment 'createTime',
    update_time           datetime    null comment 'updateTime'
)
    comment 'base_customer_info';

create table if not exists goods_info
(
    id     bigint(15) auto_increment comment 'id'
        primary key,
    code   varchar(50)    null comment 'code',
    name   varchar(50)    null comment 'name',
    number int            null comment 'number',
    price  decimal(13, 4) null comment 'price'
)
    comment 'goods_info';

create table if not exists order_info
(
    id        bigint(15) auto_increment comment 'id'
        primary key,
    code      varchar(50)    null comment 'code',
    user_id   bigint(15)     null comment 'userId',
    `decimal` decimal(13, 4) null comment 'decimal'
)
    comment 'order_info';

create table if not exists sys_module
(
    id        bigint(15) auto_increment comment 'id'
        primary key,
    name      varchar(50) default '' null comment 'name',
    content   varchar(50) default '' null comment 'content',
    type      varchar(50) default '' null comment 'type',
    parent_id bigint(15)  default -1 null comment 'parentId',
    level     int         default -1 null comment 'level'
)
    comment 'sys_module';

create table if not exists sys_permission
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    authority   varchar(50) null comment 'authority',
    name        varchar(50) null comment 'name',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    enabled     int         null comment 'enabled',
    constraint authority
        unique (authority),
    constraint name
        unique (name)
)
    comment 'sys_permission';

create table if not exists sys_role
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    authority   varchar(50) null comment 'authority',
    name        varchar(50) null comment 'name',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    enabled     int         null comment 'enabled',
    constraint authority
        unique (authority),
    constraint name
        unique (name)
)
    comment 'sys_role';

create table if not exists sys_user
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    username    varchar(50) default ''                    not null comment 'username',
    password    varchar(50) default ''                    not null comment 'password',
    real_name   varchar(50) default ''                    not null comment 'realName',
    nick_name   varchar(50) default ''                    not null comment 'nickName',
    create_user varchar(50) default ''                    not null comment 'createUser',
    update_user varchar(50) default ''                    not null comment 'updateUser',
    create_time datetime    default '1000-01-01 00:00:00' not null comment 'createTime',
    update_time timestamp   default CURRENT_TIMESTAMP     not null on update CURRENT_TIMESTAMP comment 'updateTime',
    enabled     tinyint(3)  default 0                     not null comment 'enabled'
)
    comment 'sys_user';

