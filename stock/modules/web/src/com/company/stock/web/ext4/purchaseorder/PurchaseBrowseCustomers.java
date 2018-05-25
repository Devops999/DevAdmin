package com.company.stock.web.ext4.purchaseorder;

import com.company.stock.entity.PurchaseOrder;
import com.company.stock.service.PurchaseOrderService;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.reports.gui.actions.TablePrintFormAction;

import javax.inject.Inject;
import java.util.Map;

public class PurchaseBrowseCustomers extends AbstractLookup {
    @Inject
    private Button printDetails;
    @Inject
    private GroupTable<PurchaseOrder> purchaseOrdersTable;

    /*@Inject
       private PurchaseOrderService orderService;
         @Override
       protected boolean preCommit() {
           PurchaseOrder order = getItem();
           order.setTax(orderService.AmountAfterTax(order));
           return super.preCommit();
       }*/
 @Override
 public void init(Map<String, Object> params) {
     TablePrintFormAction action = new TablePrintFormAction("report", purchaseOrdersTable);
     purchaseOrdersTable.addAction(action);
     printDetails.setAction(action);
 }
}