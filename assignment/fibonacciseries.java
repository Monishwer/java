import java.util.Scanner;
class fibonacciseries{

public static void main(String args[]){
int num1 = 0;
int num2 = 1;
int nextnum;
int serieslength;
Scanner s = new Scanner(System.in);
System.out.println("Enter the length of the series");
serieslength = s.nextInt();

for(int i = 0; i< serieslength; i++){

System.out.print(num1+" ");
nextnum = num1 + num2; // nextnum = 0 + 1 = 1;
num1 = num2;
num2 = nextnum;
}

}
}