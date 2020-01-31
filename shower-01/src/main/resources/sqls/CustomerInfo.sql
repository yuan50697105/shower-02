-- auto Generated on 2020-01-31
DROP TABLE IF EXISTS customer_info;
CREATE TABLE customer_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	nick_name VARCHAR (50) COMMENT '用户昵称',
	open_id VARCHAR (50) COMMENT '用户OPENID',
	union_id VARCHAR (50) COMMENT '用户UNIONID',
	gender INT (11) COMMENT '性别',
	phone VARCHAR (50) COMMENT '电话',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'customer_info';
