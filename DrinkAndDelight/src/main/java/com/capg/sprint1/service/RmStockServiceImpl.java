package com.capg.sprint1.service;

import com.capg.sprint1.dao.RmStockDaoImpl;

public class RmStockServiceImpl implements RmStockService {

	@Override
	public String displayProcessDate(String orderIdOfRm, String processDateOfRm) {
		RmStockDaoImpl rmStockDaoImplobj=new RmStockDaoImpl();
		return  rmStockDaoImplobj.displayProcessDate(orderIdOfRm,processDateOfRm);
	}

	@Override
	public String displayChanges(String ProductOrderId) {
		RmStockDaoImpl rmStockDaoImplobj=new RmStockDaoImpl();
		return rmStockDaoImplobj.displayChanges(ProductOrderId);
	}




}
