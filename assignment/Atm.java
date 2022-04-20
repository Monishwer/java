package com;
import java.util.Scanner;

public class Atm {

	public static void main(String args[]){


		int choice, withdraw, deposit, balance = 4000;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice : \n 1:withdraw \n 2:deposit \n 3:check balance \n 4:exit ");
		choice = s.nextInt();


		switch(choice){

			case 1:
			System.out.println("Enter the withdraw amount : ");
			withdraw = s.nextInt();
			if(balance > withdraw){
			System.out.println("you are eligible to withdraw");
			balance = balance - withdraw;
			System.out.println("balance is: "+balance);
			}
			else if(balance < withdraw){
			System.out.println("there is no such amount in your balance");
			System.out.println("balance is: "+balance);
			}
			break;

			case 2:
			System.out.println("Enter the deposit amount : ");
			deposit = s.nextInt();
			balance = balance + deposit;
			System.out.println("balance is : "+balance);
			break;

			case 3:
			System.out.println("Total Balance is : "+balance);
			break;

			case 4:
			System.exit(0);

			
		}


		}

}
