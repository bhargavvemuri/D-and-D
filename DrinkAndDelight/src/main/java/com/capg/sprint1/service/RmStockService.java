package com.capg.sprint1.service;

import com.capg.sprint1.exceptions.InvalidRMId;

import java.util.Date;

public interface RmStockService {
public Date displayProcessDate(String orderIdOfRm,Date processDateOfRm) throws InvalidRMId;
public Date displayChanges1(String orderIdOfRm, Date ManufactureDate,Date expirydate,String qa) throws InvalidRMId;

}
