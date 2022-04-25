package com;

public class StringExample2{

public void show(){
char[] arr = {'j','a','v','a'};
String s = new String (arr);// convert ch array to string
System.out.println("value is : "+s);
System.out.println(arr);
}
public void myFunction(){
String m = "Ratan";// string literal
String m4 = "Sachin";
String m1 = "mamta B";
String m3 = "mamta B";
String m2 = new String("mamta");// string new keyword
System.out.println(m.equals(m1));
System.out.println(m.equalsIgnoreCase(m2));
System.out.println(m2.equals(m));
System.out.println(m == m2);
System.out.println(m3 == m1);
System.out.println(m4.compareTo(m));
System.out.println(m.compareTo(m4));
System.out.println(m1.compareTo(m3));

}
public void display(){

String s = "Anudip" + "Foundation";
System.out.println(s);
String s1 = 80 + 45 + " Mamta "+ 20 + 10;
System.out.println(s1);
System.out.println(s.concat(s1));

String x = "Hello";
System.out.println("substring is "+ x.substring(0,2));//he
System.out.println("substring is "+ x.substring(2));//llo
}

public static void main(String [] args){
StringExample2 obj = new StringExample2();
obj.show();
obj.myFunction();
obj.display();
}
}
