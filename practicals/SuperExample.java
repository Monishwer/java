class animal {
String color = "white";
}
class dog extends animal{
String color = "black";

void printColor(){
System.out.println(color);
System.out.println(super.color);
}
}
class SuperExample{

public static void main(String args[]){
dog d = new dog();
d.printColor();
}
}