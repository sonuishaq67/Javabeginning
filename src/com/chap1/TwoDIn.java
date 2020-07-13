package com.chap1;

import java.util.Scanner;

public class TwoDIn {

	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		int a[][];
		int n=x.nextInt();
		a=new int[n][n];
		int i, j;
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++)
				a[i][j] = x.nextInt();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
