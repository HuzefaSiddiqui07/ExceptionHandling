package com.exceptionhandling02;

public class Throws01 {
	
	// Create Method
	public static int divideNumber(int x , int y) throws ArithmeticException{
		int divide = x/y;
		return divide;
	}

	public static void main(String[] args) {
		
		// Create an Object
		Throws01 obj = new Throws01();

		// try & Catch 
		
		try {
			System.out.println(obj.divideNumber(50, 0));
		}
		
		catch (ArithmeticException exp) {
			System.out.println(" Number cannot divide by 0");
		}
		
		System.out.println("Rest of code");
 
	}

}
