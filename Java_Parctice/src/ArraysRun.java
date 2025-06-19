
public class ArraysRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

		System.out.println("Multi diemnsional array");

		int arrMulti[][] = { { 10, 20, 30 }, { 20, 30 } };

		for (int i = 0; i < arrMulti.length; i++) {
			for (int j = 0; j < arrMulti[i].length; j++) {
				System.out.print(arrMulti[i][j] + " ");
			}
			System.out.println();
		}

		for (int arr1[] : arrMulti) {
			for (int a : arr1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

		System.out.println("Multi diemnsional arrays display based on index");

		System.out.println(arrMulti[0][1]);

//		System.out.println(arrMulti[0][2]);

		System.out.println("Strings");

		String s1[] = new String[3];
		s1[0] = "i";
		s1[1] = "love";
		s1[2] = "java";

		for (String s : s1) {

			System.out.println(s);
		}

		System.out.println("JAGGED ARRAY");

		int[][] arr2 = { { 3, 5, 7, 8 }, { 4, 8, }, { 5, 7, 8, 9 }, { 6 } };
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-enhanced loop--");
		for (int a[] : arr2) {
			for (int i : a) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
