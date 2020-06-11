package com.aprt.apartmentApp.repository;

import com.aprt.apartmentApp.model.GazBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GazBillRepository extends JpaRepository<GazBill, Long> {
}
