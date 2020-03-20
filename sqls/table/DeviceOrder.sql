-- auto Generated on 2020-03-20
DROP TABLE IF EXISTS device_order;
CREATE TABLE device_order(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	device_id BIGINT (15) COMMENT '设备ID',
	device_code VARCHAR (50) COMMENT '设备编号',
	range_code VARCHAR (50) COMMENT '地区码',
	device_type INT (11) COMMENT '设备类型',
	order_id BIGINT (15) COMMENT '订单ID',
	order_no VARCHAR (50) COMMENT '订单号',
	customer_id BIGINT (15) COMMENT '客户ID',
	union_id VARCHAR (50) COMMENT '客户UNIONID',
	open_id VARCHAR (50) COMMENT '客户OPENID',
	`status` INT (11) COMMENT '订单状态',
	start_time DATETIME COMMENT '使用开始时间',
	end_time DATETIME COMMENT '结束时间、离开时间',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'device_order';
