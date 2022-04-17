package com.collectionconcepts;


import java.util.Vector;
import java.util.ArrayList;
import java.util.List;



public class Collection {

	public static void main(String[] args) {
		
		
		List <Object> z = new Vector<>();
		
		
    z.add(50);
    z.add("model");
    z.add(5.5);
    z.add('m');
    z.add(50);
    
    System.out.println(z);
    
  int a= z.size();
  System.out.println(a);
    
		
  Object  b= z.get(4);
  System.out.println(b);
  
  
  z.set(3, 5);
  System.out.println(z);
  
  
  z.remove(2);
  System.out.println(z);
  
  int c= z.indexOf("model");
  System.out.println(c);
  
  
 boolean d=  z.contains(50);
 System.out.println(d);
 
 
// z.clear();
// System.out.println(z);
 
 z.addAll(z);
 System.out.println(z);
 

	List <Object> z1 = new ArrayList<>();
	z1.add(100);
	z1.add("welcome");
	z1.add('d');
	System.out.println(z1);
	
	
	z.addAll(z1);
	System.out.println(z);
 
 
   z.retainAll(z1);
   System.out.println(z);
   
   
   z.remove(z1);
   System.out.println(z);
 
 
 
 
 
		 
	}
	
	
}
