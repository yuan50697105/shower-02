-- auto Generated on 2020-07-02
DROP TABLE IF EXISTS admin_route;
CREATE TABLE admin_route(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	url VARCHAR (50) COMMENT 'url',
	`name` VARCHAR (50) COMMENT 'name',
	parent_id BIGINT (15) COMMENT 'parentId',
	weight INT (11) COMMENT 'weight',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'admin_route';
