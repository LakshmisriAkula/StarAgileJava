
public class StringRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Jack and Jill";

		String str1 = new String("Java");
		String str2 = new String("Java");

		String str3 = "Java";
		String str4 = "Java";

		String str5 = "developer";

		System.out.println(str1 == str2);

		System.out.println(str3 == str4);

		System.out.println(str1.length());

		System.out.println(str1.concat(str5));

		System.out.println(str2.isEmpty());

		System.out.println(str3.contains("va"));

		String str6 = "Java";
		String str7 = "java";

		System.out.println("Equals ignorecase");
		
		System.out.println(str6.equals(str7));
		
		System.out.println(str6.equalsIgnoreCase(str7));
		
		System.out.println(str1.indexOf("a"));
		
		System.out.println(str1.lastIndexOf("a"));
		
		System.out.println(str1.indexOf('a', 2));

		System.out.println(str1.replace('a', 'A'));
		
		System.out.println(str1.charAt(2));
		
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.toLowerCase());

		String trimStr = "    test";

		System.out.println(trimStr.trim());
		
		System.out.println(str.substring(9));
		
		System.out.println(str.substring(9,13));
		
		
		//split
		
		System.out.println("Spllited");
		String text = "I Love Java";
		
		String arr[] = text.split(" ");
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}



	}

}
