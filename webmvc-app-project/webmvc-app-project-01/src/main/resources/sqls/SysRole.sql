-- auto Generated on 2019-12-28
DROP TABLE IF EXISTS sys_role;
CREATE TABLE sys_role
(
    id          BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    authority   VARCHAR(50) unique COMMENT 'authority',
    `name`      VARCHAR(50) unique COMMENT 'name',
    create_user VARCHAR(50) COMMENT 'createUser',
    update_user VARCHAR(50) COMMENT 'updateUser',
    create_time DATETIME COMMENT 'createTime',
    update_time TIMESTAMP COMMENT 'updateTime',
    enabled     INT(11) COMMENT 'enabled',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_role';
