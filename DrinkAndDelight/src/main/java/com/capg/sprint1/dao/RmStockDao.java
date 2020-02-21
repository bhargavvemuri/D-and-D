package com.capg.sprint1.dao;

import java.util.Date;

public interface RmStockDao {
	public Date displayProcessDate(String orderIdOfRm,Date processDateOfRm);
	public Date displayChanges1(String orderIdOfRm, Date ManufactureDate,Date expirydate,String qa);
	

}
