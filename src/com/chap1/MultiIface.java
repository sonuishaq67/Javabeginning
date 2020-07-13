package com.chap1;

interface x {
	void ab();
}

interface y {
	void bc();
}

class z implements x, y {
	public void ab() {
		System.out.println("this is from interface x");
	}

	public void bc() {
		System.out.println("this is from interface y");

	}

	void ba(String l) {
		System.out.println(l + " hello!");
	}
}

class f extends z {
	void ne(int x) {
		System.out.println(x + " from derived class");
	}
}

public class MultiIface {

	public static void main(String args[]) {
		f xyz = new f();

		xyz.ab();
		xyz.bc();
		xyz.ba("ishaq");
		xyz.ne(100);
	}

}
