package com.aprt.apartmentApp.repository;

import com.aprt.apartmentApp.model.ElectricBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricBillRepository extends JpaRepository<ElectricBill, Long> {
}
