package com.company.stock.service;

import com.company.stock.core.AmountCalculator;
import com.company.stock.entity.PurchaseOrder;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.UUID;

@Service(PurchaseOrderService.NAME)
public class PurchaseOrderServiceBean implements PurchaseOrderService {
    @Inject
    private AmountCalculator amountCalculator;


    @Override
    public BigDecimal calculateAmount(UUID customerId) {
        return amountCalculator.calculateAmount(customerId);
    }


    @Override
    public BigDecimal AmountAfterTax(PurchaseOrder purchaseOrder) {
       // public BigDecimal AmountAfterTax(PurchaseOrder purchaseOrder) {
           /*BigDecimal taxAmount= purchaseOrder.getTax();
            BigDecimal sum= purchaseOrder.getCustomer().getTotalAmount();


            BigDecimal percentage = new BigDecimal(100);

            BigDecimal  finalAmount = sum.multiply(taxAmount).divide(percentage);
            return finalAmount;*/


        return amountCalculator. AmountAfterTax(purchaseOrder);
    }

    //@Override
   // public BigDecimal AmountAfterTax1(UUID purchaseOrderId) {
    //    return null;
        //amountCalculator. AmountAfterTax(purchaseOrderId);
    }

    // @Override
   // public BigDecimal quantity(Item item) {
      /*  //BigDecimal amount = new BigDecimal(0);
        Integer quantity = item.getQuantity();
        Integer v= 0;
        if ( quantity!= null) {
v =
        if(item.getName().equals())
        }
            for ( Quantity qt : item.getQuantity()) {
                amount = amount.add(part.getPrice());
        }
        return null;
    }*/
