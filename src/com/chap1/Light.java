package com.chap1;

public class Light {

	public static void main(String args[]) {
		int lightspeed = 186000;
		long days = 1000, seconds, distance;
		seconds = days * 24 * 60 * 60;
		distance = lightspeed * seconds;
		System.out.println("in " + days + " days light travels " + distance + " miles");
	}
}
