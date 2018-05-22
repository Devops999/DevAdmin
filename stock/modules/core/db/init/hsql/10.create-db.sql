-- begin STOCK_CUSTOMER
create table STOCK_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    TOTAL_AMOUNT decimal(19, 2),
    AMOUNT_AFTER_TAX decimal(19, 2),
    --
    primary key (ID)
)^
-- end STOCK_CUSTOMER
-- begin STOCK_PURCHASE_ORDER
create table STOCK_PURCHASE_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_OF_TRANSACTION date,
    CUSTOMER_ID varchar(36),
    ITEMS_ID varchar(36),
    TAX decimal(19, 2),
    --
    primary key (ID)
)^
-- end STOCK_PURCHASE_ORDER
-- begin STOCK_ITEM
create table STOCK_ITEM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CATEGORY varchar(255),
    DESCRIPTION longvarchar,
    CUSTOMER_ID varchar(36),
    PRICE decimal(19, 2),
    QUANTITY integer,
    --
    primary key (ID)
)^
-- end STOCK_ITEM
