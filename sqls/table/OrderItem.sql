-- auto Generated on 2020-03-20
-- DROP TABLE IF EXISTS order_item;
CREATE TABLE order_item(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	order_id BIGINT (15) COMMENT '订单ID',
	order_no VARCHAR (50) COMMENT '订单号',
	device_id BIGINT (15) COMMENT '设备ID',
	device_code VARCHAR (50) COMMENT '设备编号',
	device_type INT (11) COMMENT '设备类型',
	range_code VARCHAR (50) COMMENT '地区码',
	goods_id BIGINT (15) COMMENT '定价ID',
	goods_type INT (11) COMMENT '定价类型',
	time_price DECIMAL (13,4) COMMENT '时间价格',
	time_interval DOUBLE (16,4) COMMENT '时间计费间隔',
	time_unit INT (11) COMMENT '时间计费单位',
	start_time DATETIME COMMENT '开始时间',
	end_time DATETIME COMMENT '结束时间',
	time_use DOUBLE (16,4) COMMENT '用时',
	water_price DECIMAL (13,4) COMMENT '水价',
	water_interval DOUBLE (16,4) COMMENT '水计费间隔',
	water_unit INT (11) COMMENT '水计费单位',
	water_use DOUBLE (16,4) COMMENT '水用量',
	total_price DECIMAL (13,4) COMMENT '总价',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'order_item';
