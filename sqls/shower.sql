create schema shower collate utf8mb4_general_ci;
use shower;
create table admin_permission
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    name varchar(50) null comment 'name'
)
    comment '管理员权限' charset=utf8mb4;

create table admin_role
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    name varchar(50) null comment 'name'
)
    comment '管理员角色' charset=utf8mb4;

create table admin_user
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    username varchar(50) null comment 'username',
    password varchar(50) null comment 'password',
    name varchar(50) null comment 'name',
    enabled int null comment 'enabled'
)
    comment '管理员用户' charset=utf8mb4;

create table admin_user_role
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    user_id bigint(15) null comment 'userId',
    role_id bigint(15) null comment 'roleId'
)
    comment '管理员用户角色关联' charset=utf8mb4;

create table area_building
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    name varchar(50) null comment '楼宇名称',
    code varchar(50) null comment '楼宇编号',
    area_id bigint(15) null comment '所属区域ID'
)
    comment '楼宇信息' charset=utf8mb4;

create table area_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    name varchar(50) null comment '区域名称',
    code varchar(50) null comment '区域编号'
)
    comment '区域信息' charset=utf8mb4;

create table area_tower
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    name varchar(50) null comment '楼宇名称',
    code varchar(50) null comment '楼宇编号',
    area_id bigint(15) null comment '所属区域ID'
)
    comment '区域楼宇信息' charset=utf8mb4;

create table customer_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    open_id varchar(50) null comment 'openId',
    union_id varchar(50) null comment 'unionId',
    nick_name varchar(50) null comment 'nickName',
    gender int null comment 'gender',
    phone_num varchar(50) null comment 'phoneNum'
)
    comment 'customer_info' charset=utf8mb4;

create table device_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    code varchar(50) null comment '设备编号',
    product_key varchar(50) null comment '产品编号',
    device_name varchar(50) null comment '设备名称',
    type int null comment '设备类型',
    price_code varchar(50) null comment '定价编号',
    enabled int null comment '启用状态(0:未启用；1已启用)',
    longitude double(16,4) null comment '经度',
    latitude double(16,4) null comment '纬度',
    area_id bigint(15) null comment '区域ID',
    area_name varchar(50) null comment '区域名称',
    building_id bigint(15) null comment '楼宇ID',
    building_name varchar(50) null comment '楼宇名称',
    picture varchar(50) null comment '设备图片'
)
    comment 'device_info' charset=utf8mb4;

create table device_order
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    device_id bigint(15) null comment '设备ID',
    device_code varchar(50) null comment '设备编号',
    range_code varchar(50) null comment '地区码',
    device_type int null comment '设备类型',
    order_id bigint(15) null comment '订单ID',
    order_no varchar(50) null comment '订单号',
    order_type int null comment '订单类型',
    customer_id bigint(15) null comment '客户ID',
    union_id varchar(50) null comment '客户UNIONID',
    open_id varchar(50) null comment '客户OPENID',
    status int null comment '订单状态',
    start_time datetime null comment '使用开始时间',
    end_time datetime null comment '结束时间、离开时间'
)
    comment 'device_order' charset=utf8mb4;

create table device_order_info
(
    id bigint(15) not null comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    device_id bigint(15) null comment '设备ID',
    device_code varchar(50) null comment '设备编号',
    order_id bigint(15) null comment '订单ID',
    order_no varchar(50) null comment '订单号',
    status int null comment '设备订单状态',
    content varchar(50) null comment '详情'
)
    comment 'device_order_info' charset=utf8mb4;

create table device_record
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    device_id bigint(15) null comment '设备ID',
    device_code varchar(50) null comment '设备编号',
    type int null comment '操作类型',
    content varchar(50) null comment '详情'
)
    comment 'device_record' charset=utf8mb4;

create table feedback
(
    id bigint(15) unsigned auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) charset utf8mb4 null comment 'createUser',
    update_user varchar(50) charset utf8mb4 null comment 'updateUser',
    customer_id bigint(15) null comment '用户ID',
    title varchar(255) null comment '反馈标题',
    content text null comment '反馈内容',
    image varchar(1000) null comment '反馈图片路径',
    respond_status int null comment '官方回复状态',
    respond_content text null comment '官方回复内容',
    respond_time datetime null comment '官方回复时间'
)
    comment '用户反馈';

create table member_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    customer_id bigint(15) null comment '客户ID',
    customer_nick_name varchar(50) null comment '客户昵称',
    customer_open_id varchar(50) null comment '客户微信openId',
    customer_union_id varchar(50) null comment '客户UNIONID',
    type int null comment '客户类型',
    code varchar(50) null comment '会员编号'
)
    comment 'member_info' charset=utf8mb4;

create table order_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    order_no varchar(50) null comment '订单编号',
    type int null comment '订单类型',
    customer_id bigint(15) null comment '客户ID',
    customer_open_id varchar(50) null comment '客户OPENID',
    customer_union_id varchar(50) null comment '客户UNIONID',
    device_code varchar(50) null comment '设备号',
    device_id bigint(15) null comment '设备ID',
    total_price decimal(13,4) null comment '总价',
    status int null comment '订单状态',
    use_start_time datetime null comment '使用开始时间',
    use_end_time datetime null comment '使用结束时间'
)
    comment 'order_info' charset=utf8mb4;

create table order_item
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    order_id bigint(15) null comment '订单ID',
    order_no varchar(50) null comment '订单号',
    device_id bigint(15) null comment '设备ID',
    device_code varchar(50) null comment '设备编号',
    device_type int null comment '设备类型',
    price_code varchar(50) null comment '价格码',
    price_id bigint(15) null comment '定价ID',
    price_type int null comment '定价类型',
    time_price decimal(13,4) null comment '时间价格',
    time_interval double(16,4) null comment '时间计费间隔',
    time_unit int null comment '时间计费单位',
    start_time datetime null comment '开始时间',
    end_time datetime null comment '结束时间',
    time_use double(16,4) null comment '用时',
    water_price decimal(13,4) null comment '水价',
    water_interval double(16,4) null comment '水计费间隔',
    water_unit int null comment '水计费单位',
    water_use double(16,4) null comment '水用量',
    total_price decimal(13,4) null comment '总价'
)
    comment 'order_item' charset=utf8mb4;

create table price_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    code varchar(50) null comment '编号',
    type int null comment '类型',
    price_code varchar(50) null comment '地区码',
    time_price decimal(13,4) null comment '时间定价',
    time_interval double(16,4) null comment '时间计费间隔',
    time_unit int null comment '时间单位',
    water_price decimal(13,4) null comment '水定价',
    water_interval double(16,4) null comment '水计费间隔',
    water_unit int null comment '水计费单位',
    enabled int null comment '有效'
)
    comment 'price_info' charset=utf8mb4;

