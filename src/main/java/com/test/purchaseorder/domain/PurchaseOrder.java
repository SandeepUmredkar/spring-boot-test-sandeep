package com.test.purchaseorder.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class PurchaseOrder {

	@Id
	private Integer purchaseOrderId;
	private String status;
	private Timestamp poCreateDate;
	private Timestamp poUpdateDate;


	// Reference to the client - please complete


	//product line items
	@OneToMany
	private ProductItem productItem;


}
