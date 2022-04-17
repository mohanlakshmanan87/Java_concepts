package com.JavaRevision;

public class Workspace {

 static int age = 50;
  
  
  
 String s = "SUPERSTAR";
 
 

  public Workspace(String name, int age1) {
	  
	  
	  System.out.println("My Name is"+" "+name + " "+ "My Age is" +" " +age1);
	  
	  System.out.println(s);
	  
	  
}
  
  

  public Workspace(char init, String Name) {
	  
	  System.out.println("My Initial is"+" "+init + " "+ "My Name is" +" " +Name);
	  
	  
}
  
  
public static void main(String[] args) {
	 
	  Workspace w = new Workspace("Mohan",34);
	  
	  Workspace w1 = new Workspace('L', "Mohan");
	
	 
	 age = 70;
	 
	 System.out.println(age);
	 
	
}
	
	
	
	
	
}
