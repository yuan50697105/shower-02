-- auto Generated on 2020-03-20
DROP TABLE IF EXISTS device_info;
CREATE TABLE device_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	code VARCHAR (50) COMMENT '设备编号',
	`type` INT (11) COMMENT '设备类型',
	range_code VARCHAR (50) COMMENT '地区码',
	enabled INT (11) COMMENT '启用状态',
	longitude DOUBLE (16,4) COMMENT '经度',
	latitude DOUBLE (16,4) COMMENT '纬度',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'device_info';
