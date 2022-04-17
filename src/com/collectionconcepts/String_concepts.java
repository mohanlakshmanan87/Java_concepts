package com.collectionconcepts;

public class String_concepts {

	public static void main(String[] args) {
		
		
		String a=("This is my car");
		
		  int b= a.length();
		  System.out.println(b);
		
		String c =("This is my car");
				
	   boolean d= a.equals(c);
	   System.out.println(d);
		
	  boolean e= a.equalsIgnoreCase(c);
	  System.out.println(e);
		
	  
	String f= a.toUpperCase();
	System.out.println(f);
		
	
	String g = a.toLowerCase();
	System.out.println(g);
	
	
	boolean h= a.startsWith("This");
	System.out.println(h);
	
   boolean i=	a.endsWith("car");
   System.out.println(i);
   
   boolean j= a.contains("ca");
   System.out.println(j);
   
   int k =a.indexOf("a");
   System.out.println(k);
   
   int l= a.lastIndexOf("r");
   System.out.println(l);
   
   char m= a.charAt(6);
   System.out.println(m);
	
	String n= a.replace("c", "z");
	System.out.println(n);
	
	String o=  a.substring(5);
	System.out.println(o);
	
	boolean p= a.isEmpty();
	System.out.println(p);
	
	
	String[] q =a.split(" ");
	
	for(String t: q) {
	
	System.out.println(t);
	
	
	}
	
	
	
	
	
	
	
	
	
	
		
	}
}
