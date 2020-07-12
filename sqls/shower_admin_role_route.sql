create table admin_role_route
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_time datetime    default '1000-01-01 00:00:00' not null comment 'createTime',
    update_time timestamp   default CURRENT_TIMESTAMP     not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user varchar(50) default ''                    null comment 'createUser',
    update_user varchar(50) default ''                    null comment 'updateUser',
    role_id     bigint(15)  default -1                    not null comment 'roleId',
    route_id    bigint(15)  default -1                    not null comment 'routeId'
)
    comment 'admin_role_route' charset = utf8mb4;

