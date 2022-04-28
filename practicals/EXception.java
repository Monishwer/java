package com;

import java.util.Scanner;
class EXception{
static void show(){
String a="i am an error..";
try{
System.out.println(a);
int i=50/1;
System.out.println(i);

String s="Mamta";
System.out.println(s.length());

int m=Integer.parseInt(s);
System.out.println(m);

int arr[]=new int[3];
arr[4]=24;
}
catch(ArithmeticException e){
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
finally{
System.out.println("I am finally block");
}
String b="i can't be handled ";
System.out.println(a+b);
}
public static void main(String args[]){
Scanner s = new Scanner("System.in");
try {

int x = s.nextInt();
int y = s.nextInt();
System.out.println(" "+(x/y));
}
catch(Exception e){
System.out.println(e);
}
show();
}
}





