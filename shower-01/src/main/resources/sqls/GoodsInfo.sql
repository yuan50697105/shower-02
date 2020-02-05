
-- auto Generated on 2020-01-31
DROP TABLE IF EXISTS goods_info;
CREATE TABLE goods_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	code VARCHAR (50) COMMENT '商品编号',
	`type` INT (11) COMMENT 'type (类型 1 起租 2 额外收费）',
	time_price DECIMAL (13,4) COMMENT '使用时间定价',
	time_interval DECIMAL (13,4) COMMENT '使用时间计费间隔',
	time_unit INT (11) COMMENT '时间计费单位',
	water_price DECIMAL (13,4) COMMENT '水费单价',
	water_space DECIMAL (13,4) COMMENT '水费计费间隔',
	water_unit INT (11) COMMENT '水费计费单位',
	range_code VARCHAR (50) COMMENT '地区码',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'goods_info';
