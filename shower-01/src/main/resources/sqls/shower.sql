create schema if not exists shower collate utf8mb4_0900_ai_ci;

create table if not exists admin_role
(
    id   bigint(15)  not null comment 'id'
        primary key,
    name varchar(50) null comment '名称'
)
    comment 'admin_role';

create table if not exists admin_user
(
    id          bigint(15)  not null comment 'id'
        primary key,
    username    varchar(50) null comment '账户',
    password    varchar(50) null comment '密码',
    real_name   varchar(50) null comment '昵称',
    create_user varchar(50) null comment '创建人',
    create_time datetime    null comment '创建时间',
    update_time timestamp   null comment '更新时间'
)
    comment 'admin_user';

create table if not exists admin_user_role
(
    id      bigint(15) not null comment 'id'
        primary key,
    user_id bigint(15) null comment '用户ID',
    role_id bigint(15) null comment '角色ID'
)
    comment 'admin_user_role';

create table if not exists device_info
(
    id      bigint(15)  not null comment 'id'
        primary key,
    code    varchar(50) null comment '编号',
    address varchar(50) null comment '地址',
    point   varchar(50) null comment '坐标值'
)
    comment 'device_info';

create table if not exists device_order_info
(
    id               bigint(15)  not null comment 'id'
        primary key,
    device_id        bigint(15)  null comment '设备ID',
    device_code      varchar(50) null comment '设备编号',
    order_id         bigint(15)  null comment '订单ID',
    order_no         varchar(50) null comment '订单号',
    customer_id      bigint(15)  null comment '客户ID',
    customer_open_id varchar(50) null comment '客户微信OpenId',
    customer_name    varchar(50) null comment '客户姓名',
    order_time       datetime    null comment '下单时间',
    start_time       datetime    null comment '开始使用时间',
    end_time         datetime    null comment '结束使用时间',
    leave_time       datetime    null comment '离开时间'
)
    comment 'device_order_info';

create table if not exists wx_customer
(
    id          bigint(15)  not null comment 'id'
        primary key,
    open_id     varchar(50) null comment '微信OPENID',
    union_id    varchar(50) null comment '微信UNIONID',
    nick_name   varchar(50) null comment '昵称',
    phone       varchar(50) null comment '电话',
    gender      int         null comment '性别',
    create_time datetime    null comment '创建时间',
    update_time timestamp   null comment '修改时间'
)
    comment 'wx_customer';

create table if not exists wx_order_info
(
    id                 bigint(15)     not null comment 'id'
        primary key,
    create_time        datetime       null comment 'createTime',
    order_type         int            null comment '订单类型 1 预支付押金，2 直接使用 ，3 预约订单',
    order_no           varchar(50)    null comment '订单号',
    customer_id        bigint(15)     null comment '客户ID',
    customer_name      varchar(50)    null comment '客户姓名',
    customer_open_id   varchar(50)    null comment '客户微信openId',
    device_id          bigint(15)     null comment '设备编号ID',
    device_code        varchar(50)    null comment '设备编号',
    pay_status         int            null comment '支付状态 （0未支付 ，11 预支付订单支付定金， 12 使用结束未完成支付，13 使用完成并完成支付，22使用结束未支付，23 完成支持，31 ，32 ，33',
    predicate_pay_time datetime       null comment '预支付时间',
    final_pay_time     datetime       null comment '使用结束支付时间',
    predicate_decimal  decimal(13, 4) null comment '预支付金额',
    remain_decimal     decimal(13, 4) null comment '预支付剩余金额',
    start_time         datetime       null comment '使用开始时间',
    end_time           datetime       null comment '使用结束时间',
    spend_time         decimal(13, 4) null comment '使用时间',
    min_decimal        decimal(13, 4) null comment '最低收费',
    per_decimal        decimal(13, 4) null comment '单位收费价格',
    ext_decimal        decimal(13, 4) null comment '超出收费金额（如果是直接使用订单，只有超出使用金额）',
    total_decimal      decimal(13, 4) null comment '总金额',
    leave_time         datetime       null comment '客户离开时间',
    crate_time         datetime       null comment 'crateTime',
    update_time        timestamp      null comment 'updateTime'
)
    comment 'wx_order_info';

