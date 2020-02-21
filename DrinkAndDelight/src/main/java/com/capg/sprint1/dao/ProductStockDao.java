package com.capg.sprint1.dao;

import java.util.Date;

public interface ProductStockDao {
	public String displayproductStockImpl(String OrderIdOfProduct,String exitDateOfProduct);
	public Date displayChanges1(String orderIdOfProduct, Date ManufactureDate,Date expirydate,String qa);
}
