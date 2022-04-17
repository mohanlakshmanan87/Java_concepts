package com.JavaRevision;

public class Trainer_Class implements Revision {
	
	
	@Override
	public void revision() {
		System.out.println("java");
		
		
	}

	@Override
	public void division() {
	System.out.println("selenium");
		
	}
	
	
	public static void main(String[] args) {
		
		
		Trainer_Class obj= new Trainer_Class();
		
		obj.division();
		obj.revision();
	}
	

}
