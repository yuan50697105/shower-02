-- auto Generated on 2020-01-31
DROP TABLE IF EXISTS admin_user;
CREATE TABLE admin_user(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	username VARCHAR (50) UNIQUE COMMENT '用户名',
	`password` VARCHAR (50) COMMENT '密码',
	`name` VARCHAR (50) COMMENT '姓名',
	enabled INT (11) COMMENT '启用状态',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'admin_user';
