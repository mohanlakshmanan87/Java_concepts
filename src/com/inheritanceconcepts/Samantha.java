package com.inheritanceconcepts;

public class Samantha implements Nayan,Trisha {

	@Override
	public void hair_Style() {
		System.out.println("Brown color");
		
	}

	@Override
	public void dressing_Style() {
		System.out.println("jeans and shirt");
		
	}

	@Override
	public void age() {
		System.out.println(38 );
		
	}

	@Override
	public void birth_Place() {
		System.out.println("Kerala");
		
	}

	
	public static void main(String[] args) {
		
	
		Samantha obj = new Samantha();
		obj.age();
		obj.birth_Place();
		obj.hair_Style();
		obj.dressing_Style();

	}
}
