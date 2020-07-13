package com.chap1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ChainExcDemo {
	static void demoproc() {
// create an exception
		NullPointerException e = new NullPointerException("top layer");
// add a cause
		e.initCause(new ArithmeticException("cause"));
		throw e;
	}

	public static void main(String args[]) {
		try {
			demoproc();
		} catch (NullPointerException e) {
// display top level exception
			System.out.println("Caught: " + e);
// display cause exception
			System.err.println("Original cause: " + e.getCause());
		}
	}
}