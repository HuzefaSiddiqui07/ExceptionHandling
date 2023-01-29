// function to check if person is eligible to vote or not   
package com.exceptionhandling02;

public class Throw02 {
	
	// Create Method 
	public static void validate (int age) {
		
		if (age < 18) {
			
		  //throw Arithmetic exception if not eligible to vote  
			throw new ArithmeticException("\nPerson is not eligible to vote");
		}
		else {
			 System.out.println("Person is eligible to vote!!");  
		}
	}

	public static void main(String[] args) {
		
		//calling the Method 
		validate(19);
		
		System.out.println("Rest Of Code");

	}

}
