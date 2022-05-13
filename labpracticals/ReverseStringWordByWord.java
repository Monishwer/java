package Assignments;

import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalVal;
		String revVal = "";
		
		System.out.println("enter string to reverse");
		Scanner sc = new Scanner(System.in);
		originalVal = sc.nextLine();
		
		int lenOfVal = originalVal.length();
		
		for(int i = lenOfVal - 1; i>= 0; i--) {
			revVal = revVal + originalVal.charAt(i);
			
		}
		System.out.println("original string is : "+originalVal);
		System.out.println("reverse of string is : "+revVal);
		
	}

}
