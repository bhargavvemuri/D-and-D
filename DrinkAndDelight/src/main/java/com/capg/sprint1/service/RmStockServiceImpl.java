package com.capg.sprint1.service;

import java.util.Date;
import java.text.SimpleDateFormat;
import com.capg.sprint1.dao.RmStockDaoImpl;

public class RmStockServiceImpl implements RmStockService {

	@Override
	public Date displayProcessDate(String orderIdOfRm,Date processDateOfRm) {
		RmStockDaoImpl rmStockDaoImplobj=new RmStockDaoImpl();
		return  rmStockDaoImplobj.displayProcessDate(orderIdOfRm,processDateOfRm);
	}

	@Override
	public Date displayChanges1(String orderIdOfRm, Date ManufactureDate, Date expirydate, String qa) {
		RmStockDaoImpl rmStockDaoImplobj=new RmStockDaoImpl();
		return  rmStockDaoImplobj.displayChanges1(orderIdOfRm,ManufactureDate,expirydate,qa);
	}

	
}
