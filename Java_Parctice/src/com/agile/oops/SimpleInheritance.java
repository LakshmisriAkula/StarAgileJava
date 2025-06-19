package com.agile.oops;

public class SimpleInheritance extends Inheritance {

	private int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(i);

		System.out.println(j);

		Inheritance i = new Inheritance();
		System.out.println(i.k);

		System.out.println(l);

		System.out.println(m);

		i.print();

		display();

		SimpleInheritance si = new SimpleInheritance();

		si.a = 100;

		si.child();

	}

	void child() {

		this.print();

	}

	void print() {

		System.out.println("This is print method");

		System.out.println(a);

	}

}
