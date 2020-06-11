package com.aprt.apartmentApp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ElectricBill")
public class ElectricBill extends Bill {

    public ElectricBill() {
        super();
        setTypeBill("ElectricBill");
    }
}
