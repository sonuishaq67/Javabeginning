package com.chap1;

class StackNew {
	private int stck[] = new int[10];
	private int tos;

	StackNew() {
		tos = -1;
	}

	void push(int item) {
		if (tos == 9)
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}

	int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else
			return stck[tos--];
	}
}

class PrivateStack {
	public static void main(String args[]) {
		StackNew mystack1 = new StackNew();
		StackNew mystack2 = new StackNew();
		for (int i = 0; i < 10; i++)
			mystack1.push(i);
		for (int i = 10; i < 20; i++)
			mystack2.push(i);
		System.out.println("Stack in mystack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(mystack1.pop());
		System.out.println("Stack in mystack2:");
		for (int i = 0; i < 10; i++)
			System.out.println(mystack2.pop());
	}
}