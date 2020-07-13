package com.chap1;

public class ForEach {

	public static void main(String args[]) {
		int a[][] = new int[3][5], sum = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++)
				a[i][j] = (i + 1) * (j + 1);
		for (int x[] : a)
			for (int y : x) {
				sum += y;
				System.out.println("the value of y is " + y);
			}
		System.out.println("the sum is "+sum);
	}

}
