-- auto Generated on 2020-03-20
-- DROP TABLE IF EXISTS order_info;
CREATE TABLE order_info(
	id BIGINT (15) NOT NULL  COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	order_no VARCHAR (50) COMMENT '订单编号',
	`type` VARCHAR (50) COMMENT '订单类型',
	customer_id BIGINT (15) COMMENT '客户ID',
	customer_open_id VARCHAR (50) COMMENT '客户OPENID',
	customer_union_id VARCHAR (50) COMMENT '客户UNIONID',
	total_price DECIMAL (13,4) COMMENT '总价',
	`status` INT (11) COMMENT '订单状态',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'order_info';
