-- auto Generated on 2020-01-23
DROP TABLE IF EXISTS order_info;
CREATE TABLE order_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	`type` INT (11) COMMENT 'type',
	order_no VARCHAR (50) UNIQUE COMMENT 'orderNo',
	customer_id BIGINT (15) COMMENT 'customerId',
	customer_open_id VARCHAR (50) COMMENT 'customerOpenId',
	customer_union_id VARCHAR (50) COMMENT 'customerUnionId',
	customer_nick_name VARCHAR (50) COMMENT 'customerNickName',
	order_status INT (11) COMMENT 'orderStatus',
	total_price DECIMAL (13,4) COMMENT 'totalPrice',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'order_info';
