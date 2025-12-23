package com.tnsif.userinputs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your reg.no: ");
		long reg = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter your Department: ");
		String dept = sc.nextLine();
		
		System.out.println("The register  number is: " + reg);
		
		System.out.println("The Dept is: " + dept);
		 sc.close();

	}

}
