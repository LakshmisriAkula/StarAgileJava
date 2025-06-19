import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Constructor {
	int i,j;
	Constructor(){
		 i = 20;
		 j = 50;
	}
	
	Constructor(int k){
		 i = k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor C = new Constructor();
		System.out.println("i = " + C.i);
		System.out.println(C);
		Constructor C1 = new Constructor(10);
		System.out.println("i = " + C1.i);

	}

}
