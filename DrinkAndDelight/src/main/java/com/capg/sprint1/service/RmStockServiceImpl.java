package com.capg.sprint1.service;

import com.capg.sprint1.dao.RmStockDaoImpl;

public class RmStockServiceImpl implements RmStockService {

	@Override
	public String displayProcessDate(String orderIdOfRm, String processDateOfRm) {
		RmStockDaoImpl RmStockDaoImplobj=new RmStockDaoImpl();
		return  RmStockDaoImplobj.displayProcessDate(orderIdOfRm,processDateOfRm);
	}

}
