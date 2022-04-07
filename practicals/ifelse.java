import java.util.Scanner;
class ifelse{

public void display(){

//int age = 20;

Scanner s = new Scanner(System.in);
System.out.println("enter your age");
int age = s.nextInt();

if(age >= 18){
System.out.println("you are eligible");
}
else{
System.out.println("you are not eligible");
}

}

public static void main(String args[]){
ifelse c = new ifelse();
c.display();

}

}