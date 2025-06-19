
public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifstatement();
		IfElsestatement();
		Switch();
		Forloop();
		ForEachloop();
		Whileloop();
		DoWhileloop();
	}

	// Decision Statements

	static void Ifstatement() {

		int age = 16;
		if (age >= 18) {
			System.out.println("Person is eligible");
		}
		if (age < 18) {
			System.out.println("Person is not eligible");

		}
	}

	static void IfElsestatement() {

		int a = 60;
		int b = 50;
		int c = 30;

		if (a > b & a > c) {
			System.out.println("a is bigger");

		}

		else if (b > a & b > c) {
			System.out.println("b is bigger");

		}

		else {
			System.out.println("c is bigger");

		}
	}

	static void Switch() {

		String signal = "Amber";

		switch (signal) {

		default:
			System.out.println("Invalid Signal Color");
			break;
		case "Red":
			System.out.println("Stop");
			break;
		case "Amber":
			System.out.println("Ready to procees");
		case "Green":
			System.out.println("Go");
			break;

		}
	}

	static void Forloop() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);

		}
	}

	static void ForEachloop() {

		int values[] = { 10, 20, 30, 40, 50 };

		for (int i : values) {

			System.out.println(i);

		}

	}

	// Loop Statements

	static void Whileloop() {

		System.out.println("While loop statement");

		int i = 5;

		while (i <= 10) {

			System.out.println(i);
			i++;
		}
	}

	static void DoWhileloop() {

		System.out.println("Do While loop statement");

		int i = 4;

		do {

			System.out.println(i);
			i++;
		} while (i <= 10);
	}

}
