package com.capg.sprint1.model;

import java.util.Date;

public class RawMaterialStock {
	
	String orderId;
	String name;
	double pricePerUnit;
	double quantityValue;
	double quantityUnit;
	double price;
	String warehouseId;
	Date deliveryDate;
	String manufactureDate;
	String expirydate;
	String qualityCheck;
	String processDate;
	String qa;
	
	
	public RawMaterialStock() {
		super();
	}

	public RawMaterialStock(String orderId, String name, double pricePerUnit, double quantityValue, double quantityUnit,
			double price, String warehouseId, Date deliveryDate, String manufactureDate, String expirydate,
			String qualityCheck, String processDate ,String qa) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.warehouseId = warehouseId;
		this.deliveryDate = deliveryDate;
		this.manufactureDate = manufactureDate;
		this.expirydate = expirydate;
		this.qualityCheck = qualityCheck;
		this.processDate = processDate;
		this.qa = qa;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public double getQuantityValue() {
		return quantityValue;
	}

	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}

	public double getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(double quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getQualityCheck() {
		return qualityCheck;
	}

	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}

	public String getProcessDate() {
		return processDate;
	}

	public void setProcessDate(String processDate) {
		this.processDate = processDate;
	}
	public String getQa() {
		return qa;
	}
	public void setQa(String Qa) {
		this.qa = Qa;
	}

	@Override
	public String toString() {
		return "RawMaterialStock [orderId=" + orderId + ", name=" + name + ", pricePerUnit=" + pricePerUnit
				+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", price=" + price
				+ ", warehouseId=" + warehouseId + ", deliveryDate=" + deliveryDate + ", manufactureDate="
				+ manufactureDate + ", expirydate=" + expirydate + ", qualityCheck=" + qualityCheck + ", processDate="
				+ processDate + ", qa=" + qa + "]";
	}

	

	
}
