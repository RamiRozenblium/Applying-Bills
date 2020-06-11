package com.aprt.apartmentApp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "GazBill")
public class GazBill extends Bill {
    public GazBill() {
        super();
        setTypeBill("GazBill");
    }
}
