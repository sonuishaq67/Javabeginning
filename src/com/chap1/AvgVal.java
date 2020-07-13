package com.chap1;

public class AvgVal {

	public static void main(String args[])
	{
		int a[]= {60,56,45,35,67},sum=0,avg;
		for(int i=0;i<5;i++)
		sum=sum+a[i];
		avg=sum/a.length;
		System.out.println("the avergae is "+avg);
	}

}
