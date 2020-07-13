package com.chap1;

public class RightShift {

	public static void main(String args[]) {
		int a = 9, b;
		int i;
		i = a >> 1;
		b = (a >>> 1);

		System.out.println("Original value of a: " + a);
		System.out.println("right shift by 1 and by 2: " + i + " " + b);
	}

}
