package com;
import java.util.*;

interface LibraryUser {
	
	void registerAccount(int a);
	void requestBook(String a);

}

class KidUsers implements LibraryUser{
	
	int age;
	String bookType;
	@Override
	public void registerAccount(int a) {
		// TODO Auto-generated method stub
		age = a;
		if(age < 12) {
			System.out.println("you have successfully registered under a kids account");
		}
		else if(age > 12) {
			System.out.println("sorry age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestBook(String a) {
		// TODO Auto-generated method stub
		bookType = a;
		if(bookType == "Kids") {
			System.out.println("book issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("oops, you are allowed to take only kids books");
		}
	}
	
}

class AdultUser implements LibraryUser{
	int age;
	String bookType;
	@Override
	public void registerAccount(int a) {
		// TODO Auto-generated method stub
		age  = a;
		if(age < 12) {
			System.out.println("you have successfully registered under a kids account");
		}
		else if(age > 12) {
			System.out.println("sorry age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestBook(String a) {
		bookType = a;
		// TODO Auto-generated method stub
		if(bookType == "Fiction") {
			System.out.println("book issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("oops, you are allowed to take only adult books");
		}
	}
	
}

public class InterFaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUsers k = new KidUsers();
		k.registerAccount(10);
		k.registerAccount(18);
		k.requestBook("Kids");
		k.requestBook("Fiction");
		AdultUser a = new AdultUser();
		a.registerAccount(5);
		a.registerAccount(23);
		a.requestBook("Kids");
		a.requestBook("Fiction");
	}

}
