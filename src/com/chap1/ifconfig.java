package com.chap1;

public class ifconfig {

	public ifconfig() {
		
	}

	public static void main(String[] args) {
		int num1 = 100, num2 = 200;
		if (num1 > num2)
			System.out.println(num1 + " is greater than " + num2);
		else
			System.out.println(num2 + " is greater than " + num1);
		num1 = num1 * 2;
		if (num1 == num2)
			System.out.println("now " + num1 + " and " + num2 + " are equal");
		else
			System.out.println("the numbers " + num1 + "," + num2 + " aren't equal");
	}

}
