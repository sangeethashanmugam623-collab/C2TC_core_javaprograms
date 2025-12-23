package com.tnsif.packageandaccessmodifiers;

public class TestAccess {

	public static void main(String[] args) {
		
		
		
           AccessmodifiersDemo amd = new AccessmodifiersDemo();
		
		System.out.println("Public Variable: "+amd.publicVar);
		System.out.println("Protected Variable: "+amd.protectedvar);
		//System.out.println("Private Variable: "+amd.privateVar);
		System.out.println("Default Variable: "+amd.defaultvar);


	}

}
