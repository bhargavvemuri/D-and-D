package com.capg.sprint1.ui;

import java.util.Scanner;

import com.capg.sprint1.service.ProductStockServiceImpl;
import com.capg.sprint1.service.RmStockServiceImpl;


public class Main {

	public static void main(String[] args) {
		RmStockServiceImpl RmStockServiceImplObj = new RmStockServiceImpl();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter RM Id");
		String orderIdOfRm=in.nextLine();
		System.out.println("Enter Process date");
		String processDateOfRM=in.nextLine();
		
		RmStockServiceImplObj.displayProcessDate(orderIdOfRm, processDateOfRM);
	}

}
