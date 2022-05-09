package com;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileOutputStream f1 = new FileOutputStream("E:\\sample.txt");
		FileOutputStream f2 = new FileOutputStream("D:\\sample.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		bout.write(65);
		
		bout.writeTo(f1);
		bout.writeTo(f2);
		
		bout.flush();
		bout.close();
		
		System.out.println("done");
	}

}
