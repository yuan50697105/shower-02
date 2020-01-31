-- auto Generated on 2020-01-31
DROP TABLE IF EXISTS order_item;
CREATE TABLE order_item(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	`type` INT (11) COMMENT 'type',
	order_id BIGINT (15) COMMENT 'orderId',
	order_no VARCHAR (50) COMMENT 'orderNo',
	customer_id BIGINT (15) COMMENT 'customerId',
	customer_open_id VARCHAR (50) COMMENT 'customerOpenId',
	customer_union_id VARCHAR (50) COMMENT 'customerUnionId',
	customer_nick_name VARCHAR (50) COMMENT 'customerNickName',
	item_type INT (11) COMMENT 'itemType',
	item_order_no VARCHAR (50) COMMENT 'itemOrderNo',
	device_type INT (11) COMMENT 'deviceType',
	device_id BIGINT (15) COMMENT 'deviceId',
	device_code VARCHAR (50) COMMENT 'deviceCode',
	range_code VARCHAR (50) COMMENT 'rangeCode',
	goods_info_id BIGINT (15) COMMENT 'goodsInfoId',
	goods_info_code VARCHAR (50) COMMENT 'goodsInfoCode',
	time_price DECIMAL (13,4) COMMENT 'price',
	time_interval DECIMAL (13,4) COMMENT 'timeInterval',
	time_total_price DECIMAL (13,4) COMMENT 'timeTotalPrice',
	price_unit INT (11) COMMENT 'priceUnit',
	start_time DATETIME COMMENT 'startTime',
	end_time DATETIME COMMENT 'endTime',
	time_use_amount DECIMAL (13,4) COMMENT '使用量',
	time_use_unit INT (11) COMMENT '使用量单位',
	water_price DECIMAL (13,4) COMMENT 'waterPrice',
	water_space DECIMAL (13,4) COMMENT 'waterSpace',
	water_total_price DECIMAL (13,4) COMMENT 'waterTotalPrice',
	total_price DECIMAL (13,4) COMMENT 'totalPrice',
	remain_price DECIMAL (13,4) COMMENT 'remainPrice',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'order_item';
