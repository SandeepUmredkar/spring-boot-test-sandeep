package com.test.purchaseorder.controller;

import com.test.purchaseorder.domain.PurchaseOrder;
import com.test.purchaseorder.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PurchaseOrderController {

    @Autowired
    PurchaseOrderService purchaseOrderService;

    @GetMapping
    public List<PurchaseOrder> getPurchaseOrders(){
        return purchaseOrderService.getPurchaseOrders();
    }

    @GetMapping
    public PurchaseOrder getPurchaseOrder(Integer purchaseOrderId){
        return purchaseOrderService.getPurchaseOrder(purchaseOrderId);
    }

}
