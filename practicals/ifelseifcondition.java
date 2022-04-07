import java.util.Scanner;
class ifelseifcondition{

public void display(){

Scanner s = new Scanner(System.in);
System.out.println("Enter the time");
int time = s.nextInt();

if(time < 12){
System.out.println("Good Morning");
}
else if(time < 16){
System.out.println("Good Afternoon");
}
else if(time < 19){
System.out.println("Good Evening");
}
else{
System.out.println("Good Night");
}

}

public static void main(String args[]){

ifelseifcondition c = new ifelseifcondition();
c.display();


}

}