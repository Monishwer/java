package com;

interface shape{

	void getArea(); 
 	default void getSide(){
	System.out.println("sides");
}
}

//--------------------------------
class rectangle implements shape{

public void getArea(){
int length = 5;
int width = 6;
int area = length * width;
System.out.println("area of rectangle is : "+area);
}
public void getSide(){
System.out.println("4 sides");
}
}
//--------------------------------
class triangle implements shape{

public void getArea(){
double base = 10;
double height = 20;
double area = (base * height)/2;
System.out.println("area of triangle is : "+area);
}
public void getSide(){
System.out.println("3 sides");
}
}
//--------------------------------
class square implements shape{

public void getArea(){
int side = 25;
int area = side * side;
System.out.println("area of square is : "+area);
}
public void getSide(){
System.out.println("4 sides");
}
}
//--------------------------------

public class interFaceExp {
	
	public static void main(String args[]){

		shape areaofrec = new rectangle();
		areaofrec.getArea();
		areaofrec.getSide();

		shape areaoftri = new triangle();
		areaoftri.getArea();
		areaoftri.getSide();

		shape areaofsqu = new square();
		areaofsqu.getArea();
		areaofsqu.getSide();

		}

}
