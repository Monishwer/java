package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student s = new Student(101, "mamta",2000);
			FileOutputStream fout = new FileOutputStream("E://ab.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(s);
			obj.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
