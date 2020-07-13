package com.chap1;

class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

// this is an inner class
	class Inner {
		int y = 10; // y is local to Inner

		void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}

	void showy() {
		String y="i";
		System.out.println(y); // error, y not known here!
	}
}

class OuterClass {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();
	}
}