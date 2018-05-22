package com.company.stock.web.ext4.purchaseorder;

import com.company.stock.entity.PurchaseOrder;
import com.company.stock.service.PurchaseOrderService;
import com.haulmont.cuba.gui.components.AbstractLookup;

import javax.inject.Inject;

public class PurchaseBrowseCustomers extends AbstractLookup {
 /*@Inject
   private PurchaseOrderService orderService;
     @Override
   protected boolean preCommit() {
       PurchaseOrder order = getItem();
       order.setTax(orderService.AmountAfterTax(order));
       return super.preCommit();
   }*/
}