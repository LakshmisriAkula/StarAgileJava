
public class AssignmentWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even();
		Odd();
	}

	// WAP to print all even numbers between 1-20

	static void Even() {

		int num = 2;

		while (num <= 20) {
			System.out.println(" Even numbers:" +num);
			num += 2;
		}
	}
	
	//WAP to print all odd numbers between 1-20.
	static void Odd() {

		int num = 1;

		while (num <= 20) {
			System.out.println(" Odd numbers:" +num);
			num += 2;
		}
	}
}
