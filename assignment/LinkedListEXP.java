package Assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListEXP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Bank b = new Bank(653747,"vijay",2500,25);
		Bank b1 = new Bank(653748,"ajith",2700,27);
		
		//LinkedList
		System.out.println("--------Using LinkedList---------");
		LinkedList<Bank> al = new LinkedList<>();
		al.add(b);
		al.add(b1);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Bank val = (Bank)itr.next();
			System.out.println(val.accountNo+" "+val.customerName+" "+val.balance+" "+val.customerAge);
		}
		
		//HashSet
		System.out.println("--------Using HashSet---------");
		Set<Bank> s = new HashSet<>();
		s.add(b);
		s.add(b1);
		
		Iterator itr1 = s.iterator();
		while(itr1.hasNext()) {
			Bank value = (Bank)itr1.next();
			System.out.println(value.accountNo+" "+value.customerName+" "+value.balance+" "+value.customerAge );
		}
	}

}
