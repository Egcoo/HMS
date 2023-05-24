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

insert into t_manager
values (null, '6668612', md5('123456'), '叶文洁', '经理'),
       (null, '6668622', md5('123456'), '史强', '服务员'),
       (null, '6668633', md5('123456'), '汪淼', '服务员'),
       (null, '6668666', md5('123456'), '罗辑', '经理'),
       (null, '6668677', md5('123456'), '庄颜', '财务');


create table t_menu
(
    id    int primary key auto_increment comment '自增主键，作为菜谱编号(唯一)',
    name  varchar(50) not null default '' comment '菜品名称',
    type  varchar(50) not null default '' comment '菜品种类',
    price double      not null default 0 comment '价格'
) charset = utf8;

create table t_diningTable
(
    id         int primary key auto_increment comment '餐桌编号',
    state      varchar(20) not null default '' comment '餐桌的状态',
    order_Name varchar(50) not null default '' comment '预订人的名字',
    order_Tel  varchar(20) not null default ''
) charset = utf8;

create table t_bill
(
    id             int primary key auto_increment comment '自增主键',
    bill_id        varchar(50) not null default '' comment '账单号',
    menu_id        int         not null default 0 comment '菜品的编号, 也可以使用外键',
    nums           SMALLINT    not null default 0 comment '份数',
    money          double      not null default 0 comment '金额',
    diningTable_id int         not null default 0 comment '餐桌',
    bill_date      datetime    not null comment '订单日期',
    state          varchar(50) not null default '' comment '状态, 未结账 ,已经结账, 挂单'#
) charset = utf8;