import java.util.Scanner;
class factorial{

public static void main(String args[]){

Scanner s = new Scanner(System.in);
System.out.println("Enter any number");
int num = s.nextInt();

int fact = num;
while(num > 1){
num--;
fact  = fact * num;
}
System.out.println(fact);
}
}