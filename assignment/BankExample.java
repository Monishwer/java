import java.util.Scanner;

class bankdetails{

private String accountName;
private int accountNo;


public String get_accname(){
	return accountName;
}
public int get_accno(){
	return accountNo;
}

public void set_accname(String value){
	accountName = value;
}
public void set_accno(int value){
	accountNo = value;
}


}


class BankExample{

public static void main(String args[]){

Scanner s = new Scanner(System.in);
String acname;
int acno;
//--------------------------------------

int i, choice, amount, balance = 50000;

for( i = 1; i< 3; i++){
System.out.println("Enter your choice : \n 1:Deposit \n 2:Withdraw");
choice = s.nextInt();
System.out.println("Enter the amount : ");
amount = s.nextInt();

switch(choice){
	case 1:
	balance = balance + amount;
	break;

	case 2:
	balance = balance - amount;
	break;
		
}

}



//--------------------------------------
bankdetails b = new bankdetails();

s.nextLine();
System.out.println("Enter your account Name : ");
acname = s.nextLine();
System.out.println("Enter account no : ");
acno = s.nextInt();

b.set_accname(acname);
b.set_accno(acno);

System.out.println("Account Name is : "+b.get_accname());
System.out.println("Account number is : "+b.get_accno());
System.out.println("Final balance is : "+balance);

}

}