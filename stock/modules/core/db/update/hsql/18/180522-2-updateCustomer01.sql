alter table STOCK_CUSTOMER alter column AMOUNT rename to AMOUNT__U85725 ;
alter table STOCK_CUSTOMER add column TOTAL_AMOUNT decimal(19, 2) ;
