package com.company.stock.service;


import com.company.stock.entity.Item;
import com.company.stock.entity.PurchaseOrder;

import java.math.BigDecimal;
import java.util.UUID;

public interface PurchaseOrderService {
    String NAME = "stock_PurchaseOrderService";
    BigDecimal calculateAmount(UUID customerId);
    BigDecimal  AmountAfterTax (PurchaseOrder purchaseOrderId);
    BigDecimal  AmountAfterTax1 (UUID purchaseOrderId);

    // BigDecimal quantity(Item item) ;*/

}