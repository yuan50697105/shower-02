-- auto Generated on 2020-03-20
-- DROP TABLE IF EXISTS device_record;
CREATE TABLE device_record(
	id BIGINT (15) NOT NULL  COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	device_id BIGINT (15) COMMENT '设备ID',
	device_code VARCHAR (50) COMMENT '设备编号',
	`type` INT (11) COMMENT '操作类型',
	content VARCHAR (50) COMMENT '详情',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'device_record';
