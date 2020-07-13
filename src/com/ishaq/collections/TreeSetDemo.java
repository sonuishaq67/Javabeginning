package com.ishaq.collections;

import java.util.*;

class TreeSetDemo {
	public static void main(String args[]) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		ts.add("784326");
		ts.add("23");
		System.out.println(ts);
	}
}