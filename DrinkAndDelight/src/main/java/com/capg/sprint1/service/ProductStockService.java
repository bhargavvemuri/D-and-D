package com.capg.sprint1.service;

import com.capg.sprint1.exceptions.InvalidProductId;

import java.util.Date;

public interface ProductStockService {
	public String displayproductStockImpl(String OrderIdOfProduct,String exitDateOfProduct) throws InvalidProductId;
	public Date displayChanges1(String orderIdOfProduct, Date ManufactureDate,Date expirydate,String qa) throws InvalidProductId;;
}
