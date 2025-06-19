package com.agile.oops;

public class ThisVariables {

	int globalVariable = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisVariables tv = new ThisVariables();
		tv.VariableHiding();
		ThisVariables tv1 = new ThisVariables();

		tv1.VariableHidingParameters(500);
	}

	void VariableHiding() {

		int globalVariable = 200;

		System.out.println(globalVariable);
	}

	void VariableHidingParameters(int globalVariable) {

		System.out.println(globalVariable);
		System.out.println(this.globalVariable);

	}
	

}
