package com.capg.sprint1.ui;

import java.util.Date;
import java.util.Scanner;
import com.capg.sprint1.service.ProductStockServiceImpl;
import com.capg.sprint1.service.RmStockServiceImpl;
import java.text.SimpleDateFormat;

import java.text.ParseException;
public class Main 
{

	public static void main(String[] args) throws ParseException 
	{
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("\\\\\\\\******WELCOME TO DRINK AND DELIGHT******////////\n");
			System.out.println("!!...Choose an Option...!! \n1.Raw Material \n2.Product Material");	
			int a=in.nextInt();
		
		switch(a)	
		{
		case 1:
		{
			System.out.println("Enter the choice \n 1:Update Raw Material Process date \n 2:Set Manufacturing Date,Expiry Date and QA Status");
			
			int choice=in.nextInt();
			
			switch(choice) {
			case 1:
			{
				RmStockServiceImpl rmStockServiceImplObj = new RmStockServiceImpl();
				System.out.println("Enter RM Id");
				String orderIdOfRm=in.next();
				System.out.println("Enter Process date : Example:- 05/05/2020");
				String date=in.next()+in.nextLine();
				SimpleDateFormat smf= new SimpleDateFormat("dd/MM/yyyy");
				Date processDateOfRm=smf.parse(date);
				rmStockServiceImplObj.displayProcessDate(orderIdOfRm,processDateOfRm);
				break;
			}
			
			case 2:
			{
				RmStockServiceImpl rmStockServiceImplObj = new RmStockServiceImpl();
				System.out.println("Enter RM Order Id");
				String orderIdOfRm=in.next();
				
				System.out.println("Enter Manufacturing Date : Example:- 05/05/2020");
				String date=in.next()+in.nextLine();
				SimpleDateFormat smf= new SimpleDateFormat("dd/MM/yyyy");
				Date ManufactureDate=smf.parse(date);
				System.out.println("Enter Expiry Date : Example:- 05/05/2020");
				String date1=in.next()+in.nextLine();
				SimpleDateFormat smf1= new SimpleDateFormat("dd/MM/yyyy");
				Date expirydate=smf1.parse(date1);
				System.out.println("Enter Quality Analysis Check Status ...? Completed / Incomplete");
				String qa= in.next();
				rmStockServiceImplObj.displayChanges1(orderIdOfRm,ManufactureDate,expirydate,qa);
				
				
	       break;
	       }		
			
			
		}
		}
		break;
		
		case 2:
		{
			System.out.println("Enter the choice \n 1:Update Product Stock Exit date \n 2:Set Manufacturing Date,Expiry Date and QA Status");
			
			int choice=in.nextInt();
			
			switch(choice) {
			case 1:
			{
			
			ProductStockServiceImpl productStockServiceImplObj = new ProductStockServiceImpl();
			

			System.out.println("Enter Supplier Id");
			String orderIdOfProduct=in.next();
			System.out.println("Enter Exit date");
			String exitDateOfProduct=in.next();
			
			productStockServiceImplObj.displayproductStockImpl(orderIdOfProduct, exitDateOfProduct);
			break;
			}
			case 2:
			{
				RmStockServiceImpl rmStockServiceImplObj = new RmStockServiceImpl();
				System.out.println("Enter Product Order Id");
				String orderIdOfProduct=in.next();
				
				System.out.println("Enter Manufacturing Date : Example:- 05/05/2020");
				String date=in.next()+in.nextLine();
				SimpleDateFormat smf= new SimpleDateFormat("dd/MM/yyyy");
				Date ManufactureDate=smf.parse(date);
				System.out.println("Enter Expiry Date : Example:- 05/05/2020");
				String date1=in.next()+in.nextLine();
				SimpleDateFormat smf1= new SimpleDateFormat("dd/MM/yyyy");
				Date expirydate=smf1.parse(date1);
				System.out.println("Enter Quality Analysis Check Status ...? Completed / Incomplete");
				String qa= in.next();
				rmStockServiceImplObj.displayChanges1(orderIdOfProduct,ManufactureDate,expirydate,qa);
				 break;
             }
}
}

		}
	}
}
