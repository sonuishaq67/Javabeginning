package com.chap1;

public class twoadd {

	public static void main(String args[]) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, b[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int c[][] = new int[3][3], i, j;
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				c[i][j] = a[i][j] + b[i][j];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				System.out.print(c[i][j] + " ");
			System.out.print("\n");
		}
	}
}
