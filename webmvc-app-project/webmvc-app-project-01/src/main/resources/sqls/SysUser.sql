-- auto Generated on 2020-01-01
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user
(
    id          BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    username    VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'username',
    `password`  VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'password',
    real_name   VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'realName',
    nick_name   VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'nickName',
    create_user VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'createUser',
    update_user VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'updateUser',
    create_time DATETIME    NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createTime',
    update_time TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    enabled     TINYINT(3)  NOT NULL DEFAULT 0 COMMENT 'enabled',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_user';
