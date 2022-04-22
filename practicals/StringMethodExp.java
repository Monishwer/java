package com;


public class StringMethodExp{

public void show(){

String s = "Anudip Foundation Skill Development Center";
String s1 = " ANUDIP ";
System.out.println("upper case is : "+s.toUpperCase());
System.out.println("lower case is : "+s.toLowerCase());
System.out.println(s1);
System.out.println("Trim is : "+s1.trim());
System.out.println("Startswith : "+s.startsWith("Anu"));
System.out.println("Endswith : "+s.endsWith("err"));
System.out.println("Charat is : "+s.charAt(3));
System.out.println("Charat is : "+s.charAt(15));
System.out.println("length is : "+s.length());

int a = 20;
String s2 = String.valueOf(a);
System.out.println(s2 + 30);

System.out.println("replace is : "+s.replace("Development","Career Development"));

}
public static void main(String args[]){
StringMethodExp obj = new StringMethodExp();
obj.show();
}

}