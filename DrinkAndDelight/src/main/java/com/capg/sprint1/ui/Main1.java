package com.capg.sprint1.ui;

import java.util.Scanner;

import com.capg.sprint1.service.SupplierDetailsServiceImpl;

public class Main1 {

	public static void main(String[] args) {
		SupplierDetailsServiceImpl supplierDetailsServiceImplObj = new SupplierDetailsServiceImpl();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Supplier Id");
		String OrderIdOfProduct=in.nextLine();
		System.out.println("Enter Exit date");
		String ExitDateOfProduct=in.nextLine();
		
		supplierDetailsServiceImplObj.displaySupplierDetails(supplierId);
	}

}
