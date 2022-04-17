package com.javaprograms;

public class Palindrome {
	
	
	// 1st method Reverse number
	
	    private static void reversenum() {

	    	int num= 12345; 
		    int  temp = num;
			int value=0;
			int rem =0;
			
			while (temp>0) {
				
				rem=temp%10;
				value=(value*10)+rem;
				temp=temp/10;
			}	
				
			System.out.println("The Reverse number is"+" "+value);				
				
	    }
	    
	    // 2nd method check given number is palindrome
	   
			
	      private static void palindrome() {

		    	int num= 12321; 
			    int  temp = num;
				int value=0;
				int rem =0;
				
				while (temp>0) {
					
					rem=temp%10;
					value=(value*10)+rem;
					temp=temp/10;
				}	
				if(num==value) {
					
					System.out.println("Given number is palindrome");
					
					}	
					
					else {
						
						System.out.println("Given number is not palindrome");
						
					}				
	      }
	      
	      //3th method palindrome range
	      
	        private static void palindromeforrange() {
			
           int c=0;
	        	
	        	System.out.println("Palindrome number from 1to 30");
	        	
	        for (int n = 1; n <30; n++) {
			
	        	int a,i=0,j=0;
	        	
	        	a=n;
	        	
	        while (a>0) {
	        	
				i=a%10;
				
				j=(j*10)+i;
				
				a=a/10;
				
	        }	
				if (n==j) {
					
					System.out.print(j+",");
					
					c++;
				}	
					
	        }
	        
	        System.out.println("The Count of Palindrome numbers="+c);
				
		
	      }      
	       	      
	    public static void main(String[] args) {
			
			reversenum();
			palindrome();
			palindromeforrange();
			
		}	
			
}	
	
	
	
	
	
	
	
	
	
	
	
	


