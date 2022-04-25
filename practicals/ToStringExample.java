package com;

public class ToStringExample {
	
	int rollno;
	String name, addr;
	
	ToStringExample(int rollno, String name, String addr){
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
	}
	public String toString() {
		return rollno + " " + name + " " + addr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringExample s = new ToStringExample(1,"RAM","MUMBAI");
		ToStringExample s1 = new ToStringExample(1,"SAM","CHENNAI");
		
		System.out.println(s);
		System.out.println(s1);
	}
		

}
