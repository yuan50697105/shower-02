create schema if not exists learning collate utf8mb4_0900_ai_ci;

create table if not exists base_customer_consume_record
(
    id               bigint(15)     not null comment 'id'
        primary key,
    customer_id      bigint(15)     null comment 'customerId',
    customer_open_id varchar(50)    null comment 'customerOpenId',
    customer_name    varchar(50)    null comment 'customerName',
    price            decimal(13, 4) null comment 'price',
    time             decimal(13, 4) null comment 'time',
    total_price      decimal(13, 4) null comment 'totalPrice',
    operation        varchar(50)    null comment 'operation',
    device_id        bigint(15)     null comment 'deviceId',
    device_code      varchar(50)    null comment 'deviceCode'
)
    comment 'base_customer_consume_record';

create table if not exists base_customer_info
(
    id              bigint(15)  not null comment 'id'
        primary key,
    actual_name     varchar(50) null comment 'actualName',
    open_id         varchar(50) null comment 'openId',
    contact_address varchar(50) null comment 'contactAddress',
    contact_number  varchar(50) null comment 'contactNumber',
    identity_number varchar(50) null comment 'identityNumber',
    enabled         int         null comment 'enabled',
    create_user     varchar(50) null comment 'createUser',
    update_user     varchar(50) null comment 'updateUser',
    create_time     datetime    null comment 'createTime',
    update_time     timestamp   null comment 'updateTime'
)
    comment 'base_customer_info';

create table if not exists base_device_info
(
    id            bigint(15)                                not null comment 'id'
        primary key,
    create_user   varchar(50) default ''                    null comment 'createUser',
    create_time   datetime    default '1000-01-01 00:00:00' null comment 'createTime',
    code          varchar(50) default ''                    null comment 'code',
    name          varchar(50) default ''                    null comment 'name',
    address       varchar(50) default ''                    null comment 'address',
    point         varchar(50) default ''                    null comment 'point',
    enabled       int         default -1                    null comment 'enabled',
    enabled_time  datetime    default '1000-01-01 00:00:00' null comment 'enabledTime',
    disabled_time datetime    default '1000-01-01 00:00:00' null comment 'disabledTime',
    constraint code
        unique (code)
)
    comment 'base_device_info';

create table if not exists base_goods_info
(
    id          bigint(15)     not null comment 'id'
        primary key,
    create_user varchar(50)    null comment 'createUser',
    update_user varchar(50)    null comment 'updateUser',
    create_time datetime       null comment 'createTime',
    update_time timestamp      null comment 'updateTime',
    code        varchar(50)    null comment 'code',
    name        varchar(50)    null comment 'name',
    price       decimal(13, 4) null comment 'price',
    min_price   decimal(13, 4) null comment 'minPrice',
    price_range decimal(13, 4) null comment 'priceRange',
    enabled     int            null comment 'enabled',
    constraint code
        unique (code)
)
    comment 'base_goods_info';

create table if not exists order_info
(
    id             bigint(15)     not null comment 'id'
        primary key,
    order_no       varchar(50)    null comment 'orderNo',
    user_id        bigint(15)     null comment 'userId',
    user_open_id   bigint(15)     null comment 'userOpenId',
    user_name      varchar(50)    null comment 'userName',
    order_price    decimal(13, 4) null comment 'orderPrice',
    create_time    datetime       null comment 'createTime',
    update_time    timestamp      null comment 'updateTime',
    start_time     datetime       null comment 'startTime',
    pay_status     int            null comment 'payStatus',
    pay_time       datetime       null comment 'payTime',
    use_status     int            null comment 'useStatus',
    use_start_time datetime       null comment 'useStartTime',
    use_end_time   datetime       null comment 'useEndTime',
    device_id      bigint(15)     null comment 'deviceId',
    device_code    varchar(50)    null comment 'deviceCode',
    device_address varchar(50)    null comment 'deviceAddress',
    device_point   varchar(50)    null comment 'devicePoiny',
    constraint order_no
        unique (order_no)
)
    comment 'order_info';

create table if not exists qrtz_calendars
(
    SCHED_NAME    varchar(120) not null,
    CALENDAR_NAME varchar(200) not null,
    CALENDAR      blob         not null,
    primary key (SCHED_NAME, CALENDAR_NAME)
);

create table if not exists qrtz_fired_triggers
(
    SCHED_NAME        varchar(120) not null,
    ENTRY_ID          varchar(95)  not null,
    TRIGGER_NAME      varchar(200) not null,
    TRIGGER_GROUP     varchar(200) not null,
    INSTANCE_NAME     varchar(200) not null,
    FIRED_TIME        bigint(13)   not null,
    SCHED_TIME        bigint(13)   not null,
    PRIORITY          int          not null,
    STATE             varchar(16)  not null,
    JOB_NAME          varchar(200) null,
    JOB_GROUP         varchar(200) null,
    IS_NONCONCURRENT  varchar(1)   null,
    REQUESTS_RECOVERY varchar(1)   null,
    primary key (SCHED_NAME, ENTRY_ID)
);

