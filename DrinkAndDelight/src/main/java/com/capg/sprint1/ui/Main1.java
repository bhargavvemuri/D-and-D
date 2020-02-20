package com.capg.sprint1.ui;

import java.util.Scanner;

import com.capg.sprint1.service.ProductStockServiceImpl;


public class Main1 {

	public static void main(String[] args) {
		ProductStockServiceImpl productStockServiceImplObj = new ProductStockServiceImpl();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Supplier Id");
		String orderIdOfProduct=in.nextLine();
		System.out.println("Enter Exit date");
		String exitDateOfProduct=in.nextLine();
		
		productStockServiceImplObj.displayproductStockImpl(orderIdOfProduct, exitDateOfProduct);
	}

}
