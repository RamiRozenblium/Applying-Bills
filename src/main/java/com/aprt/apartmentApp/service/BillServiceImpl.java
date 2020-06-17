package com.aprt.apartmentApp.service;

import com.aprt.apartmentApp.exception.NoSuchBillException;
import com.aprt.apartmentApp.exception.WrongTypeBillException;
import com.aprt.apartmentApp.model.*;
import com.aprt.apartmentApp.repository.ElectricBillRepository;
import com.aprt.apartmentApp.repository.GazBillRepository;
import com.aprt.apartmentApp.repository.WaterBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    GazBillRepository gazBillRepository;

    @Autowired
    ElectricBillRepository electricBillRepository;

    @Autowired
    WaterBillRepository waterBillRepository;

    @Autowired
    GazBill gazBill;

    @Autowired
    ElectricBill electricBill;

    @Autowired
    WaterBill waterBill;

    @Autowired
    Bill bill;

    @Override
    public GazBill getGazBillById(long id) {
        return gazBillRepository.findById(id).orElseThrow(NoSuchBillException::new);
    }

    @Override
    public ElectricBill getElectricBillById(long id) {
        return electricBillRepository.findById(id).orElseThrow(NoSuchBillException::new);
    }

    @Override
    public WaterBill getWaterBillById(long id) {
        return waterBillRepository.findById(id).orElseThrow(NoSuchBillException::new);
    }

    @Override
    public Bill addBill(String typeBill, int amount) {
        Bill bill = checkingTypeBill(typeBill, amount);
        if (bill instanceof GazBill) {
            gazBillRepository.save(gazBill);
            return (GazBill) bill;
        } else if (bill instanceof ElectricBill) {
            electricBillRepository.save(electricBill);
            return (ElectricBill) bill;
        } else if (bill instanceof WaterBill) {
            waterBillRepository.save(waterBill);
            return (WaterBill) bill;
        }
        return bill;
    }

    @Override
    public List<Bill> getAllBills() {
        ArrayList<Bill> list = new ArrayList<>();
        list.addAll(gazBillRepository.findAll());
        list.addAll(electricBillRepository.findAll());
        list.addAll(waterBillRepository.findAll());
        return list;
    }

    @Override
    public Bill deleteBillById(long id) {
        if (gazBillRepository.findById(id).isPresent()) {
            gazBill = gazBillRepository.findById(id).get();
            gazBillRepository.deleteById(id);
            return gazBill;
        } else if (electricBillRepository.findById(id).isPresent()) {
            electricBill = electricBillRepository.findById(id).get();
            electricBillRepository.deleteById(id);
            return electricBill;
        } else if (waterBillRepository.findById(id).isPresent()) {
            waterBill = waterBillRepository.findById(id).get();
            waterBillRepository.deleteById(id);
            return waterBill;
        } else throw new NoSuchBillException();

    }

    @Override
    public Bill updateBill(long id, UpdateBillDto updateBillDto) {

        if (gazBillRepository.findById(id).isPresent()) {
            gazBill = gazBillRepository.findById(id).get();
            //TODO
            return gazBill;
        } else if (electricBillRepository.findById(id).isPresent()) {
            electricBill = electricBillRepository.findById(id).get();
            //TODO
            return electricBill;
        } else if (waterBillRepository.findById(id).isPresent()) {
            waterBill = waterBillRepository.findById(id).get();
            //TODO
            return waterBill;
        } else throw new NoSuchBillException();

    }

    public Bill checkingTypeBill(String typeBill, int amount) {
        if (typeBill.equals(gazBill.getTypeBill())) {
            gazBill.setAmount(amount);
            bill = gazBill;
            return bill;
        } else if (typeBill.equals(electricBill.getTypeBill())) {
            electricBill.setAmount(amount);
            bill = electricBill;
            return bill;
        } else if (typeBill.equals(waterBill.getTypeBill())) {
            waterBill.setAmount(amount);
            bill = waterBill;
            return bill;
        } else throw new WrongTypeBillException();

    }
}
