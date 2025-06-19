
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Casting outer = new Casting();
		Parent p = outer.new Parent();
		p.test();
		Child c = outer.new Child();
		c.test();
		c.display();

		Parent p1 = outer.new Child(); // upcasting

		p1.test();

		Child c1 = (Child) p1; // downcasting

		c1.display();
		c1.test();

	}

	class Parent {

		void test() {

		}
	}

	class Child extends Parent {
		void display() {

		}
	}

}
