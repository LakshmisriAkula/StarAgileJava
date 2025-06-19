package com.agile.oops;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading mo = new MethodOverloading();
		mo.addition(10, 20,30);
	}

	void addition(int a, int b) {
		int result = a + b;
	}
	
	void addition(int a, float b) {
		
	}
	
	void addition(float a, int b) {//13.3, 10
	
	}
	
	void addition(float a, float b) {
		
	}
	
	void addition(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
	}
	

}
