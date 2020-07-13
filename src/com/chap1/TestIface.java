package com.chap1;

interface Callback {
	void callback(int param);
	int chan=100;
}

class Client implements Callback {
	public void callback(int p) {
		System.out.println("callback called with " + p);
	}
	
	void nonIfaceMeth() {
		System.out.println("Classes that implement interfaces " + "may also define other members, too "+chan);
		
	}
}

public class TestIface {
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		Callback c = new Client();
		c.callback(42);
		System.out.println(c.chan);
		Client x= new Client();
		x.nonIfaceMeth();
		x.callback(16);
	}
}  