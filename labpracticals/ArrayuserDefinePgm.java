package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import collections.Bank;

public class ArrayuserDefinePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		values v = new values("vijay",25000);
		values v1 = new values("ram",7000);
		values v2 = new values("ravi",2000);
		values v3 = new values("sam",9000);
		
	 
		ArrayList<values> al = new ArrayList<>();
		al.add(v);
		al.add(v1);
		al.add(v2);
		al.add(v3);
		
	
		
		//checking empty or not
		
		System.out.println("ArrayList is Empty : "+al.isEmpty());
		
		//-------------------------------------------------------
		
		System.out.println("before removing 3rd element");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			values val = (values) itr.next();
			System.out.println(val.personName + " " + val.salary);
		}
		//removing 3rd element
		
		al.remove(2);
		

		//traversing
		System.out.println("after removing 3rd element");
		Iterator itr1 = al.iterator();
		while(itr1.hasNext()) {
			values val = (values) itr1.next();
			System.out.println(val.personName + " " + val.salary);
		}
		
	}

}
