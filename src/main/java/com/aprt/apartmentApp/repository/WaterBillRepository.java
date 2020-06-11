package com.aprt.apartmentApp.repository;

import com.aprt.apartmentApp.model.WaterBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaterBillRepository extends JpaRepository<WaterBill, Long> {
}
