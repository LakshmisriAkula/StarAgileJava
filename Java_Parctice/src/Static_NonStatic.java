
public class Static_NonStatic {

	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_NonStatic S = new Static_NonStatic();
		S.NonStaticTest();
		StaticTest();
	}

	void NonStaticTest() {
		System.out.println("NonStaticTest");
		System.out.println(b);
		System.out.println(a);

	}

	static void StaticTest() {
		System.out.println("StaticTest");

		Static_NonStatic S = new Static_NonStatic();
		System.out.println(S.a); //objectname.membername

		System.out.println(Static_NonStatic.b); // classname.membername

	}

}
