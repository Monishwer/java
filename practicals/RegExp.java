package com;

import java.util.regex.*;

public class RegExp {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(".a"); //. represent single character
		Matcher m = p.matcher("ma");
		boolean b = m.matches();
		
		//or
		
		boolean bb = Pattern.compile("..m").matcher("aam").matches();
		
		//or
		boolean b1 = Pattern.matches("[a-zA-Z0-9]{8,}", "Anud123ppp");
		
		boolean b2 = Pattern.matches("[6789]{1}[0-9]{9}", "9856473646");
		boolean b3 = Pattern.matches("^[a-z0-9+_.-]*+@[a-zA-z0-9]*+\\.[a-z]{3}", "mamta12-3@gmail19.com");
		System.out.println(b + " " + b1 + " "+b2+" "+b3);
	}

}
