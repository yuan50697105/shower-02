create table area_tower
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                         null comment 'createUser',
    update_user varchar(50)                         null comment 'updateUser',
    name        varchar(50)                         null comment '楼宇名称',
    code        varchar(50)                         null comment '楼宇编号',
    area_id     bigint(15)                          null comment '所属区域ID'
)
    comment '区域楼宇信息' charset = utf8mb4;

INSERT INTO shower.area_tower (id, create_time, update_time, create_user, update_user, name, code, area_id)
VALUES (1, '2020-03-24 13:52:16', '2020-03-24 13:52:19', null, null, '1号楼', '001', 1);
INSERT INTO shower.area_tower (id, create_time, update_time, create_user, update_user, name, code, area_id)
VALUES (2, '2020-03-24 14:48:05', '2020-03-24 14:48:14', null, null, '1号楼', '001', 2);