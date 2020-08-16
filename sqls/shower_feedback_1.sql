create table feedback
(
    id              bigint(15) unsigned auto_increment comment 'id'
        primary key,
    create_time     datetime                            null comment 'createTime',
    update_time     timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment 'updateTime',
    create_user     varchar(50) charset utf8mb4         null comment 'createUser',
    update_user     varchar(50) charset utf8mb4         null comment 'updateUser',
    customer_id     bigint(15)                          null comment '用户ID',
    title           varchar(255)                        null comment '反馈标题',
    content         text                                null comment '反馈内容',
    image           varchar(1000)                       null comment '反馈图片路径',
    respond_status  int                                 null comment '官方回复状态',
    respond_content text                                null comment '官方回复内容',
    respond_time    datetime                            null comment '官方回复时间'
)
    comment '用户反馈';
