package com.capg.sprint1.ui;

import java.util.Scanner;
import com.capg.sprint1.service.ProductStockServiceImpl;
import com.capg.sprint1.service.RmStockServiceImpl;

import java.text.ParseException;



public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Enter the choice \n 1:Update Raw Material Process date \n 2:Set Manufacturing Date,Expiry Date and QA Status");
		
		int choice=in.nextInt();;
		
		switch(choice) {
		case 1:
		{
			RmStockServiceImpl rmStockServiceImplObj = new RmStockServiceImpl();
			System.out.println("Enter RM Id");
			String orderIdOfRm=in.nextLine();
			System.out.println("Enter Process date");
			String processDateOfRM=in.next();
			rmStockServiceImplObj.displayProcessDate(orderIdOfRm, processDateOfRM);
			break;
		}
		
		case 2:
		{
			RmStockServiceImpl rmStockServiceImplObj = new RmStockServiceImpl();
			System.out.println("Enter ProductOrder Id");
			String ProductOrderId=in.next();
			rmStockServiceImplObj.displayChanges(ProductOrderId);
			
       break;
       }		
		
		
		
}
}
}
