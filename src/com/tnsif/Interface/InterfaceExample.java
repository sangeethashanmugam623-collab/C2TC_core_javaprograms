package com.tnsif.Interface;

interface Flowers{
	
	void bloom();
}

public class InterfaceExample implements Flowers {
	
	public void bloom() {
		System.out.println("The flowers are Bloomed!!!"); //implementation
	}
	
public static void main(String[] args) {
		
		
		InterfaceExample obj1 = new InterfaceExample();
		obj1.bloom();

	}
	}


