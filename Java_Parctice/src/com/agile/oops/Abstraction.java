package com.agile.oops;

 class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bravia b = new Bravia();
		b.display();
	}

 }
	abstract class Sony extends Abstraction{

		abstract void display();

		abstract void speaker();

		 void usb() {
			 
		 }

	}

	 class Bravia extends Sony {

		void display() {
			System.out.println("display : 1080 px");
		}

		void speaker() {
			System.out.println("speaker : 50 W");
		}

	}

	 class Bravia4k extends Sony {
		void display() {
			System.out.println("display : 1920 px");
		}
		
		void speaker() {
			System.out.println("speaker : 150 W");

		}
	}
	
	class simple extends Sony {
		void display() {
			System.out.println("display : 780 px");
		}
		
		void speaker() {
			System.out.println("speaker : 10 W");
		}
	}


