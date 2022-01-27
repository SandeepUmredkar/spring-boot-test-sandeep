package com.test.purchaseorder.service;

import com.test.purchaseorder.dao.PurchaseOrderRepository;
import com.test.purchaseorder.domain.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrderRepository.findAll();
    }

    public PurchaseOrder getPurchaseOrder(Integer purchaseOrderId) {
        return purchaseOrderRepository.getById(purchaseOrderId);
    }
}
