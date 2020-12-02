package com.validations;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<Integer, String> map = new HashMap<Integer, String>();
 
 map.put(1, "Tenny");
 map.put(2, "Enoch");
 map.put(3, "Daniel");
 
 for (Map.Entry m1:map.entrySet())
		 {
	 		System.out.println(m1.getKey());
	 		System.out.println(m1.getValue());
		 }
	}

}
