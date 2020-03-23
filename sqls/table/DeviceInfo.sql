-- auto Generated on 2020-03-22
DROP TABLE IF EXISTS device_info;
CREATE TABLE device_info(
	id BIGINT (15) NOT NULL COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	code VARCHAR (50) COMMENT '设备编号',
	`type` INT (11) COMMENT '设备类型',
	price_code VARCHAR (50) COMMENT '定价编号',
	enabled INT (11) COMMENT '启用状态',
	longitude DOUBLE (16,4) COMMENT '经度',
	latitude DOUBLE (16,4) COMMENT '纬度',
	area_id BIGINT (15) COMMENT '区域ID',
	area_name VARCHAR (50) COMMENT '区域名称',
	building_id BIGINT (15) COMMENT '楼宇ID',
	building_name VARCHAR (50) COMMENT '楼宇名称',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '设备信息';
