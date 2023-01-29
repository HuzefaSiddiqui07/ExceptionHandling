package com.exceptionhandling02;

public class Throws02 {
	
	// Create Method 
	public static void checkAge (int age) throws ArithmeticException {
		
		if (age < 18) {
			
			 //throw Arithmetic exception if not eligible to vote  
			throw new ArithmeticException ("\nAccess denied - You must be at least 18 years old.");
		}
		else {
			System.out.println("Access granted - You are old enough!");
		}
		
	}

	public static void main(String[] args) {
		
		// Calling Method
		checkAge(15); // Set age to 15 (which is below 18...)

	}

}
