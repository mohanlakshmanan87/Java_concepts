package com.collectionconcepts;




import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

     public class Set_concepts {

	public static void main(String[] args) {
		
		
		Set <Integer> z = new LinkedHashSet<>();
		
		
    z.add(50);
    z.add(150);
    z.add(80);
    
    System.out.println(z);
    
  int a= z.size();
  System.out.println(a);
    

  
 boolean d=  z.contains(50);
 System.out.println(d);
 
 
// z.clear();
// System.out.println(z);
 

	Set<Integer> z1 = new TreeSet<>();
	z1.add(100);
	z1.add(60);
	z1.add(70);
	z1.add(50);
	System.out.println(z1);
	
	
	z.addAll(z1);
	System.out.println(z);
 
 
   z.retainAll(z1);
   System.out.println(z);
   
   
   //z.remove(z1);
  // System.out.println(z);
 
 
 
 
 
		 
	}
	
	
}
