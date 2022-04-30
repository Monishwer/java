package com;

public class NonStaticLNestedClassExample {
	int a = 25;
	private int b = 45;
	
	void display() {
	class Inner{
		int res = a + b;
		void show() {
			System.out.println("value of res is : "+res);
		}
	}
	Inner i = new Inner();
	i.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticLNestedClassExample n = new NonStaticLNestedClassExample();
		n.display();
	}

}
