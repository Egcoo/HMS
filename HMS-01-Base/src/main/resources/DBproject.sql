-- 员工表
create table t_manager
(
    id         int auto_increment,
    manager_id varchar(20) unique not null,
    pwd        varchar(50)        not null,
    name       varchar(25)        not null,
    job        varchar(20)        not null,
    constraint t_manager_pk
        primary key (id)
);

-- 菜品表
create table t_menu
(
    id    int primary key auto_increment comment '自增主键，作为菜谱编号(唯一)',
    name  varchar(50) not null default '' comment '菜品名称',
    type  varchar(50) not null default '' comment '菜品种类',
    price double      not null default 0 comment '价格'
) charset = utf8;

-- 订单表
create table t_order
(
    order_id       int primary key auto_increment unique comment '订单id',
    customer_name  varchar(20) not null default '' comment '预订人的名字',
    table_num      varchar(50) not null default '' comment '桌号',
    customer_phone varchar(20) not null default '顾客联系方式',
    status         varchar(50) not null default '' comment '订单状态',
    total_amount   int         not null comment '订单总金额',
    create_time    datetime    not null comment '订单日期'
) charset = utf8;

-- 菜品订单表
create table t_dish_order
(
    dish_order_id   int primary key auto_increment comment '菜品订单',
    order_id        int not null comment '关联订单表的订单ID',
    dish_id         int not null comment '关联菜品表的菜品id',
    quantity        int not null comment '菜品数量',
    special_request varchar(40) comment '特殊要求，如辣度、口味'
) charset = utf8;

-- 库存表
create table t_inventory
(
    inventory_id varchar(20) primary key comment '库存id，唯一标识',
    dish_id      varchar(20) not null default '' comment '关联菜品表的菜品ID',
    quantity     int         not null comment '菜品库存数量',
    threshold    int         not null comment '库存预警阈值'
) charset = utf8;



