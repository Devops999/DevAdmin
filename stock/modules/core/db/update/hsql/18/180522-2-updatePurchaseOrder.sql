alter table STOCK_PURCHASE_ORDER add column DATE_OF_TRANSACTION date ;
alter table STOCK_PURCHASE_ORDER add column ITEMS_ID varchar(36) ;
alter table STOCK_PURCHASE_ORDER add column TAX decimal(19, 2) ;
