package com.aprt.apartmentApp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "WateBill")
public class WaterBill extends Bill {
    public WaterBill() {
        super();
        setTypeBill("WaterBill");
    }
}
