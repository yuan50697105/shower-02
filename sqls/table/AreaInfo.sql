-- auto Generated on 2020-03-22
DROP TABLE IF EXISTS area_info;
CREATE TABLE area_info(
	id BIGINT (15) NOT NULL COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	`name` VARCHAR (50) COMMENT '区域名称',
	code VARCHAR (50) COMMENT '区域编号',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '区域信息';
