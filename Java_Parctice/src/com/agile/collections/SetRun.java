package com.agile.collections;

import java.util.*;

public class SetRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet setCollection = new HashSet();

		// It uses the Hashcode of an Object being inserted. This class can be used when
		// we want collection with no duplicates and order is not important when we
		// iterate.

//		LinkedHashSet setCollection = new LinkedHashSet(); 

		// It uses the LinkedHashMap of an Object being inserted. This class can be used
		// when we want collection with no duplicates and order is important when we
		// iterate.

//		TreeSet setCollection = new TreeSet(); 

		// It uses the TreeMap of an Object being inserted. This class can be used when
		// we want collection with no duplicates and Ascending order is important when
		// we iterate.

//		setCollection.add("raju");
		setCollection.add(3);
		setCollection.add(2);
		setCollection.add(1);
		setCollection.add(1);

		setCollection.contains(2);

		System.out.println(setCollection.size());

		for (Object i : setCollection) {

			System.out.println(i);
		}
		
		SortedSetTest();

	}

	static void SortedSetTest() {

		SortedSet s = new TreeSet();

		s.add("b");
		s.add("c");
		s.add("a");
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			
			Object ele = i.next();
			System.out.println(ele);
		}
		
		System.out.println("No next element");

	}

}
