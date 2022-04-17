package com.javaprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Conversion_Concepts {
	
	public static void main(String[] args) {
		
		
		
		String m = "of the people by the people for the people";
		
		   String[] words = m.split(" ");
		   
		   
		   Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		   
		   for (String word : words) {
			   
			 	   if (map.containsKey(word)) {
				   
				   Integer value = map.get(word);
				   
				   map.put(word, value+1);
			}
			   
			   else {
				 
				   map.put(word, 1);
				   
			}
			
		}
		   
	   
		
	      System.out.println(map);
	      
	      
	         Set<Entry<String, Integer>> entrySet = map.entrySet();
	         
	         
	         for (Entry<String, Integer> entry : entrySet) {
	        	 
	        	 if (entry.getValue()>1) {
	        		 
	        		 
	        		 System.out.println(entry);
					
				}
	        	   
				
			}
		
		
		
	}
	

}
