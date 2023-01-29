// Java throws Example
package com.exceptionhandling02;

import java.io.IOException;

public class Throws03 {
	
	// Create Method 01 With Throws Exception
	public void m() throws IOException {
		
		throw new IOException ("Device Error"); // Checked Exception 
	}
	// Create Method 02 With Throws Exception
	public void n() throws IOException {
		
		m();
	}
	// Create Method
	public void p() {
		
		try {
			n();
		}
		catch (Exception obj) {
			System.out.println("Exception Handled");
		}
	}
	  
	public static void main(String[] args) {
		
		// Create an Object
		Throws03 object = new Throws03();
		
		object.p();
		
		System.out.println("Normal Flow...");

	}

}
