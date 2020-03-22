-- auto Generated on 2020-03-20
-- DROP TABLE IF EXISTS price_info;
CREATE TABLE price_info(
	id BIGINT (15) NOT NULL  COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	code VARCHAR (50) COMMENT '编号',
	`type` VARCHAR (50) COMMENT '类型',
	range_code VARCHAR (50) COMMENT '地区码',
	time_price DECIMAL (13,4) COMMENT '时间定价',
	time_interval DOUBLE (16,4) COMMENT '时间计费间隔',
	time_unit INT (11) COMMENT '时间单位',
	water_price DECIMAL (13,4) COMMENT '水定价',
	water_interval DOUBLE (16,4) COMMENT '水计费间隔',
	water_unit INT (11) COMMENT '水计费单位',
	enabled INT (11) COMMENT '有效',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'price_info';
