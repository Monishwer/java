package java8Eg;

public class MethodReferenceEg {
	
	public void display(String a) {
		System.out.println("hello iam "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceEg m = new MethodReferenceEg();
		
		Sample1 s = m::display; // referring method using reference
		s.display("mamta"); // calling interface method
	}

}
