
public class ConstructorOverloading {

	long i;
	long j;

	ConstructorOverloading() {

		System.out.println("No argument constructor");

		i = 20;
		j = 50;
	}

	ConstructorOverloading(int k) {

		System.out.println("Number of argument is different");

		i = k;
	}

	ConstructorOverloading(int l, int m) {

		i = l;
		j = m;
	}

	ConstructorOverloading(long l, long m) {

		System.out.println("Type of argument is different");

		i = l;
		j = m;
	}

	public static void main(String[] args) {

		ConstructorOverloading co1 = new ConstructorOverloading();
		System.out.println("i =" + co1.i);

		ConstructorOverloading co2 = new ConstructorOverloading(50);
		System.out.println("i =" + co2.i);

		ConstructorOverloading co3 = new ConstructorOverloading(60, 70);
		System.out.println("i =" + co3.i);
		System.out.println("j =" + co3.j);

		ConstructorOverloading co4 = new ConstructorOverloading(200, 500);
		System.out.println("i =" + co4.i);
		System.out.println("j =" + co4.j);
	}

}
