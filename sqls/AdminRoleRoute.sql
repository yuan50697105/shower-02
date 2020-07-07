-- auto Generated on 2020-07-07
DROP TABLE IF EXISTS admin_role_route;
CREATE TABLE admin_role_route
(
    id          BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    create_time DATETIME   NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createTime',
    update_time TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    create_user VARCHAR(50)         DEFAULT '' COMMENT 'createUser',
    update_user VARCHAR(50)         DEFAULT '' COMMENT 'updateUser',
    role_id     BIGINT(15) NOT NULL DEFAULT -1 COMMENT 'roleId',
    route_id    BIGINT(15) NOT NULL DEFAULT -1 COMMENT 'routeId',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'admin_role_route';
