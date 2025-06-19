package com.agile.oops;

public class Encapsulation {

	private int balance;
	private String statement;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e = new Encapsulation();

		e.setBalance(50000, "Java");
		System.out.println("The balance after updation" +" " +  e.getBalance());
	}

	int getBalance() {
		return balance;
	}
	
	void setBalance(int display, String text) {
		
		balance = display;;
		statement =  text;
		

		
	}
}
