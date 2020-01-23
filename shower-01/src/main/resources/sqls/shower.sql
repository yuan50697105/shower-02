create schema if not exists shower02 collate utf8mb4_0900_ai_ci;

create table if not exists admin_role
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    name varchar(50) null comment 'name',
    enabled int null comment 'enabled'
)
    comment 'admin_role';

create table if not exists admin_user
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    username varchar(50) null comment 'username',
    password varchar(255) null comment 'password',
    name varchar(50) null comment 'name',
    enabled int null comment 'enabled',
    constraint username
        unique (username)
)
    comment 'admin_user';

create table if not exists customer_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    nick_name varchar(50) null comment 'nickName',
    open_id varchar(50) null comment 'openId',
    union_id varchar(50) null comment 'unionId',
    gender int null comment 'gender',
    phone varchar(50) null comment 'phone'
)
    comment 'customer_info';

create table if not exists device_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    code varchar(50) null comment 'code',
    type int null comment 'type',
    address varchar(50) null comment 'address',
    point varchar(50) null comment 'point',
    enabled int null comment 'enabled',
    constraint code
        unique (code)
)
    comment 'device_info';

create table if not exists device_order_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    device_id bigint(15) null comment 'deviceId',
    device_code varchar(50) null comment 'deviceCode',
    order_id bigint(15) null comment 'orderId',
    order_no varchar(50) null comment 'orderNo',
    status int null comment 'status',
    content varchar(50) null comment 'content'
)
    comment 'device_order_info';

create table if not exists device_record
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    device_id bigint(15) null comment 'deviceId',
    device_code varchar(50) null comment 'deviceCode',
    type int null comment 'type',
    content varchar(50) null comment 'content'
)
    comment 'device_record';

create table if not exists order_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    type int null comment 'type',
    order_no varchar(50) null comment 'orderNo',
    customer_id bigint(15) null comment 'customerId',
    customer_open_id varchar(50) null comment 'customerOpenId',
    customer_union_id varchar(50) null comment 'customerUnionId',
    customer_nick_name varchar(50) null comment 'customerNickName',
    order_status int null comment 'orderStatus',
    total_price decimal(13,4) null comment 'totalPrice',
    constraint order_no
        unique (order_no)
)
    comment 'order_info';

create table if not exists order_item
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp null comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    type int null comment 'type',
    order_id bigint(15) null comment 'orderId',
    order_no varchar(50) null comment 'orderNo',
    customer_id bigint(15) null comment 'customerId',
    customer_open_id varchar(50) null comment 'customerOpenId',
    customer_union_id varchar(50) null comment 'customerUnionId',
    customer_nick_name varchar(50) null comment 'customerNickName',
    item_type int null comment 'itemType',
    item_order_no varchar(50) null comment 'itemOrderNo',
    device_type int null comment 'deviceType',
    device_id bigint(15) null comment 'deviceId',
    device_code varchar(50) null comment 'deviceCode',
    price decimal(13,4) null comment 'price',
    price_unit int null comment 'priceUnit',
    start_time datetime null comment 'startTime',
    end_time datetime null comment 'endTime',
    total_price decimal(13,4) null comment 'totalPrice',
    remain_price decimal(13,4) null comment 'remainPrice'
)
    comment 'order_item';

