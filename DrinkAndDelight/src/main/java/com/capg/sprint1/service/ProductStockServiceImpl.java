package com.capg.sprint1.service;

import java.util.Date;

import com.capg.sprint1.dao.ProductStockDaoImpl;
import com.capg.sprint1.dao.RmStockDaoImpl;

public class ProductStockServiceImpl implements ProductStockService {

	@Override
	public String displayproductStockImpl(String OrderIdOfProduct, String exitDateOfProduct) {
		ProductStockDaoImpl productStockDaoImplObj = new ProductStockDaoImpl();
		return productStockDaoImplObj.displayproductStockImpl(OrderIdOfProduct,exitDateOfProduct);
		
	}

	@Override
	public Date displayChanges1(String orderIdOfProduct, Date ManufactureDate, Date expirydate, String qa) {
		ProductStockDaoImpl productStockDaoImplObj = new ProductStockDaoImpl();
		return productStockDaoImplObj.displayChanges1(orderIdOfProduct,ManufactureDate,expirydate,qa);
	}
	
}
