
public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a = 4;
      int b = 5;
      int result = --a + b++ + --b + a++ + --a + ++a + --b;
      //a = 3/4/3/4
      //b = 6/5/4
      //result =3 + 5 + 5 + 3 + 3 + 4 + 4  = 27
      
      System.out.println(result);
      System.out.println(a);
      System.out.println(b);

	}

}
