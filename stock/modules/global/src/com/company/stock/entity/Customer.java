package com.company.stock.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import java.math.BigDecimal;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "STOCK_CUSTOMER")
@Entity(name = "stock$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -3656376074281998647L;

    @Column(name = "NAME")
    protected String name;






    @Column(name = "TOTAL_AMOUNT")
    protected BigDecimal totalAmount;

    @Column(name = "AMOUNT_AFTER_TAX")
    protected BigDecimal amountAfterTax;

    public void setAmountAfterTax(BigDecimal amountAfterTax) {
        this.amountAfterTax = amountAfterTax;
    }

    public BigDecimal getAmountAfterTax() {
        return amountAfterTax;
    }


    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}