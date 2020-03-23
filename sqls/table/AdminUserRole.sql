-- auto Generated on 2020-03-20
DROP TABLE IF EXISTS admin_user_role;
CREATE TABLE admin_user_role(
	id BIGINT (15) NOT NULL  COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	user_id BIGINT (15) COMMENT 'userId',
	role_id BIGINT (15) COMMENT 'roleId',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '管理员用户角色关联';
