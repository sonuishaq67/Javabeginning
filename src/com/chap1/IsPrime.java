package com.chap1;

public class IsPrime 
{

	public static void main(String args[]) 
	{
		int a=103,i;
		boolean isprime=true;
		if(a<2)
			isprime=false;
		else 
		{
			for(i=2;i<a/2;i++)
			{
				if(a%i==0)
					isprime=false;
			}
		}
		
		
		if(isprime)
			System.out.println("its a prime number");
		else
			System.out.println("not a prime number");
	}

}
