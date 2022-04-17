package com.JavaRevision;

public class D extends C {
	
	@Override
	public void Employeeid() {
		System.out.println("4201");
		//super.Employeeid();
	}
   
	private void employeeage() {
		System.out.println("30");

	}
	  
	@Override
	void employeeDOB() {
		System.out.println("19.10.1987");
	}
	
	
	public static void main(String[] args) {
		
		D id = new D();
		id.Employeeid();
		id.Employeenumber();
		id.employeeage();
        id.employeeDOB();

	}


}