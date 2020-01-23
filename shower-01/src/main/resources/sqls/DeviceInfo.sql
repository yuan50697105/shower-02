-- auto Generated on 2020-01-23
DROP TABLE IF EXISTS device_info;
CREATE TABLE device_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	code VARCHAR (50) UNIQUE COMMENT 'code',
	`type` INT (11) COMMENT 'type',
	address VARCHAR (50) COMMENT 'address',
	point VARCHAR (50) COMMENT 'point',
	enabled INT (11) COMMENT 'enabled',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'device_info';
