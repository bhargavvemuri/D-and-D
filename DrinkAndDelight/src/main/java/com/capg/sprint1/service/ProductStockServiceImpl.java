package com.capg.sprint1.service;

import com.capg.sprint1.dao.ProductStockDaoImpl;

public class ProductStockServiceImpl implements ProductStockService {

	@Override
	public String displayproductStockImpl(String OrderIdOfProduct, String exitDateOfProduct) {
		ProductStockDaoImpl productStockDaoImplObj = new ProductStockDaoImpl();
		return productStockDaoImplObj.displayproductStockImpl(OrderIdOfProduct,exitDateOfProduct);
		
	}
	
}