create index IDX_QRTZ_FT_INST_JOB_REQ_RCVRY
    on qrtz_fired_triggers (SCHED_NAME, INSTANCE_NAME, REQUESTS_RECOVERY);

create index IDX_QRTZ_FT_JG
    on qrtz_fired_triggers (SCHED_NAME, JOB_GROUP);

create index IDX_QRTZ_FT_J_G
    on qrtz_fired_triggers (SCHED_NAME, JOB_NAME, JOB_GROUP);

create index IDX_QRTZ_FT_TG
    on qrtz_fired_triggers (SCHED_NAME, TRIGGER_GROUP);

create index IDX_QRTZ_FT_TRIG_INST_NAME
    on qrtz_fired_triggers (SCHED_NAME, INSTANCE_NAME);

create index IDX_QRTZ_FT_T_G
    on qrtz_fired_triggers (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP);

create table if not exists qrtz_job_details
(
    SCHED_NAME        varchar(120) not null,
    JOB_NAME          varchar(200) not null,
    JOB_GROUP         varchar(200) not null,
    DESCRIPTION       varchar(250) null,
    JOB_CLASS_NAME    varchar(250) not null,
    IS_DURABLE        varchar(1)   not null,
    IS_NONCONCURRENT  varchar(1)   not null,
    IS_UPDATE_DATA    varchar(1)   not null,
    REQUESTS_RECOVERY varchar(1)   not null,
    JOB_DATA          blob         null,
    primary key (SCHED_NAME, JOB_NAME, JOB_GROUP)
);

create index IDX_QRTZ_J_GRP
    on qrtz_job_details (SCHED_NAME, JOB_GROUP);

create index IDX_QRTZ_J_REQ_RECOVERY
    on qrtz_job_details (SCHED_NAME, REQUESTS_RECOVERY);

create table if not exists qrtz_locks
(
    SCHED_NAME varchar(120) not null,
    LOCK_NAME  varchar(40)  not null,
    primary key (SCHED_NAME, LOCK_NAME)
);

create table if not exists qrtz_paused_trigger_grps
(
    SCHED_NAME    varchar(120) not null,
    TRIGGER_GROUP varchar(200) not null,
    primary key (SCHED_NAME, TRIGGER_GROUP)
);

create table if not exists qrtz_scheduler_state
(
    SCHED_NAME        varchar(120) not null,
    INSTANCE_NAME     varchar(200) not null,
    LAST_CHECKIN_TIME bigint(13)   not null,
    CHECKIN_INTERVAL  bigint(13)   not null,
    primary key (SCHED_NAME, INSTANCE_NAME)
);

create table if not exists qrtz_triggers
(
    SCHED_NAME     varchar(120) not null,
    TRIGGER_NAME   varchar(200) not null,
    TRIGGER_GROUP  varchar(200) not null,
    JOB_NAME       varchar(200) not null,
    JOB_GROUP      varchar(200) not null,
    DESCRIPTION    varchar(250) null,
    NEXT_FIRE_TIME bigint(13)   null,
    PREV_FIRE_TIME bigint(13)   null,
    PRIORITY       int          null,
    TRIGGER_STATE  varchar(16)  not null,
    TRIGGER_TYPE   varchar(8)   not null,
    START_TIME     bigint(13)   not null,
    END_TIME       bigint(13)   null,
    CALENDAR_NAME  varchar(200) null,
    MISFIRE_INSTR  smallint(2)  null,
    JOB_DATA       blob         null,
    primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP),
    constraint qrtz_triggers_ibfk_1
        foreign key (SCHED_NAME, JOB_NAME, JOB_GROUP) references qrtz_job_details (SCHED_NAME, JOB_NAME, JOB_GROUP)
);

