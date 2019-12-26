-- auto Generated on 2019-12-26
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user
(
    id          BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    username    VARCHAR(50) COMMENT 'username',
    `password`  VARCHAR(50) COMMENT 'password',
    real_name   VARCHAR(50) COMMENT 'realName',
    nick_name   VARCHAR(50) COMMENT 'nickName',
    create_user VARCHAR(50) COMMENT 'createUser',
    update_user VARCHAR(50) COMMENT 'updateUser',
    create_time DATETIME COMMENT 'createTime',
    update_time TIMESTAMP COMMENT 'updateTime',
    enabled     INT(11) COMMENT 'enabled',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_user';
