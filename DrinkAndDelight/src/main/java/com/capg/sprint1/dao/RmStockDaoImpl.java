package com.capg.sprint1.dao;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.capg.sprint1.model.ProductStock;
import com.capg.sprint1.model.RawMaterialStock;

public class RmStockDaoImpl implements RmStockDao{

	@Override
	public Date displayProcessDate(String orderIdOfRm, Date processDateOfRm) {
		
		Map<String,RawMaterialStock> list=new HashMap<>();
		RawMaterialStock order3=new RawMaterialStock("54624","Tea Powder",105.3,102.4,11.00,1019.1,"644141",new Date(), new Date(2020, 1, 15),new Date(2020, 1, 15),"Incomplete",new Date(2020, 1, 15));
		RawMaterialStock order4=new RawMaterialStock("54544","Rock Salt",1035.3,1202.4,121.00,119.1,"645441",new Date(), new Date(2020, 1, 15), new Date(2020, 1, 15),"Incomplete",new Date(2020, 1, 15));

		list.put(order3.getOrderId(), order3);
		list.put(order4.getOrderId(), order4);
		RawMaterialStock ps= list.get(orderIdOfRm);
		ps.setProcessDate(processDateOfRm);

		System.out.println(ps);
		
		return null;
	}

	@Override
	public Date displayChanges1(String orderIdOfRm, Date ManufactureDate, Date expirydate, String qa) {
		Map<String,RawMaterialStock> list=new HashMap<>();
		RawMaterialStock order3=new RawMaterialStock("54624","Tea Powder",105.3,102.4,11.00,1019.1,"644141",new Date(), new Date(2020, 1, 15),new Date(2020, 1, 15),"Incomplete",new Date(2020, 1, 15));
		RawMaterialStock order4=new RawMaterialStock("54544","Rock Salt",1035.3,1202.4,121.00,119.1,"645441",new Date(), new Date(2020, 1, 15), new Date(2020, 1, 15),"Incomplete",new Date(2020, 1, 15));

		list.put(order3.getOrderId(), order3);
		list.put(order4.getOrderId(), order4);
		RawMaterialStock ps= list.get(orderIdOfRm);
		ps.setManufactureDate(ManufactureDate);
		ps.setExpirydate(expirydate);
		ps.setQualityCheck(qa);

		System.out.println(ps);
		return null;
	}

	}