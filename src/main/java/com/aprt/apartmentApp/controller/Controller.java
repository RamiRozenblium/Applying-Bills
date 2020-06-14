package com.aprt.apartmentApp.controller;

import com.aprt.apartmentApp.model.Bill;
import com.aprt.apartmentApp.model.ElectricBill;
import com.aprt.apartmentApp.model.GazBill;
import com.aprt.apartmentApp.model.WaterBill;
import com.aprt.apartmentApp.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("bills")
public class Controller {

    @Autowired
    Service service;

    //TODO: Better use @PathVariable
    //https://www.baeldung.com/spring-controllers
    //https://www.baeldung.com/spring-boot-start

    @GetMapping("/getGazBill")
    public GazBill getGazBill(@RequestParam long id) {
        return service.getGazBillById(id);
    }

    //TODO: Better use @PathVariable
    //https://www.baeldung.com/spring-controllers
    //https://www.baeldung.com/spring-boot-start
    @GetMapping("/getWaterBill")
    public WaterBill getWaterBill(@RequestParam long id) {
        return service.getWaterBillById(id);
    }

    //TODO: Better use @PathVariable
    //https://www.baeldung.com/spring-controllers
    //https://www.baeldung.com/spring-boot-start
    //TODO check name: mistake
    @GetMapping("/getEectricBill")
    public ElectricBill getEectricBill(@RequestParam long id ) {
        return service.getElectricBillById(id);
    }

    //TODO: Better use @PathVariable and @RequestBody
    //https://www.baeldung.com/spring-controllers
    //https://www.baeldung.com/spring-boot-start
    // TODO better return object Bill
    @PostMapping("/addBill")
    public HttpStatus addBill(@RequestParam String typeBill, @RequestParam int amount) {
        service.addBill(typeBill, amount);
        return HttpStatus.CREATED;
    }

    @GetMapping("/getAllBills")
    public List<Bill> getAllBills() {
        return service.getAllBills();
    }

    //TODO: Better use @PathVariable and @RequestBody
    //https://www.baeldung.com/spring-controllers
    //https://www.baeldung.com/spring-boot-start
    // TODO better return object Bill
    @DeleteMapping("/deleteBill")
    public HttpStatus deleteBillById(@RequestParam long id) {
        service.deleteBillById(id);
        return HttpStatus.OK;
    }

    //TODO updateBill()

}
