package com.company.stock.core;

import com.company.stock.entity.Customer;
import com.company.stock.entity.PurchaseOrder;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.UUID;





    /**
     * Managed bean of the middle tier providing calculation of customer discounts.
     */
    @Component("stock_AmountCalculator")
    public class AmountCalculator {

        @Inject
        private Persistence persistence;

        /**
         * Calculates discount for a given customer. Expects that an active transaction exists at the moment.
         *
         * @param customerId customer id
         * @return discount value
         */
        public BigDecimal calculateAmount(UUID customerId) {
            // Calculate the total amount on the database level - the fastest possible way
            Query query = persistence.getEntityManager().createQuery(
                    "select sum(e.price) from stock$Item e where e.customer.id = :custId");
            query.setParameter("custId", customerId);
            BigDecimal sum = (BigDecimal) query.getSingleResult();

            return sum;

        }

        public BigDecimal AmountAfterTax(PurchaseOrder purchaseOrderId) {
            BigDecimal taxAmount= purchaseOrderId.getTax();
            BigDecimal sum= purchaseOrderId.getCustomer().getTotalAmount();

              BigDecimal percentage = new BigDecimal(100);

             BigDecimal  finalAmount = sum.multiply(taxAmount).divide(percentage);

               return finalAmount;

}    }




