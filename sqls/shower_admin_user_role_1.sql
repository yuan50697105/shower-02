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
VALUES (1, '2020-06-20 18:44:08', '2020-06-20 18:44:10', '', '', 1, 1);
INSERT INTO shower.admin_user_role (id, create_time, update_time, create_user, update_user, user_id, role_id)
VALUES (2, null, '2020-06-20 18:49:30', null, null, 2, 1);
INSERT INTO shower.admin_user_role (id, create_time, update_time, create_user, update_user, user_id, role_id)
VALUES (11, '2020-06-20 19:33:32', '2020-06-20 19:33:32', null, null, 10, 1);
INSERT INTO shower.admin_user_role (id, create_time, update_time, create_user, update_user, user_id, role_id)
VALUES (12, null, '2020-07-08 20:47:11', null, null, 11, 1);