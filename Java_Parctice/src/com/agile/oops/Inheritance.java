package com.agile.oops;

public class Inheritance {

	static private int i = 10;
	static int j = 20;
	int k = 30;
	static protected int l = 40;
	static public int m = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance i = new Inheritance();
		i.print();
		display();
	}

	void print() {

		System.out.println("This is print method");
	}

	static void display() {

		System.out.println("This is display  method");

	}

}