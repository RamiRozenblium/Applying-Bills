package com.aprt.apartmentApp.service;

import com.aprt.apartmentApp.model.Bill;
import com.aprt.apartmentApp.model.ElectricBill;
import com.aprt.apartmentApp.model.GazBill;
import com.aprt.apartmentApp.model.WaterBill;

import java.util.List;

public interface Service {

    GazBill getGazBillById(long id);

    ElectricBill getElectricBillById(long id);

    WaterBill getWaterBillById(long id);

    Bill addBill(String typeBill, int amount);

    List<Bill> getAllBills();

    Bill deleteBillById(long id);

}
