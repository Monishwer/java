class VariableExample{

//non static method
public void display(){

//local variable
int num1 = 100;
int num2 = 400;
int res = num1 + num2;
System.out.println("the addition is : " + res);
}

//instance variable
String a; // default value is null
int b; // default value is 0
double c = 23.5; // default value is 23.5

//static variable
static int d = 100;

public static void main(String args[]){
// creation of object - declaration,instance, initialization

VariableExample obj = new VariableExample();

//invoke or call method
obj.display();

//call instance variable
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c);

//call static variable without object
System.out.println("Static variable "+ d);

}
}








