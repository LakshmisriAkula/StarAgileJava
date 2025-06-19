
public class ExceptionRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int res = 10 / 0;
			System.out.println(res);

		} catch (Exception e) {
			System.out.println("Catch block");

		} finally {
			System.out.println("Finally block");
		}

		ExceptionRun run = new ExceptionRun();

		run.test1();

	}

	void test1() {
		test2();

	}

	void test2() {
		test3();
	}

	void test3() {
		test4();
	}

	void test4() {

		test1();
	}

}
