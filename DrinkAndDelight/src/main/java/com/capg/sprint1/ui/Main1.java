package com.capg.sprint1.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.capg.sprint1.service.ProductStockServiceImpl;
import com.capg.sprint1.service.RmStockServiceImpl;


public class Main1 {

	public static void main(String[] args) throws ParseException {
		ProductStockServiceImpl productStockServiceImplObj = new ProductStockServiceImpl();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Supplier Id");
		String orderIdOfProduct=in.nextLine();
		System.out.println("Enter Exit date");
		String exitDateOfProduct=in.nextLine();
		
		productStockServiceImplObj.displayproductStockImpl(orderIdOfProduct, exitDateOfProduct);
	}

	
	
}




