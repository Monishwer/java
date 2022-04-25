package com;

public class StringMutableExp {
	public static void my() {
		StringBuffer s = new StringBuffer("Hello");
		s.append(" world....");
		System.out.println("String is : "+s); // Hello World....
		s.insert(2, "Mamta");
		System.out.println("insert is : "+s); // HeMamtallo
		
		StringBuilder s1 = new StringBuilder("world");
		s1.replace(1, 3, "java");
		System.out.println("replace is : "+s1); //Wjavald
		s1.delete(1,3);
		System.out.println("delete is : "+s1); //Wvald
		s1.reverse();
		System.out.println("reverse is : "+s1); //dlavW
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my();
	}

}
