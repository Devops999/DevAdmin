-- begin STOCK_PURCHASE_ORDER
alter table STOCK_PURCHASE_ORDER add constraint FK_STOCK_PURCHASE_ORDER_CUSTOMER foreign key (CUSTOMER_ID) references STOCK_CUSTOMER(ID)^
alter table STOCK_PURCHASE_ORDER add constraint FK_STOCK_PURCHASE_ORDER_ITEMS foreign key (ITEMS_ID) references STOCK_ITEM(ID)^
create index IDX_STOCK_PURCHASE_ORDER_CUSTOMER on STOCK_PURCHASE_ORDER (CUSTOMER_ID)^
create index IDX_STOCK_PURCHASE_ORDER_ITEMS on STOCK_PURCHASE_ORDER (ITEMS_ID)^
-- end STOCK_PURCHASE_ORDER
-- begin STOCK_ITEM
alter table STOCK_ITEM add constraint FK_STOCK_ITEM_CUSTOMER foreign key (CUSTOMER_ID) references STOCK_CUSTOMER(ID)^
create index IDX_STOCK_ITEM_CUSTOMER on STOCK_ITEM (CUSTOMER_ID)^
-- end STOCK_ITEM
