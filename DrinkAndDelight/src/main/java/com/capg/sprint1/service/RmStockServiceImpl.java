package com.capg.sprint1.service;

import java.util.Date;
import java.text.SimpleDateFormat;
import com.capg.sprint1.dao.RmStockDaoImpl;
import com.capg.sprint1.exceptions.InvalidRMId;

public class RmStockServiceImpl implements RmStockService {

	@Override
	public Date displayProcessDate(String orderIdOfRm,Date processDateOfRm) throws InvalidRMId {
		RmStockDaoImpl rmStockDaoImplobj=new RmStockDaoImpl();
		if(rmStockDaoImplobj.displayProcessDate(orderIdOfRm,processDateOfRm) == null)
			throw new InvalidRMId();
		return  rmStockDaoImplobj.displayProcessDate(orderIdOfRm,processDateOfRm);
	}

	@Override
	public Date displayChanges1(String orderIdOfRm, Date ManufactureDate, Date expirydate, String qa) throws InvalidRMId {
		RmStockDaoImpl rmStockDaoImplobj=new RmStockDaoImpl();
		if(rmStockDaoImplobj.displayChanges1(orderIdOfRm,ManufactureDate,expirydate,qa) == null)
			throw new InvalidRMId();
		return  rmStockDaoImplobj.displayChanges1(orderIdOfRm,ManufactureDate,expirydate,qa);
	}

	
}
