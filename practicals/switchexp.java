import java.util.Scanner;
class switchexp{

public void show(){

Scanner s = new Scanner(System.in);
System.out.println("enter the day");
int day = s.nextInt();
switch(day){

case 1:
System.out.println("monday");
break;
case 2:
System.out.println("tuesday");
break;
case 3:
System.out.println("wednesday");
break;
case 4:
System.out.println("thursday");
break;
case 5:
System.out.println("friday");
break;
case 6:
System.out.println("saturday");
break;
case 7:
System.out.println("sunday");
break;
default:
System.out.println("invalid value");
}
}
public static void main(String args[]){
switchexp c = new switchexp();
c.show();
}

}