// Case 1: Handle Exception Using try-catch block
package com.exceptionhandling02;

import java.io.IOException;

public class Throws04A {
	
	public void method()throws IOException {
		
		throw new IOException ("Device Error");
	}
	
	// We Can Use Also This Code in Same Class 
	
public static void main(String[] args) {
		
		// Try & Catch Use
		try {
			// Create an Object Of Throws04A
			Throws04A obj = new Throws04A();
			obj.method();
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		System.out.println("Normal Flow...");
	}

}
