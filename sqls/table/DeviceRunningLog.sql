-- auto Generated on 2020-05-31
DROP TABLE IF EXISTS device_running_log;
CREATE TABLE device_running_log(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	device_id BIGINT (15) COMMENT 'deviceId',
	device_code VARCHAR (50) COMMENT 'deviceCode',
	`status` INT (11) COMMENT 'status',
	person_status INT (11) COMMENT 'personStatus',
	person_speed DOUBLE (16,4) COMMENT 'personSpeed',
	temperature01 DOUBLE (16,4) COMMENT 'temperature01',
	temperature02 DOUBLE (16,4) COMMENT 'temperature02',
	volume01 DOUBLE (16,4) COMMENT 'volume01',
	volume02 DOUBLE (16,4) COMMENT 'volume02',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'device_running_log';
