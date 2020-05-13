-- auto Generated on 2020-05-13
DROP TABLE IF EXISTS device_info_volume;
CREATE TABLE device_info_volume(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createTime',
	update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'updateUser',
	device_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '设备ID',
	volume_hot DOUBLE (16,4) NOT NULL DEFAULT -1.0 COMMENT '热水容量',
	volume_cold DOUBLE (16,4) NOT NULL DEFAULT -1.0 COMMENT '冷水容量',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'device_info_volume';
-- auto Generated on 2020-05-13
DROP TABLE IF EXISTS device_info_volume;
CREATE TABLE device_info_volume(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	device_id BIGINT (15) COMMENT '设备ID',
	volume DOUBLE (16,4) COMMENT '热水容量',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'device_info_volume';
