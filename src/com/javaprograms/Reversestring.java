package com.javaprograms;

public class Reversestring {
	
	public static void main(String[] args) {
		
	//1.using string method
		
	/*	
	String	s = "MaddyMohan";
		
	String	temp ="";
	
	for (int i =s.length()-1; i >=0; i--) {
		
		   char value = s.charAt(i);
		   
		  temp = temp + value;
			
	}
				
	   System.out.println(temp);	
					
	*/
	
		
	//2, using array method
		
	/*	String m ="GREENS";
		
		char[] charArray = m.toCharArray();
		
		String m1="";
		
		for (int i = charArray.length-1; i>=0; i--) {
			
			m1= m1+charArray[i];
			
			
		}
		
	   System.out.println(m1);
	
	*/
		
		//3. using string buffer method
		
		String s = "REVERSE";
		
		StringBuffer b= new StringBuffer();
	    b.append(s);
	   
	    System.out.println(b.reverse());
	}
}
