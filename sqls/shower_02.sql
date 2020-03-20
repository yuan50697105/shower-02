create schema if not exists shower collate utf8mb4_general_ci;
use shower;

create table if not exists admin_permission
(
	id bigint(15) auto_increment comment 'id'
		primary key,
	create_time datetime null comment 'createTime',
	update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
	create_user varchar(50) null comment 'createUser',
	update_user varchar(50) null comment 'updateUser',
	name varchar(50) null comment 'name'
)
comment 'admin_permission' charset=utf8mb4;

create table if not exists admin_role
(
	id bigint(15) auto_increment comment 'id'
		primary key,
	create_time datetime null comment 'createTime',
	update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
	create_user varchar(50) null comment 'createUser',
	update_user varchar(50) null comment 'updateUser',
	name varchar(50) null comment 'name'
)
comment 'admin_role' charset=utf8mb4;

create table if not exists admin_user
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
comment 'admin_user' charset=utf8mb4;

create table if not exists admin_user_role
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
comment 'admin_user_role' charset=utf8mb4;

create table if not exists customer_info
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

create table if not exists device_info
(
	id bigint(15) auto_increment comment 'id'
		primary key,
	create_time datetime null comment 'createTime',
	update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
	create_user varchar(50) null comment 'createUser',
	update_user varchar(50) null comment 'updateUser',
	code varchar(50) null comment '设备编号',
	type int null comment '设备类型',
	range_code varchar(50) null comment '地区码',
	enabled int null comment '启用状态',
	longitude double(16,4) null comment '经度',
	latitude double(16,4) null comment '纬度'
)
comment 'device_info' charset=utf8mb4;

create table if not exists device_order
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
	customer_id bigint(15) null comment '客户ID',
	union_id varchar(50) null comment '客户UNIONID',
	open_id varchar(50) null comment '客户OPENID',
	status int null comment '订单状态',
	start_time datetime null comment '使用开始时间',
	end_time datetime null comment '结束时间、离开时间'
)
comment 'device_order' charset=utf8mb4;

create table if not exists device_order_info
(
	id bigint(15) auto_increment comment 'id'
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

create table if not exists device_record
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

create table if not exists member_info
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

create table if not exists order_info
(
	id bigint(15) auto_increment comment 'id'
		primary key,
	create_time datetime null comment 'createTime',
	update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
	create_user varchar(50) null comment 'createUser',
	update_user varchar(50) null comment 'updateUser',
	order_no varchar(50) null comment '订单编号',
	type varchar(50) null comment '订单类型',
	customer_id bigint(15) null comment '客户ID',
	customer_open_id varchar(50) null comment '客户OPENID',
	customer_union_id varchar(50) null comment '客户UNIONID',
	total_price decimal(13,4) null comment '总价',
	status int null comment '订单状态'
)
comment 'order_info' charset=utf8mb4;

create table if not exists order_item
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
	range_code varchar(50) null comment '地区码',
	goods_id bigint(15) null comment '定价ID',
	goods_type int null comment '定价类型',
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

create table if not exists price_info
(
	id bigint(15) auto_increment comment 'id'
		primary key,
	create_time datetime null comment 'createTime',
	update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
	create_user varchar(50) null comment 'createUser',
	update_user varchar(50) null comment 'updateUser',
	code varchar(50) null comment '编号',
	type varchar(50) null comment '类型',
	range_code varchar(50) null comment '地区码',
	time_price decimal(13,4) null comment '时间定价',
	time_interval double(16,4) null comment '时间计费间隔',
	time_unit int null comment '时间单位',
	water_price decimal(13,4) null comment '水定价',
	water_interval double(16,4) null comment '水计费间隔',
	water_unit int null comment '水计费单位',
	enabled int null comment '有效'
)
comment 'price_info' charset=utf8mb4;

