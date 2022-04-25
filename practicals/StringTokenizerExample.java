package com;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	
	public void myy() {
		StringTokenizer t = new StringTokenizer("anudip foundation skill and center development center"," ");
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken());
		}
		
		StringTokenizer st = new StringTokenizer("i am mamta,staying in india,working in anudip");
		while(st.hasMoreTokens()) {
			System.out.println("next token : "+ st.nextToken(","));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizerExample m = new StringTokenizerExample();
		m.myy();
	}

}
