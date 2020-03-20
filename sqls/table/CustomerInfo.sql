-- auto Generated on 2020-03-20
DROP TABLE IF EXISTS customer_info;
CREATE TABLE customer_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	open_id VARCHAR (50) COMMENT 'openId',
	union_id VARCHAR (50) COMMENT 'unionId',
	nick_name VARCHAR (50) COMMENT 'nickName',
	gender INT (11) COMMENT 'gender',
	phone_num VARCHAR (50) COMMENT 'phoneNum',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'customer_info';
