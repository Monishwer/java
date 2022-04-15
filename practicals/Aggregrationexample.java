class Address{
String street, city, state, country;
int pincode;

public Address(String street, String city, String state, String country, int pincode){
	this.street = street;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pincode = pincode;

}
}

class Student{
int studentId;
String studentName, courseName, centerName;
Address addr;// aggregration

public Student(int studentId, String studentName, String courseName,
String centerName, Address addr){
this.studentId = studentId;
this.studentName = studentName;
this.courseName = courseName;
this.centerName = centerName;
this.addr = addr;



}
public void display(){
System.out.println("id is: "+studentId +" "+ "name is: "+ studentName + " "+ "course is" +courseName +" "+"center name" +centerName);
System.out.println(addr.street +" "+addr.city+" "+addr.state+" "+addr.country+" "+addr.pincode);
}
}






class Aggregrationexample{
public static void main(String [] args){
Address a = new Address("XYZ street","mumbai","mh","india",524373);
Address a1 = new Address("ABC road","chennai","TN","india",600048);

Student s = new Student(101,"mamta","java","chennai",a);
Student s1 = new Student(102,"ram",".net","kolkata",a1);
s.display();
s1.display();
}
}









