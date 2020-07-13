package com.chap1;
import java.util.Scanner;
public class Scanx {

	public static void main(String args[] ){
	Scanner x =new Scanner(System.in);
	System.out.println("Enter username");
	String username=x.nextLine();
	System.out.println("enter age");
	int age = x.nextInt();
	System.out.println("enter salary");
	double salary=x.nextDouble();
	
	System.out.println("username is "+username);
	System.out.println("age is "+age);
	System.out.println("salary is "+salary);
	}

}
