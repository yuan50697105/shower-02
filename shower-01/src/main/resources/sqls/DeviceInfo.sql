-- auto Generated on 2020-01-31
DROP TABLE IF EXISTS device_info;
CREATE TABLE device_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	code VARCHAR (50) COMMENT 'code',
	`type` INT (11) COMMENT 'type',
	address VARCHAR (50) COMMENT 'address',
	point VARCHAR (50) COMMENT 'point',
	enabled INT (11) COMMENT 'enabled',
	range_code VARCHAR (50) COMMENT 'rangeCode',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'device_info';
-- auto Generated on 2020-01-31
DROP TABLE IF EXISTS device_info;
CREATE TABLE device_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	code VARCHAR (50) COMMENT '设备编号',
	`type` INT (11) COMMENT '设备类型 1 室外 2 室内',
	address VARCHAR (50) COMMENT '地址',
	point VARCHAR (50) COMMENT 'GPS',
	enabled INT (11) COMMENT '启用装填（1 启用 0 停用）',
	range_code VARCHAR (50) COMMENT '地区码',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'device_info';
