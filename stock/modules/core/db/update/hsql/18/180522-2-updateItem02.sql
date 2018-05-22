alter table STOCK_ITEM alter column CUSTOMER_ID rename to CUSTOMER_ID__U58382 ;
drop index IDX_STOCK_ITEM_CUSTOMER ;
alter table STOCK_ITEM drop constraint FK_STOCK_ITEM_CUSTOMER ;
