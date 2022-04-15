class vehicles{
String color = "white";
String type = "4 wheeler";
String brand = "Honda";
}

class car extends vehicles{
String modelName = "Honda City";
}

class singleInheritence{

public static void main(String args[]){

car c = new car();
System.out.println("Car name is : "+c.modelName);
System.out.println("Car brand is : "+c.brand);

}
}