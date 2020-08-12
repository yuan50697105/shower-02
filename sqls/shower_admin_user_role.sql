create table admin_user_role
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime                            null comment 'createTime',
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50)                         null comment 'createUser',
    update_user varchar(50)                         null comment 'updateUser',
    user_id     bigint(15)                          null comment 'userId',
    role_id     bigint(15)                          null comment 'roleId'
)
    comment '管理员用户角色关联' charset = utf8mb4;

INSERT INTO shower.admin_user_role (id, create_time, update_time, create_user, update_user, user_id, role_id)
VALUES (28, null, '2020-07-31 22:32:37', null, null, 11, 1);
INSERT INTO shower.admin_user_role (id, create_time, update_time, create_user, update_user, user_id, role_id)
VALUES (32, '2020-07-31 22:35:12', '2020-07-31 22:35:12', null, null, 12, 1);
INSERT INTO shower.admin_user_role (id, create_time, update_time, create_user, update_user, user_id, role_id)
VALUES (33, '2020-07-31 22:36:33', '2020-07-31 22:36:33', null, null, 12, 2);