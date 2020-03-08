create database if not exists shower DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;

create schema if not exists shower collate utf8mb4_bin;

use shower;

create table if not exists admin_role
(
    id          bigint(15)  not null comment 'id'
        primary key,
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    name        varchar(50) null comment '角色名',
    enabled     int         null comment '启用状态（1 启用，0 停用）'
)
    comment 'admin_role';

create table if not exists admin_user
(
    id          bigint(15)  not null comment 'id'
        primary key,
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    username    varchar(50) null comment '用户名',
    password    varchar(50) null comment '密码',
    name        varchar(50) null comment '姓名',
    enabled     int         null comment '启用状态',
    constraint username
        unique (username)
)
    comment 'admin_user';

create table if not exists customer_info
(
    id          bigint(15)  not null comment 'id'
        primary key,
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    nick_name   varchar(50) null comment '用户昵称',
    open_id     varchar(50) null comment '用户OPENID',
    union_id    varchar(50) null comment '用户UNIONID',
    gender      int         null comment '性别',
    phone       varchar(50) null comment '电话'
)
    comment 'customer_info';

create table if not exists device_info
(
    id                  bigint(15)                                  not null comment 'id'
        primary key,
    create_time         datetime      default '1000-01-01 00:00:00' not null comment 'createTime',
    update_time         timestamp     default CURRENT_TIMESTAMP     not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user         varchar(50)   default ''                    not null comment 'createUser',
    update_user         varchar(50)   default ''                    not null comment 'updateUser',
    code                varchar(50)   default ''                    not null comment '设备编号',
    type                int           default -1                    not null comment '设备类型 1 室外 2 室内',
    address             varchar(50)   default ''                    not null comment '地址',
    point               varchar(50)   default ''                    not null comment 'GPS',
    enabled             int           default -1                    not null comment '启用装填（1 启用 0 停用）',
    range_code          varchar(50)   default ''                    not null comment '地区码',
    latitude            double(16, 4) default -1.0000               not null comment '纬度 范围为 -90~90 负数表示南纬',
    longitude           double(16, 4) default -1.0000               not null comment '经度，范围为 -180~180，负数表示西经',
    accuracy            double(16, 4) default -1.0000               not null comment '位置的精确度',
    altitude            double(16, 4) default -1.0000               not null comment '高度，单位 m',
    vertical_accuracy   double(16, 4) default -1.0000               not null comment '垂直精度，单位 m（Android 无法获取，返回 0）',
    horizontal_accuracy double(16, 4) default -1.0000               not null comment '水平精度，单位 m'
)
    comment 'device_info';

create table if not exists device_order_info
(
    id          bigint(15)  not null comment 'id'
        primary key,
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    device_id   bigint(15)  null comment '设备ID',
    device_code varchar(50) null comment '设备编号',
    order_id    bigint(15)  null comment '订单ID',
    order_no    varchar(50) null comment '订单号',
    status      int         null comment '设备订单状态',
    content     varchar(50) null comment '详情'
)
    comment 'device_order_info';

create table if not exists device_record
(
    id          bigint(15)  not null comment 'id'
        primary key,
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    device_id   bigint(15)  null comment '设备ID',
    device_code varchar(50) null comment '设备编号',
    type        int         null comment '操作类型',
    content     varchar(50) null comment '详情'
)
    comment 'device_record';

create table if not exists goods_info
(
    id            bigint(15)     not null comment 'id'
        primary key,
    create_time   datetime       null comment 'createTime',
    update_time   timestamp      null comment 'updateTime',
    create_user   varchar(50)    null comment 'createUser',
    update_user   varchar(50)    null comment 'updateUser',
    code          varchar(50)    null comment '商品编号',
    type          int            null comment 'type (类型 1 起租 2 额外收费）',
    time_price    decimal(13, 4) null comment '使用时间定价',
    time_interval decimal(13, 4) null comment '使用时间计费间隔',
    time_unit     int            null comment '时间计费单位',
    water_price   decimal(13, 4) null comment '水费单价',
    water_space   decimal(13, 4) null comment '水费计费间隔',
    water_unit    int            null comment '水费计费单位',
    range_code    varchar(50)    null comment '地区码'
)
    comment 'goods_info';

create table if not exists member_info
(
    id                 bigint(15)  not null comment 'id'
        primary key,
    create_time        datetime    null comment 'createTime',
    update_time        timestamp   null comment 'updateTime',
    create_user        varchar(50) null comment 'createUser',
    update_user        varchar(50) null comment 'updateUser',
    customer_id        bigint(15)  null comment '客户ID',
    customer_nick_name varchar(50) null comment '客户昵称',
    customer_open_id   varchar(50) null comment '客户微信openId',
    customer_union_id  varchar(50) null comment '客户UNIONID',
    type               int         null comment '客户类型',
    code               varchar(50) null comment '会员编号'
)
    comment 'member_info';

create table if not exists order_info
(
    id                 bigint(15)     not null comment 'id'
        primary key,
    create_time        datetime       null comment 'createTime',
    update_time        timestamp      null comment 'updateTime',
    create_user        varchar(50)    null comment 'createUser',
    update_user        varchar(50)    null comment 'updateUser',
    type               int            null comment '订单类型',
    order_no           varchar(50)    null comment '订单号',
    customer_id        bigint(15)     null comment '客户ID',
    customer_open_id   varchar(50)    null comment '客户OpenId',
    customer_union_id  varchar(50)    null comment '客户UnionId',
    customer_nick_name varchar(50)    null comment '客户昵称',
    order_status       int            null comment '订单状态',
    total_price        decimal(13, 4) null comment '订单总价',
    constraint order_no
        unique (order_no)
)
    comment 'order_info';

create table if not exists order_item
(
    id                 bigint(15) auto_increment comment 'id'
        primary key,
    create_time        datetime       null comment 'createTime',
    update_time        timestamp      null comment 'updateTime',
    create_user        varchar(50)    null comment 'createUser',
    update_user        varchar(50)    null comment 'updateUser',
    type               int            null comment '订单类型',
    order_id           bigint(15)     null comment '订单ID',
    order_no           varchar(50)    null comment '订单编号',
    customer_id        bigint(15)     null comment '客户ID',
    customer_open_id   varchar(50)    null comment '微信OPENID',
    customer_union_id  varchar(50)    null comment '微型UNIONID',
    customer_nick_name varchar(50)    null comment '昵称',
    item_type          int            null comment '订单项目类型',
    item_order_no      varchar(50)    null comment '子订单号',
    device_type        int            null comment '设备类型',
    device_id          bigint(15)     null comment '设备ID',
    device_code        varchar(50)    null comment '设备编号',
    range_code         varchar(50)    null comment '读取码',
    goods_info_id      bigint(15)     null comment '价目ID',
    goods_info_code    varchar(50)    null comment '价目编号',
    time_price         decimal(13, 4) null comment '时间定价',
    time_interval      decimal(13, 4) null comment '时间计费间隔',
    time_total_price   decimal(13, 4) null comment '时间用时总价',
    time_price_unit    int            null comment '时间定价单位',
    start_time         datetime       null comment '开始时间',
    end_time           datetime       null comment '结束时间',
    time_use_amount    decimal(13, 4) null comment '时间使用量',
    water_price        decimal(13, 4) null comment '水定价',
    water_space        decimal(13, 4) null comment '水费计费间隔',
    water_unit         int            null comment '水费单位',
    water_total_price  decimal(13, 4) null comment '总水费',
    total_price        decimal(13, 4) null comment '总价',
    remain_price       decimal(13, 4) null comment '充值剩余金额'
)
    comment 'order_item';

