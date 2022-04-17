package com.javaprograms;

public class Armstrong {
	
	
	public static void main(String[] args) {
		
		int a = 153;
	    int temp = a;
		int value=0;
		int rem =0;
		
		while(temp>0) {
			
		rem = temp%10;
		
		value= value+(rem*rem*rem);
		
		temp = temp/10;
		

			
}	
		if(a==value) {
		
		System.out.println("This is amstrong number");
		
		}	
		
		else {
			
			System.out.println("This is not amstrong number");
			
		}		
		
		
	
	
	
	
	
	
	
	
	
	}	

}
