package com.inheritanceconcepts;

public class Parameter {
	private void add(int a ,String b , char c) {
	System.out.println( 100  +" " + "ROOTI" +" " +'c');	
	}
	
	 private void add(String a, String b, String c) {
		 System.out.println(a + " " +b +" " +  c);
		}
	 
	 private void add(char a) {
		System.out.println(a);
	}
	 public static void main(String[] args) {
		
		 Parameter obj = new Parameter();
		 obj.add(125,"Maths",'r');
		 obj.add("how", "are" ," you");
		 obj.add('m');
	}
		
		

	}


