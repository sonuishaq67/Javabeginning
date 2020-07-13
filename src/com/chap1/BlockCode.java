package com.chap1;

public class BlockCode {
	int x = 10;

	public BlockCode() {
		System.out.println(x);
	}

	public static void main(String args[]) {

		byte x = 5, y;

		System.out.print(x);

		y = 40;
		for (x = 0; x < 16; x++) {

			System.out.println("This is x: " + x);
			System.out.println("This is y: " + y);
			y = (byte) (y * 2);
		}
		System.out.println(x);
	}
}
