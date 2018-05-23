package com.company.stock.listener;

import com.company.stock.core.AmountCalculator;
import com.company.stock.entity.Customer;
import com.company.stock.service.PurchaseOrderService;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeDeleteEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.company.stock.entity.Item;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.haulmont.cuba.core.listener.AfterInsertEntityListener;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.UUID;

import com.haulmont.cuba.core.listener.AfterUpdateEntityListener;
import com.haulmont.cuba.core.listener.BeforeAttachEntityListener;

import javax.inject.Inject;
import com.company.stock.entity.PurchaseOrder;

@Component("stock_ItemEntityListener")
public class ItemEntityListener implements BeforeDeleteEntityListener<PurchaseOrder>, BeforeInsertEntityListener<PurchaseOrder>, BeforeUpdateEntityListener<PurchaseOrder> {

    @Inject
    private AmountCalculator amountCalculator;

    @Inject
    private PurchaseOrderService purchaseOrderService;
    @Inject
    private AmountCalculator tax1;



    @Override
    public void onBeforeDelete(PurchaseOrder entity, EntityManager entityManager) {
    

  calculateAmount(entity.getCustomer(), entityManager);
        AmountAfterTax(entity.getCustomer(), entityManager);


    }


    @Override
    public void onBeforeInsert(PurchaseOrder entity, EntityManager entityManager) {
    

  calculateAmount(entity.getCustomer(), entityManager);
        AmountAfterTax(entity.getCustomer(), entityManager);


    }


    @Override
    public void onBeforeUpdate(PurchaseOrder entity, EntityManager entityManager) {
    

  calculateAmount(entity.getCustomer(), entityManager);
        AmountAfterTax(entity.getCustomer(), entityManager);

    }
   // }
     private void calculateAmount(Customer customer, EntityManager entityManager) {
        if (customer == null)
            return;
        BigDecimal amount = amountCalculator.calculateAmount(customer.getId());
        Customer managedCustomer = entityManager.merge(customer);
        managedCustomer.setTotalAmount(amount);
}
    private void  AmountAfterTax(Customer customer, EntityManager entityManager) {
        if (customer == null)
            return;
     //   BigDecimal tax = tax1.AmountAfterTax(customer.getAmountAfterTax());
     //   customer.setAmountAfterTax(tax);

}
   // private void  AmountAfterTax1(PurchaseOrder purchaseOrder, EntityManager entityManager) {
   // }

}