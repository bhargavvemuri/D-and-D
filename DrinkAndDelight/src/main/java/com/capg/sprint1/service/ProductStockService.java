package com.capg.sprint1.service;

import java.util.Date;

public interface ProductStockService {
	public String displayproductStockImpl(String OrderIdOfProduct,String exitDateOfProduct);
	public Date displayChanges1(String orderIdOfProduct, Date ManufactureDate,Date expirydate,String qa);
}
