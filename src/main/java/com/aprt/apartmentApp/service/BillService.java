package com.aprt.apartmentApp.service;

import com.aprt.apartmentApp.model.*;

import java.util.List;

public interface BillService {

    GazBill getGazBillById(long id);

    ElectricBill getElectricBillById(long id);

    WaterBill getWaterBillById(long id);

    Bill addBill(String typeBill, int amount);

    List<Bill> getAllBills();

    Bill deleteBillById(long id);

    Bill updateBill(long id, UpdateBillDto updateBillDto);
}
