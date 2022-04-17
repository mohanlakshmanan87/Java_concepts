package com.inheritanceconcepts;

public class Kamal extends Rajini {
	
	@Override
	public void superstar() {
	super.superstar();
	System.out.println("King of Style");
	}
	
  @Override
public void vijay() {
	super.vijay();
	System.out.println("King of Kollywood");
	
}
	@Override
	public void maddy() {
		super.maddy();
    System.out.println("King of Smile");
	}
	
	private void ajith() {
		System.out.println("AK");

	}
	
	public static void main(String[] args) {
	Kamal obj=	new Kamal();
	obj.superstar();
	obj.vijay();
	obj.maddy();
	obj.ajith();	
		
		
	}

}
