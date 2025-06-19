import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AssignmentString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print the given String in vertical fashion using for loop

		String str = "Jack and Jill";

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));

		}

		// Write the program to print the reverse of given string
		String str1 = "Java";

		for (int j = str1.length() - 1; j >= 0; j--) {

			System.out.println(str1.charAt(j));
		}


	}
}
