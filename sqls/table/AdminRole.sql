-- auto Generated on 2020-03-20
DROP TABLE IF EXISTS admin_role;
CREATE TABLE admin_role(
	id BIGINT (15) NOT NULL COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	`name` VARCHAR (50) COMMENT 'name',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '管理员角色';
