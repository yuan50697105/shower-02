-- auto Generated on 2020-01-23
DROP TABLE IF EXISTS device_order_info;
CREATE TABLE device_order_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	device_id BIGINT (15) COMMENT 'deviceId',
	device_code VARCHAR (50) COMMENT 'deviceCode',
	order_id BIGINT (15) COMMENT 'orderId',
	order_no VARCHAR (50) COMMENT 'orderNo',
	`status` INT (11) COMMENT 'status',
	content VARCHAR (50) COMMENT 'content',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'device_order_info';
