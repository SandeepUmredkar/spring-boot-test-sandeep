package com.test.purchaseorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.purchaseorder.domain.PurchaseOrder;

import java.sql.Timestamp;
import java.util.List;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {
    List<PurchaseOrder> findByPoCreateDateBetween(Timestamp start, Timestamp end);

}
