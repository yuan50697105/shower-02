create table if not exists admin_permission
(
    id          bigint(15) auto_increment comment 'id',
    create_date datetime                             null comment 'createTime',
    update_date datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    creator     bigint                               null comment 'createUser',
    updater     bigint                               null comment 'updateUser',
    name        varchar(50)                          null comment 'name',
    role_id     bigint                               null comment '角色ID',
    del_flag    varchar(2) default '0'               null,
    constraint admin_permission_id_uindex
        unique (id)
)
    comment '管理员权限' charset = utf8mb4;

alter table admin_permission
    add primary key (id);

create table if not exists admin_role
(
    id          bigint(15) auto_increment comment 'id',
    create_date datetime                             null comment '创建时间',
    update_date datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    create_user varchar(50)                          null comment '创建人',
    update_user varchar(50)                          null comment '修改人',
    name        varchar(50)                          null comment '角色名称',
    description varchar(1023)                        null comment '角色描述',
    enabled     tinyint(1) default 1                 null comment '是否启用',
    deleted     tinyint(1) default 0                 null comment '逻辑删除',
    constraint admin_role_id_uindex
        unique (id)
)
    comment '管理员角色' charset = utf8mb4;

alter table admin_role
    add primary key (id);

create table if not exists admin_route
(
    id          bigint(15) auto_increment comment 'id',
    create_date datetime                             null comment '创建时间',
    update_date datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    creator     bigint                               null comment '创建人',
    updater     bigint                               null comment '修改人',
    del_flag    varchar(2) default '0'               null,
    url         varchar(50)                          null comment '链接',
    name        varchar(50)                          null comment '名称',
    parent_id   bigint(15)                           null comment '父类ID',
    weight      int                                  null comment 'weight',
    role_id     bigint                               null comment '角色ID',
    constraint admin_route_id_uindex
        unique (id)
)
    comment 'admin_route' charset = utf8mb4;

alter table admin_route
    add primary key (id);

