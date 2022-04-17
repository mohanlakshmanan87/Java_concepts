package com.JavaRevision;

public class PojoB {
	
	
	public static void main(String[] args) {
		
	 PojoA  p = new PojoA();
 
   int age = p.getAge();
     
     System.out.println(age);
	
   p.setAge(22);
  
  
   System.out.println(p.getAge());
   
	

}

}