package com.JavaRevision;

import javax.naming.NamingException;

public class Exception {

	public static void main(String[] args) {
		
		try {
			
			int a=10;
			
			System.out.println(a/0);
			
		}
		 catch (NullPointerException e) {
			 
			 System.out.println("handle null pointer");
			
		}
		 
		catch (ArithmeticException e) {
			
			System.out.println("handle Arithmetic");
			
			//System.out.println(10/0);
			
			String s =null;
			
			System.out.println("s.toLowercase");
			
			System.out.println("Execution process");
			
			}
		
	}
	
}
		
		

	
	
	
	

