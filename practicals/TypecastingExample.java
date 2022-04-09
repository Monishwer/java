class TypecastingExample{

public static void main(String args[]){

//downcasting or narrowing
double a = 89.76; // double variable
int b = (int) a; // converted to int variable

System.out.println("value of double variable :" +a);
System.out.println("value of int variable :" +b);

//upcasting or widening
int c = 98; // int variable
float d = c; // converted to double variable
//float d = (float) c; 

System.out.println("value of double variable :" +d);
System.out.println("value of int variable :" +c);

}
}