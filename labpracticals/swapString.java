package Assignments;

public class swapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";
		String b = "world";
	
		
		System.out.println("before swap : "+ a +" "+b);
		a = a + b; //a = helloworld
		b = a.substring(0,5); //b = hello
		a = a.substring(5); // a = world
		
		System.out.println("after swapping "+a+" "+b);
		
	}

}
