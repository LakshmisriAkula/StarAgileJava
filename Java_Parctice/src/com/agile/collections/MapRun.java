package com.agile.collections;

import java.util.*;

public class MapRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The Map interface maps unique keys to values. A key is an object that you use to retrieve a value.
//		Given a key and a value, you can store the value in a Map object. After the value is stored, you can retrieve it by using its key.

		
//		HashMap<String, Integer> mapCollection = new HashMap(); 
		
		//It uses the Hashcode of an Object being inserted. This class can be used when we want collection with no duplicates and order is not important when we iterate.

		
		TreeMap mapCollection = new TreeMap(); 
		
		// It uses the TreeMap of an Object being inserted. This class can be used when we want collection with no duplicates and Ascending order is  important when we iterate.

		
		mapCollection.put("raju", 1);
		mapCollection.put("raju", 1);

		mapCollection.put("sai", 1);
		mapCollection.put("Nandu", 1);
		
		System.out.println(mapCollection.size());
		
		System.out.println(mapCollection.containsKey("Nandu"));
		
		System.out.println(mapCollection.containsValue("9548745785"));
		
		
		System.out.println(mapCollection.get("Nandu"));
		
		Set s = mapCollection.keySet();
		
		for(Object i: s) {
			System.out.println(i);

		}

		mapCollection.remove("raju");
		
		System.out.println("Raju removed");
		
		for(Object i: s) {
			System.out.println(i);

		}
		
		


	}

}
