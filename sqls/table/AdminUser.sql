-- auto Generated on 2020-03-20
DROP TABLE IF EXISTS admin_user;
CREATE TABLE admin_user(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	username VARCHAR (50) COMMENT 'username',
	`password` VARCHAR (50) COMMENT 'password',
	`name` VARCHAR (50) COMMENT 'name',
	enabled INT (11) COMMENT 'enabled',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'admin_user';
