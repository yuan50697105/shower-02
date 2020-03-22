-- auto Generated on 2020-03-22
DROP TABLE IF EXISTS area_building;
CREATE TABLE area_building(
	id BIGINT (15) NOT NULL COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	`name` VARCHAR (50) COMMENT '楼宇名称',
	code VARCHAR (50) COMMENT '楼宇编号',
	area_id BIGINT (15) COMMENT '所属区域ID',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '楼宇信息';
