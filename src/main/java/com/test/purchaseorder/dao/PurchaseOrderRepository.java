package com.test.purchaseorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.purchaseorder.domain.PurchaseOrder;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {
    List<PurchaseOrder> findByPoCreateDateBetween(Timestamp start, Timestamp end);
}
