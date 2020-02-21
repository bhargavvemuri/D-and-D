package com.capg.sprint1.service;

import java.util.Date;

public interface RmStockService {
public Date displayProcessDate(String orderIdOfRm,Date processDateOfRm);
public Date displayChanges1(String orderIdOfRm, Date ManufactureDate,Date expirydate,String qa);

}
