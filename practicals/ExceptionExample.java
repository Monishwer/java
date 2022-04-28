package com;

public class ExceptionExample {
	
	public static void myDisplay(int a) throws ArithmeticException {
		if(a >=0 && a<35) {
			throw new ArithmeticException("you are fail");
		}
		else {
			System.out.println("you are pass");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myDisplay(4);
	}

}
