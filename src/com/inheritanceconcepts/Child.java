package com.inheritanceconcepts;

public class Child extends Parent {
	@Override
	public void property() {
		System.out.println("Home");
		
	}

    @Override
    	public void cash() {
        //super.cash();
        System.out.println("Rupees");
        
    	}

      public static void main(String[] args) {
		
      Child obj = new Child();
    	obj.property();
    	obj.cash();
    	  
	}
    
    
}
	
	