create table if not exists qrtz_blob_triggers
(
    SCHED_NAME    varchar(120) not null,
    TRIGGER_NAME  varchar(200) not null,
    TRIGGER_GROUP varchar(200) not null,
    BLOB_DATA     blob         null,
    primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP),
    constraint qrtz_blob_triggers_ibfk_1
        foreign key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP) references qrtz_triggers (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

create index SCHED_NAME
    on qrtz_blob_triggers (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP);

create table if not exists qrtz_cron_triggers
(
    SCHED_NAME      varchar(120) not null,
    TRIGGER_NAME    varchar(200) not null,
    TRIGGER_GROUP   varchar(200) not null,
    CRON_EXPRESSION varchar(120) not null,
    TIME_ZONE_ID    varchar(80)  null,
    primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP),
    constraint qrtz_cron_triggers_ibfk_1
        foreign key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP) references qrtz_triggers (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

create table if not exists qrtz_simple_triggers
(
    SCHED_NAME      varchar(120) not null,
    TRIGGER_NAME    varchar(200) not null,
    TRIGGER_GROUP   varchar(200) not null,
    REPEAT_COUNT    bigint(7)    not null,
    REPEAT_INTERVAL bigint(12)   not null,
    TIMES_TRIGGERED bigint(10)   not null,
    primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP),
    constraint qrtz_simple_triggers_ibfk_1
        foreign key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP) references qrtz_triggers (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

create table if not exists qrtz_simprop_triggers
(
    SCHED_NAME    varchar(120)   not null,
    TRIGGER_NAME  varchar(200)   not null,
    TRIGGER_GROUP varchar(200)   not null,
    STR_PROP_1    varchar(512)   null,
    STR_PROP_2    varchar(512)   null,
    STR_PROP_3    varchar(512)   null,
    INT_PROP_1    int            null,
    INT_PROP_2    int            null,
    LONG_PROP_1   bigint         null,
    LONG_PROP_2   bigint         null,
    DEC_PROP_1    decimal(13, 4) null,
    DEC_PROP_2    decimal(13, 4) null,
    BOOL_PROP_1   varchar(1)     null,
    BOOL_PROP_2   varchar(1)     null,
    primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP),
    constraint qrtz_simprop_triggers_ibfk_1
        foreign key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP) references qrtz_triggers (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

create index IDX_QRTZ_T_C
    on qrtz_triggers (SCHED_NAME, CALENDAR_NAME);

create index IDX_QRTZ_T_G
    on qrtz_triggers (SCHED_NAME, TRIGGER_GROUP);

create index IDX_QRTZ_T_J
    on qrtz_triggers (SCHED_NAME, JOB_NAME, JOB_GROUP);

create index IDX_QRTZ_T_JG
    on qrtz_triggers (SCHED_NAME, JOB_GROUP);

create index IDX_QRTZ_T_NEXT_FIRE_TIME
    on qrtz_triggers (SCHED_NAME, NEXT_FIRE_TIME);

create index IDX_QRTZ_T_NFT_MISFIRE
    on qrtz_triggers (SCHED_NAME, MISFIRE_INSTR, NEXT_FIRE_TIME);

create index IDX_QRTZ_T_NFT_ST
    on qrtz_triggers (SCHED_NAME, TRIGGER_STATE, NEXT_FIRE_TIME);

create index IDX_QRTZ_T_NFT_ST_MISFIRE
    on qrtz_triggers (SCHED_NAME, MISFIRE_INSTR, NEXT_FIRE_TIME, TRIGGER_STATE);

create index IDX_QRTZ_T_NFT_ST_MISFIRE_GRP
    on qrtz_triggers (SCHED_NAME, MISFIRE_INSTR, NEXT_FIRE_TIME, TRIGGER_GROUP, TRIGGER_STATE);

create index IDX_QRTZ_T_N_G_STATE
    on qrtz_triggers (SCHED_NAME, TRIGGER_GROUP, TRIGGER_STATE);

create index IDX_QRTZ_T_N_STATE
    on qrtz_triggers (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, TRIGGER_STATE);

create index IDX_QRTZ_T_STATE
    on qrtz_triggers (SCHED_NAME, TRIGGER_STATE);

create table if not exists sys_module
(
    id        bigint(15)             not null comment 'id'
        primary key,
    name      varchar(50) default '' null comment 'name',
    content   varchar(50) default '' null comment 'content',
    type      varchar(50) default '' null comment 'type',
    parent_id bigint(15)  default -1 null comment 'parentId',
    level     int         default -1 null comment 'level'
)
    comment 'sys_module';

create table if not exists sys_permission
(
    id          bigint(15)  not null comment 'id'
        primary key,
    name        varchar(50) null comment 'name',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    enabled     int         null comment 'enabled',
    constraint name
        unique (name)
)
    comment 'sys_permission';

create table if not exists sys_role
(
    id          bigint(15)  not null comment 'id'
        primary key,
    name        varchar(50) null comment 'name',
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    enabled     int         null comment 'enabled',
    constraint name
        unique (name)
)
    comment 'sys_role';

create table if not exists sys_role_permission
(
    id            bigint                             not null
        primary key,
    role_id       bigint                             not null,
    permission_id bigint                             not null,
    create_time   datetime default CURRENT_TIMESTAMP null,
    create_user   bigint                             null
)
    comment '角色权限';

create table if not exists sys_user
(
    id          bigint(15)                                 not null comment 'id'
        primary key,
    username    varchar(50)  default ''                    not null comment 'username',
    password    varchar(255) default ''                    not null comment 'password',
    real_name   varchar(50)  default ''                    not null comment 'realName',
    nick_name   varchar(50)  default ''                    not null comment 'nickName',
    create_user varchar(50)  default ''                    not null comment 'createUser',
    update_user varchar(50)  default ''                    not null comment 'updateUser',
    create_time datetime     default '1000-01-01 00:00:00' not null comment 'createTime',
    update_time timestamp    default CURRENT_TIMESTAMP     not null on update CURRENT_TIMESTAMP comment 'updateTime',
    enabled     tinyint(3)   default 0                     not null comment 'enabled',
    constraint sys_user_username_uindex
        unique (username)
)
    comment 'sys_user';

create table if not exists sys_user_role
(
    id          bigint(15)  not null comment 'id'
        primary key,
    role_id     bigint(15)  not null comment 'roleId',
    user_id     bigint(15)  not null comment 'userId',
    create_user varchar(50) null comment 'createUser',
    create_time datetime    null comment 'createTime'
)
    comment 'sys_user_role';

create or replace definer = root@localhost view sys_user_role_permission_view as
select `su`.`id`          AS `id`,
       `su`.`username`    AS `username`,
       `su`.`password`    AS `password`,
       `su`.`real_name`   AS `real_name`,
       `su`.`nick_name`   AS `nick_name`,
       `su`.`create_user` AS `create_user`,
       `su`.`update_user` AS `update_user`,
       `su`.`create_time` AS `create_time`,
       `su`.`update_time` AS `update_time`,
       `su`.`enabled`     AS `enabled`,
       `sr`.`name`        AS `role_name`,
       `sp`.`name`        AS `permission_name`
from ((((`learning`.`sys_user` `su` left join `learning`.`sys_user_role` `sur` on ((`sur`.`user_id` = `su`.`id`))) left join `learning`.`sys_role` `sr` on ((`sr`.`id` = `sur`.`role_id`))) left join `learning`.`sys_role_permission` `srp` on ((`srp`.`role_id` = `sr`.`id`)))
         left join `learning`.`sys_permission` `sp` on ((`sp`.`id` = `srp`.`permission_id`)));

-- comment on column sys_user_role_permission_view.id not supported: id

-- comment on column sys_user_role_permission_view.username not supported: username

-- comment on column sys_user_role_permission_view.password not supported: password

-- comment on column sys_user_role_permission_view.real_name not supported: realName

-- comment on column sys_user_role_permission_view.nick_name not supported: nickName

-- comment on column sys_user_role_permission_view.create_user not supported: createUser

-- comment on column sys_user_role_permission_view.update_user not supported: updateUser

-- comment on column sys_user_role_permission_view.create_time not supported: createTime

-- comment on column sys_user_role_permission_view.update_time not supported: updateTime

-- comment on column sys_user_role_permission_view.enabled not supported: enabled

-- comment on column sys_user_role_permission_view.role_name not supported: name

-- comment on column sys_user_role_permission_view.permission_name not supported: name

create or replace definer = root@localhost view sys_user_role_view as
select `user`.`id`          AS `id`,
       `user`.`username`    AS `username`,
       `user`.`password`    AS `password`,
       `user`.`real_name`   AS `real_name`,
       `user`.`nick_name`   AS `nick_name`,
       `user`.`create_user` AS `create_user`,
       `user`.`update_user` AS `update_user`,
       `user`.`create_time` AS `create_time`,
       `user`.`update_time` AS `update_time`,
       `user`.`enabled`     AS `enabled`,
       `role`.`name`        AS `role_name`
from ((`learning`.`sys_user` `user` left join `learning`.`sys_user_role` `user_role` on ((`user_role`.`user_id` = `user`.`id`)))
         left join `learning`.`sys_role` `role` on ((`role`.`id` = `user_role`.`role_id`)));

-- comment on column sys_user_role_view.id not supported: id

-- comment on column sys_user_role_view.username not supported: username

-- comment on column sys_user_role_view.password not supported: password

-- comment on column sys_user_role_view.real_name not supported: realName

-- comment on column sys_user_role_view.nick_name not supported: nickName

-- comment on column sys_user_role_view.create_user not supported: createUser

-- comment on column sys_user_role_view.update_user not supported: updateUser

-- comment on column sys_user_role_view.create_time not supported: createTime

-- comment on column sys_user_role_view.update_time not supported: updateTime

-- comment on column sys_user_role_view.enabled not supported: enabled

-- comment on column sys_user_role_view.role_name not supported: name

