package com.chap1;

public class TypeCast {

public static void main(String args[])
	{
	byte b;
	int i=257;
	double d=323.142;
	System.out.println("conversion of int to byte");
	b=(byte)i;
	System.out.println("i and b are "+i+","+b);
	System.out.println("\nconversion of double to int");
	i=(int)d;
	System.out.println("i and d are "+i+","+d);
	System.out.println("\nconversion of double to byte");
	b=(byte)d;
	System.out.println("b and d are "+b+","+d);
	}
}