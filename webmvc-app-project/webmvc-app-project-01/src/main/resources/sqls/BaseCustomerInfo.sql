-- auto Generated on 2020-01-05
DROP TABLE IF EXISTS base_customer_info;
CREATE TABLE base_customer_info
(
    id              BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    actual_name     VARCHAR(50) COMMENT 'actualName',
    contact_address VARCHAR(50) COMMENT 'contactAddress',
    contact_number  VARCHAR(50) COMMENT 'contactNumber',
    identity_number VARCHAR(50) COMMENT 'identityNumber',
    enabled         INT(11) COMMENT 'enabled',
    create_user     VARCHAR(50) COMMENT 'createUser',
    update_user     VARCHAR(50) COMMENT 'updateUser',
    create_time     DATETIME COMMENT 'createTime',
    update_time     TIMESTAMP COMMENT 'updateTime',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'base_customer_info';
