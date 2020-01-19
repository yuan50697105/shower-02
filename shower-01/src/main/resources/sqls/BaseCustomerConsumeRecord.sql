-- auto Generated on 2020-01-19
DROP TABLE IF EXISTS base_customer_consume_record;
CREATE TABLE base_customer_consume_record
(
    id               BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    customer_id      BIGINT(15) COMMENT 'customerId',
    customer_open_id VARCHAR(50) COMMENT 'customerOpenId',
    customer_name    VARCHAR(50) COMMENT 'customerName',
    price            DECIMAL(13, 4) COMMENT 'price',
    `time`           DECIMAL(13, 4) COMMENT 'time',
    total_price      DECIMAL(13, 4) COMMENT 'totalPrice',
    `operation`      VARCHAR(50) COMMENT 'operation',
    device_id        BIGINT(15) COMMENT 'deviceId',
    device_code      VARCHAR(50) COMMENT 'deviceCode',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'base_customer_consume_record';
