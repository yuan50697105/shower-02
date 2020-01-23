create schema if not exists shower collate utf8mb4_0900_ai_ci;

create table if not exists admin_role
(
    id   bigint(15)  not null comment '' id ''
        primary key,
    name varchar(50) null comment '' 名称 ''
)
    comment ''admin_role'';

create table if not exists admin_user
(
    id          bigint(15)  not null comment '' id ''
        primary key,
    username    varchar(50) null comment '' 账户 '',
    password    varchar(50) null comment '' 密码 '',
    real_name   varchar(50) null comment '' 昵称 '',
    create_user varchar(50) null comment '' 创建人 '',
    create_time datetime    null comment '' 创建时间 '',
    update_time timestamp   null comment '' 更新时间 ''
)
    comment ''admin_user'';

create table if not exists admin_user_role
(
    id      bigint(15) not null comment '' id ''
        primary key,
    user_id bigint(15) null comment '' 用户ID '',
    role_id bigint(15) null comment '' 角色ID ''
)
    comment ''admin_user_role'';

create table if not exists device_info
(
    id      bigint(15) auto_increment comment '' id ''
        primary key,
    code    varchar(50) default '''' not null comment '' 编号 '',
    address varchar(50) default '''' not null comment '' 地址 '',
    point   varchar(50) default '''' not null comment '' 坐标值 '',
    type    int         default -1   not null comment '' 设备类型 ''
)
    comment ''device_info'';

create table if not exists device_order_info
(
    id               bigint(15)  not null comment '' id ''
        primary key,
    device_id        bigint(15)  null comment '' 设备ID '',
    device_code      varchar(50) null comment '' 设备编号 '',
    order_id         bigint(15)  null comment '' 订单ID '',
    order_no         varchar(50) null comment '' 订单号 '',
    customer_id      bigint(15)  null comment '' 客户ID '',
    customer_open_id varchar(50) null comment '' 客户微信OpenId '',
    customer_name    varchar(50) null comment '' 客户姓名 '',
    order_time       datetime    null comment '' 下单时间 '',
    start_time       datetime    null comment '' 开始使用时间 '',
    end_time         datetime    null comment '' 结束使用时间 '',
    leave_time       datetime    null comment '' 离开时间 ''
)
    comment ''device_order_info'';

create table if not exists wx_customer
(
    id          bigint(15) auto_increment comment '' id ''
        primary key,
    open_id     varchar(50) null comment '' 微信OPENID '',
    union_id    varchar(50) null comment '' 微信UNIONID '',
    nick_name   varchar(50) null comment '' 昵称 '',
    phone       varchar(50) null comment '' 电话 '',
    gender      int         null comment '' 性别 '',
    create_time datetime    null comment '' 创建时间 '',
    update_time timestamp   null comment '' 修改时间 ''
)
    comment ''wx_customer'';

create table if not exists wx_order_info
(
    id                 bigint(15) auto_increment comment '' id ''
        primary key,
    order_no           varchar(50)    null comment '' 订单号 '',
    customer_id        bigint(15)     null comment '' 客户ID '',
    customer_open_id   varchar(50)    null comment '' 客户微信OPENID '',
    customer_union_id  varchar(50)    null comment '' 客户微信UNIONID '',
    customer_nick_name varchar(50)    null comment '' 客户昵称 '',
    order_status       int            null comment '' 订单状态 '',
    total_price        decimal(13, 4) null comment '' 总金额 '',
    total_remain_price decimal(13, 4) null comment '' 退回总金额 ''
)
    comment ''wx_order_info'';

create table if not exists wx_order_item
(
    id                 bigint(15) auto_increment comment '' id ''
        primary key,
    order_id           bigint(15)     null comment '' 订单ID '',
    order_no           varchar(50)    null comment '' 订单号 '',
    customer_id        bigint(15)     null comment '' 客户ID '',
    customer_open_id   varchar(50)    null comment '' 客户微信OPENID '',
    customer_union_id  varchar(50)    null comment '' 客户微信UNIONID '',
    customer_nick_name varchar(50)    null comment '' 客户昵称 '',
    item_order_no      varchar(50)    null comment '' 子订单号 '',
    device_id          varchar(50)    null comment '' 设备ID '',
    device_code        varchar(50)    null comment '' 设备编号 '',
    pay_status         int            null comment '' 支付状态（0 未支付 1 已支付）'',
    pay_time           datetime       null comment '' 支付时间 '',
    start_time         datetime       null comment '' 开始使用时间 '',
    end_time           datetime       null comment '' 结束使用时间 '',
    price              decimal(13, 4) null comment '' 单价 '',
    total_price        decimal(13, 4) null comment '' 总价 '',
    total_remain_price decimal(13, 4) null comment '' 退回总金额 ''
)
    comment ''wx_order_item'';

