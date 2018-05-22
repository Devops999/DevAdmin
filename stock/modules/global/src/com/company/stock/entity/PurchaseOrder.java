package com.company.stock.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|id")
@Listeners("stock_ItemEntityListener")
@Table(name = "STOCK_PURCHASE_ORDER")
@Entity(name = "stock$PurchaseOrder")
public class PurchaseOrder extends StandardEntity {
    private static final long serialVersionUID = -5589075728437557538L;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_TRANSACTION")
    protected Date dateOfTransaction;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEMS_ID")
    protected Item items;

    @Column(name = "TAX")
    protected BigDecimal tax;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }


    public void setDateOfTransaction(Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    public Item getItems() {
        return items;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTax() {
        return tax;
    }


}