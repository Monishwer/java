import java.util.Scanner;
class oddoreven{

public static void main(String args[]){

Scanner s = new Scanner(System.in);
System.out.println("enter the number");
int number = s.nextInt();

if(number % 2 == 0){
System.out.println("Prime number");
}
else{
System.out.println("Not a prime number");
}
}
}