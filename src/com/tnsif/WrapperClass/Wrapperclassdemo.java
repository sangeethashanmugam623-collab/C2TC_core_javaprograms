package com.tnsif.WrapperClass;

public class Wrapperclassdemo {

	public static void main(String[] args) {
		
		//primitive into object --> autoboxing 

		
				double x = 10.2;
				
				Double y = Double.valueOf(x);
				
				
				System.out.println(y);
				
				
				// object into primitive --> unboxing
				
				double z = y;
				
				System.out.println(z);

	}

}
