-- auto Generated on 2020-01-31
DROP TABLE IF EXISTS admin_role;
CREATE TABLE admin_role(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	`name` VARCHAR (50) COMMENT '角色名',
	enabled INT (11) COMMENT '启用状态（1 启用，0 停用）',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'admin_role';
