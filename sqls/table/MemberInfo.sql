-- auto Generated on 2020-03-20
-- DROP TABLE IF EXISTS member_info;
CREATE TABLE member_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	customer_id BIGINT (15) COMMENT '客户ID',
	customer_nick_name VARCHAR (50) COMMENT '客户昵称',
	customer_open_id VARCHAR (50) COMMENT '客户微信openId',
	customer_union_id VARCHAR (50) COMMENT '客户UNIONID',
	`type` INT (11) COMMENT '客户类型',
	code VARCHAR (50) COMMENT '会员编号',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'member_info';
