package com.capg.sprint1.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.capg.sprint1.model.ProductStock;
import com.capg.sprint1.model.RawMaterialStock;

public class ProductStockDaoImpl implements ProductStockDao {


	@Override
	public String displayproductStockImpl(String OrderIdOfProduct, String exitDateOfProduct) {

		Map<String,ProductStock> list=new HashMap<>();
		ProductStock order3=new ProductStock("54624","Tea",105.3,102.4,11.00,1019.1,"644141",new Date(), new Date(2020, 0, 15), new Date(2020, 1, 15),"Fine", new Date(2020, 0, 20),"02/02/2020");
		ProductStock order4=new ProductStock("54544","Salt",1035.3,1202.4,121.00,119.1,"645441",new Date(), new Date(2020, 0, 16), new Date(2020, 1, 16),"Fine", new Date(2020, 0, 20),"02/02/2020");

		list.put(order3.getOrderId(), order3);
		list.put(order4.getOrderId(), order4);
		ProductStock ps= list.get(OrderIdOfProduct);
		ps.setexitDate(exitDateOfProduct);

		System.out.println(ps);
		
		return null;
	}

	@Override

		public Date displayChanges1(String orderIdOfProduct, Date ManufactureDate, Date expirydate, String qa) {
		Map<String,ProductStock> list=new HashMap<>();
		ProductStock order3=new ProductStock("54624","Tea",105.3,102.4,11.00,1019.1,"644141",new Date(), new Date(2020, 0, 15), new Date(2020, 1, 15),"Fine", new Date(2020, 0, 20),"02/02/2020");
		ProductStock order4=new ProductStock("54544","Salt",1035.3,1202.4,121.00,119.1,"645441",new Date(), new Date(2020, 0, 16), new Date(2020, 1, 16),"Fine", new Date(2020, 0, 20),"02/02/2020");

		list.put(order3.getOrderId(), order3);
		list.put(order4.getOrderId(), order4);
		ProductStock ps= list.get(orderIdOfProduct);

			ps.setManufactureDate(ManufactureDate);
			ps.setExpirydate(expirydate);
			ps.setQualityCheck(qa);

			System.out.println(ps);
			return null;
		}

	
	
		}

	


