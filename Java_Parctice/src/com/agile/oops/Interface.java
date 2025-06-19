package com.agile.oops;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.test();
	}

}

interface Iparent1 {
	int a = 10;

	void test();
}

interface Iparent2 extends Iparent1 {
	void test();
}

class Sub implements Iparent1, Iparent2 {

	public void test() { // default
		System.out.println("Test method");

	}
}
