package com;
import java.util.Scanner;

public class StringDemo {
	
	public void show() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter String");
		String A = s.next();
		String B = s.next();
		
		System.out.println(A.length() + B.length());
		System.out.println((A.compareTo(B) > 0) ? "yes" : "No");
		System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo st = new StringDemo();
		st.show();
	}

}
