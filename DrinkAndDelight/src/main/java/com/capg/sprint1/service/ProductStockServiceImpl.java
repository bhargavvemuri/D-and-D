package com.capg.sprint1.service;

import java.util.Date;

import com.capg.sprint1.dao.ProductStockDaoImpl;
import com.capg.sprint1.dao.RmStockDaoImpl;
import com.capg.sprint1.exceptions.InvalidProductId;

public class ProductStockServiceImpl implements ProductStockService {

	@Override
	public String displayproductStockImpl(String OrderIdOfProduct, String exitDateOfProduct) throws InvalidProductId {
		ProductStockDaoImpl productStockDaoImplObj = new ProductStockDaoImpl();
		if(productStockDaoImplObj.displayproductStockImpl(OrderIdOfProduct,exitDateOfProduct) == null)
			throw new InvalidProductId();
		return productStockDaoImplObj.displayproductStockImpl(OrderIdOfProduct,exitDateOfProduct);
		
	}

	@Override
	public Date displayChanges1(String orderIdOfProduct, Date ManufactureDate, Date expirydate, String qa) throws InvalidProductId {
		ProductStockDaoImpl productStockDaoImplObj = new ProductStockDaoImpl();
		if(productStockDaoImplObj.displayChanges1(orderIdOfProduct,ManufactureDate,expirydate,qa) == null)
			throw new InvalidProductId();
		return productStockDaoImplObj.displayChanges1(orderIdOfProduct,ManufactureDate,expirydate,qa);
	}
	
}