create table if not exists admin_user
(
    id              bigint(15) auto_increment comment 'id',
    create_date     datetime                               null comment '创建时间',
    update_date     datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    creator         bigint                                 null comment '创建人',
    updater         bigint                                 null comment '修改人',
    del_flag        varchar(2)                             null,
    username        varchar(50)                            null comment '账户',
    password        varchar(255)                           null comment '密码',
    name            varchar(50)                            null comment '姓名',
    enabled         int                                    null comment '启用状态',
    last_login_ip   varchar(63)  default ''                null comment '最近一次登录IP地址',
    last_login_time datetime                               null comment '最近一次登录时间',
    avatar          varchar(255) default ''''              null comment '头像图片',
    constraint admin_user_id_uindex
        unique (id)
)
    comment '管理员用户' charset = utf8mb4;

alter table admin_user
    add primary key (id);

create table if not exists admin_user_role
(
    id          bigint(15) auto_increment comment 'id',
    create_date datetime   default CURRENT_TIMESTAMP null comment 'createTime',
    update_date timestamp  default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    creator     varchar(50)                          null comment 'createUser',
    updater     varchar(50)                          null comment 'updateUser',
    del_flag    varchar(2) default '0'               null,
    user_id     bigint(15)                           null comment 'userId',
    role_id     bigint(15)                           null comment 'roleId',
    constraint admin_user_role_id_uindex
        unique (id)
)
    comment '管理员用户角色关联' charset = utf8mb4;

alter table admin_user_role
    add primary key (id);

create table if not exists area_building
(
    id          bigint(15) auto_increment comment 'id',
    create_date datetime                             null comment '创建时间',
    update_date datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    creator     bigint                               null comment '创建人',
    updater     bigint                               null comment '修改人',
    del_flag    varchar(2) default '0'               null,
    name        varchar(50)                          null comment '楼宇名称',
    code        varchar(50)                          null comment '楼宇编号',
    area_id     bigint(15)                           null comment '所属区域ID',
    constraint area_building_id_uindex
        unique (id)
)
    comment '楼宇信息' charset = utf8mb4;

alter table area_building
    add primary key (id);

create table if not exists area_info
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_date datetime                             null comment 'createTime',
    update_date datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    creator     bigint                               null comment 'createUser',
    updater     bigint                               null comment 'updateUser',
    del_flag    varchar(2) default '0'               null,
    name        varchar(50)                          null comment '区域名称',
    code        varchar(50)                          null comment '区域编号'
)
    comment '区域信息' charset = utf8mb4;

create table if not exists customer_info
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_date datetime                             null comment '创建时间',
    update_date datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    creator     bigint                               null comment '创建人',
    updater     bigint                               null comment '修改人',
    del_flag    varchar(2) default '0'               null,
    open_id     varchar(50)                          null comment '用户微信OpenId',
    union_id    varchar(50)                          null comment '用户微信UNIONID（未使用）',
    nick_name   varchar(50)                          null comment '用户微信昵称',
    gender      int                                  null comment '性别',
    phone_num   varchar(50)                          null comment '电话'
)
    comment 'customer_info' charset = utf8mb4;

create table if not exists device_info
(
    id            bigint(15) auto_increment comment 'id'
        primary key,
    create_date   datetime                             null comment '创建时间',
    update_date   datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    updater       bigint                               null comment '修改人',
    creator       bigint                               null comment '创建人',
    del_flag      varchar(2) default '0'               null,
    code          varchar(50)                          null comment '设备编号',
    product_key   varchar(50)                          null comment '产品编号',
    device_name   varchar(50)                          null comment '设备名称',
    type          int                                  null comment '设备类型',
    price_code    varchar(50)                          null comment '定价编号',
    enabled       int        default 0                 null comment '启用状态(0:未启用；1已启用)',
    longitude     double(16, 4)                        null comment '经度',
    latitude      double(16, 4)                        null comment '纬度',
    area_id       bigint(15)                           null comment '区域ID',
    area_name     varchar(50)                          null comment '区域名称',
    building_id   bigint(15)                           null comment '楼宇ID',
    building_name varchar(50)                          null comment '楼宇名称',
    picture       varchar(50)                          null comment '设备图片',
    run_status    int        default 0                 null comment '运行状态 0 可用 1 使用中 '
)
    comment 'device_info' charset = utf8mb4;

create table if not exists device_info_volume
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_date datetime                             null comment '创建时间',
    update_date datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    creator     varchar(50)                          null comment '创建人',
    updater     varchar(50)                          null comment '修改人',
    del_flag    varchar(2) default '0'               null,
    device_id   bigint(15)                           null comment '设备ID',
    volume      double(16, 4)                        null comment '热水容量'
)
    comment 'device_info_volume' charset = utf8mb4;

create table if not exists device_order
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_date datetime                             null comment '创建时间',
    update_date datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    creator     bigint                               null comment '创建人',
    updater     bigint                               null comment '修改人',
    del_flag    varchar(2) default '0'               null,
    device_id   bigint(15)                           null comment '设备ID',
    device_code varchar(50)                          null comment '设备编号',
    range_code  varchar(50)                          null comment '地区码',
    device_type int                                  null comment '设备类型',
    order_id    bigint(15)                           null comment '订单ID',
    order_no    varchar(50)                          null comment '订单号',
    order_type  int                                  null comment '订单类型',
    customer_id bigint(15)                           null comment '客户ID',
    union_id    varchar(50)                          null comment '客户UNIONID',
    open_id     varchar(50)                          null comment '客户OPENID',
    status      int                                  null comment '订单状态',
    start_time  datetime                             null comment '使用开始时间',
    end_time    datetime                             null comment '结束时间、离开时间'
)
    comment 'device_order' charset = utf8mb4;

create table if not exists device_order_info
(
    id          bigint(15)                           not null comment 'id'
        primary key,
    create_date datetime                             null comment 'createTime',
    update_date datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    creator     bigint                               null comment 'createUser',
    updater     bigint                               null comment 'updateUser',
    del_flag    varchar(2) default '0'               null,
    device_id   bigint(15)                           null comment '设备ID',
    device_code varchar(50)                          null comment '设备编号',
    order_id    bigint(15)                           null comment '订单ID',
    order_no    varchar(50)                          null comment '订单号',
    status      int                                  null comment '设备订单状态',
    content     varchar(50)                          null comment '详情'
)
    comment '设备订单信息（旧）' charset = utf8mb4;

create table if not exists device_record
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_date datetime                             null comment '创建时间',
    update_date datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    creator     bigint                               null comment '创建人',
    updater     bigint                               null comment '修改人',
    del_flag    varchar(2) default '0'               null,
    device_id   bigint(15)                           null comment '设备ID',
    device_code varchar(50)                          null comment '设备编号',
    type        int                                  null comment '操作类型',
    content     varchar(50)                          null comment '详情'
)
    comment '设备运行记录' charset = utf8mb4;

create table if not exists device_running_log
(
    id            bigint(15) auto_increment comment 'id'
        primary key,
    create_date   datetime                             null comment '创建时间',
    update_date   datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    creator       bigint                               null comment '创建人',
    updater       bigint                               null,
    del_flag      varchar(2) default '0'               null,
    device_id     bigint(15)                           null comment '设备ID',
    device_code   varchar(50)                          null comment '设备编号',
    status        int                                  null comment '运行状态',
    person_status int                                  null comment '人员状态',
    person_speed  double(16, 4)                        null comment '人员消费',
    temperature01 double(16, 4)                        null comment '温度01',
    temperature02 double(16, 4)                        null comment '温度02',
    volume01      double(16, 4)                        null comment '水箱容量01',
    volume02      double(16, 4)                        null comment '水箱容量02'
)
    comment '设备运行日志' charset = utf8mb4;

create table if not exists feedback
(
    id              bigint(15) unsigned auto_increment comment 'id'
        primary key,
    create_time     datetime                            null comment '创建时间',
    update_time     timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '修改时间',
    create_user     varchar(50) charset utf8mb4         null comment '创建人',
    update_user     varchar(50) charset utf8mb4         null comment '修改人',
    customer_id     bigint(15)                          null comment '用户ID',
    title           varchar(255)                        null comment '反馈标题',
    content         text                                null comment '反馈内容',
    image           varchar(1000)                       null comment '反馈图片路径',
    respond_status  int                                 null comment '官方回复状态',
    respond_content text                                null comment '官方回复内容',
    respond_time    datetime                            null comment '官方回复时间'
)
    comment '用户反馈';

create table if not exists member_info
(
    id                 bigint(15) auto_increment comment 'id'
        primary key,
    create_date        datetime                             null comment '创建时间',
    update_date        timestamp  default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    creator            bigint                               null comment '创建人',
    updater            bigint                               null comment '修改人',
    del_flag           varchar(2) default '0'               null,
    customer_id        bigint(15)                           null comment '客户ID',
    customer_nick_name varchar(50)                          null comment '客户昵称',
    customer_open_id   varchar(50)                          null comment '客户微信openId',
    customer_union_id  varchar(50)                          null comment '客户UNIONID',
    type               int                                  null comment '客户类型',
    code               varchar(50)                          null comment '会员编号'
)
    comment '会员信息' charset = utf8mb4;

create table if not exists order_info
(
    id                bigint(15) auto_increment comment 'id'
        primary key,
    create_date       datetime                             null comment '创建时间',
    update_date       datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    creator           bigint                               null comment '创建人',
    updater           bigint                               null comment '修改人',
    del_flag          varchar(2) default '0'               null,
    order_no          varchar(50)                          null comment '订单编号',
    type              int                                  null comment '订单类型',
    customer_id       bigint(15)                           null comment '客户ID',
    customer_open_id  varchar(50)                          null comment '客户OPENID',
    customer_union_id varchar(50)                          null comment '客户UNIONID',
    device_code       varchar(50)                          null comment '设备号',
    device_id         bigint(15)                           null comment '设备ID',
    total_price       decimal(13, 4)                       null comment '总价',
    status            int                                  null comment '订单状态',
    use_start_time    datetime                             null comment '使用开始时间',
    use_end_time      datetime                             null comment '使用结束时间',
    transaction_id    varchar(255)                         null comment '微信交易号'
)
    comment 'order_info' charset = utf8mb4;

create table if not exists order_item
(
    id             bigint(15) auto_increment comment 'id'
        primary key,
    create_date    datetime                             null comment '创建时间',
    update_date    datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    creator        bigint                               null comment '创建人',
    updater        bigint                               null comment '修改人',
    del_flag       varchar(2) default '0'               null,
    order_id       bigint(15)                           null comment '订单ID',
    order_no       varchar(50)                          null comment '订单号',
    device_id      bigint(15)                           null comment '设备ID',
    device_code    varchar(50)                          null comment '设备编号',
    device_type    int                                  null comment '设备类型',
    price_code     varchar(50)                          null comment '价格码',
    price_id       bigint(15)                           null comment '定价ID',
    price_type     int                                  null comment '定价类型',
    time_price     decimal(13, 4)                       null comment '时间价格',
    time_interval  double(16, 4)                        null comment '时间计费间隔',
    time_unit      int                                  null comment '时间计费单位',
    start_time     datetime                             null comment '开始时间',
    end_time       datetime                             null comment '结束时间',
    time_use       double(16, 4)                        null comment '用时',
    water_price    decimal(13, 4)                       null comment '水价',
    water_interval double(16, 4)                        null comment '水计费间隔',
    water_unit     int                                  null comment '水计费单位',
    water_use      double(16, 4)                        null comment '水用量',
    total_price    decimal(13, 4)                       null comment '总价'
)
    comment 'order_item' charset = utf8mb4;

create table if not exists price_info
(
    id             bigint(15) auto_increment comment 'id'
        primary key,
    create_date    datetime                             null comment 'createTime',
    update_date    datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'updateTime',
    creator        bigint                               null comment 'createUser',
    updater        varchar(50)                          null comment 'updateUser',
    del_flag       varchar(2) default '0'               null,
    code           varchar(50)                          null comment '编号',
    type           int                                  null comment '类型',
    price_code     varchar(50)                          null comment '地区码',
    time_price     decimal(13, 4)                       null comment '时间定价',
    time_interval  double(16, 4)                        null comment '时间计费间隔',
    time_unit      int                                  null comment '时间单位',
    water_price    decimal(13, 4)                       null comment '水定价',
    water_interval double(16, 4)                        null comment '水计费间隔',
    water_unit     int                                  null comment '水计费单位',
    enabled        int                                  null comment '有效'
)
    comment 'price_info' charset = utf8mb4;

