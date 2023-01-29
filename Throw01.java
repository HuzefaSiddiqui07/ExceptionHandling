package com.exceptionhandling02;

public class Throw01 {
	
	// Create Method 
	public static void checkNumber(int num) {
		
		if (num < 1) {
			throw new ArithmeticException("\nNumber is Negative, Cannot Calculate Square");
			
		}
		else {
			System.out.println("Number of >" + num + " Square is >" + (num*num));
		}
	}

	public static void main(String[] args) {
		
	//calling the Method  
	  checkNumber(-5);
		
		System.out.println("Rest of code");
		
	}

}
