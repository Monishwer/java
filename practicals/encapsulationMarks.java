import java.util.Scanner;
class encapmarks{

private String studentName;
private int studentId, studentPassword;
private int total, percentage;

public String get_Sname(){
	return studentName;
}
public int get_Sid(){
	return studentId;
}
public int get_Spass(){
	return studentPassword;
}
public void set_Sname(String value){
	studentName = value;
}
public void set_Sid(int value){
	studentId = value;
}
public void set_Spass(int value){
	studentPassword = value;
}

public void marks(int sub1, int sub2, int sub3, int sub4, int sub5){

total = sub1 + sub2 + sub3 + sub4 + sub5;
percentage = total/5;
System.out.println("total percentage is : "+percentage);

if(percentage >= 50 && percentage < 60){
System.out.println("E grade");
}
else if(percentage >= 60 && percentage < 70){
System.out.println("D grade");
}
else if(percentage >= 70 && percentage < 80){
System.out.println("C grade");
}
else if(percentage >= 80 && percentage < 90){
System.out.println("B grade");
}
else if(percentage >= 90 && percentage <= 100){
System.out.println("A grade");
}


}

}

//-----------------------------------------------

public class encapsulationMarks{

public static void main(String args[]){

String stuname;
int stuid,stupass;
int sub1,sub2,sub3,sub4,sub5;
Scanner s = new Scanner(System.in);
System.out.println("Enter your name : ");
stuname = s.nextLine();
System.out.println("Enter your id : ");
stuid = s.nextInt();
System.out.println("Enter your password : ");
stupass = s.nextInt();

System.out.println("Enter all the 5 subject marks");
System.out.println("Enter sub1 mark : ");
sub1 = s.nextInt();
System.out.println("Enter sub2 mark : ");
sub2 = s.nextInt();
System.out.println("Enter sub3 mark : ");
sub3 = s.nextInt();
System.out.println("Enter sub4 mark : ");
sub4 = s.nextInt();
System.out.println("Enter sub5 mark : ");
sub5 = s.nextInt();

encapmarks en = new encapmarks();
en.set_Sname(stuname);
en.set_Sid(stuid);
en.set_Spass(stupass);

System.out.println("student name is : "+en.get_Sname());
System.out.println("student id is : "+en.get_Sid());
System.out.println("student password is : "+en.get_Spass());

en.marks(sub1, sub2, sub3, sub4, sub5);
//this code will make error
//System.out.println("total percentage is : "+en.percentage);

}

}



















