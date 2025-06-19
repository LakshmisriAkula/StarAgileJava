public class Assignments {

	public static void main(String[] args) {
		// With reverse() function
		String module = "Java";

		StringBuffer reverseModuleName = new StringBuffer(module);

		System.out.println(reverseModuleName.reverse());

		// Without reverse() function

		for (int i = module.length() - 1; i >= 0; i--) {

			System.out.print(module.charAt(i));
		}
	}

}
