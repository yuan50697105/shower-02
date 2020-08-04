create table member_info
(
    id                 bigint(15) auto_increment comment 'id'
        primary key,
    create_time        datetime                            null comment 'createTime',
    update_time        timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user        varchar(50)                         null comment 'createUser',
    update_user        varchar(50)                         null comment 'updateUser',
    customer_id        bigint(15)                          null comment '客户ID',
    customer_nick_name varchar(50)                         null comment '客户昵称',
    customer_open_id   varchar(50)                         null comment '客户微信openId',
    customer_union_id  varchar(50)                         null comment '客户UNIONID',
    type               int                                 null comment '客户类型',
    code               varchar(50)                         null comment '会员编号'
)
    comment 'member_info' charset = utf8mb4;

