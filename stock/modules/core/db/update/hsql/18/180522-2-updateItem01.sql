alter table STOCK_ITEM add constraint FK_STOCK_ITEM_CUSTOMER foreign key (CUSTOMER_ID) references STOCK_CUSTOMER(ID);
create index IDX_STOCK_ITEM_CUSTOMER on STOCK_ITEM (CUSTOMER_ID);
