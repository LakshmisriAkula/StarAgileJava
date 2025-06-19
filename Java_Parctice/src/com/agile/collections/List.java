package com.agile.collections;

import java.util.*;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Integer> list = new ArrayList();

//		ArrayLists is an ordered (indexed) collection, not sorted and auto-grow able array. It’s internally implemented as resizable array.
//		This is one of most widely used concrete class. It’s fast to search, but slow to insert or delete and it allows duplicate

		LinkedList<Integer> list = new LinkedList();

//		A Linked list is ordered by index position, like Arraylist, except that the elements are doubly linked to one another , 
//		Inserting and deleting is very fast in Linked list. But, accessing elements is slow as we have to traverse

//		When you want to add or remove elements frequently, then you can use Linked list

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(30);

		list.add(4, 50);

		list.contains(50);

		System.out.println("Before removing" + list);

		list.get(4);

		list.size();

		list.remove(4);

		System.out.println("After removing" + list);

		for (int i : list) {

			System.out.println(i);

		}

	}

}
