package com.aprt.apartmentApp.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "typeBill")
    private String typeBill;

    @Column(name = "Amount")
    private int amount;

    public Bill() {
    }

    public Bill(String typeBill, int amount) {
        this.typeBill = typeBill;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeBill() {
        return typeBill;
    }

    public void setTypeBill(String typeBill) {
        this.typeBill = typeBill;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
