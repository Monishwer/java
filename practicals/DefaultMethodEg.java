package java8Eg;

public class DefaultMethodEg implements Sample1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodEg d = new DefaultMethodEg();
		d.display("good morning"); // calling  abstarct method
		d.display1(); // calling default method
		Sample1.my(); // calling static method
	}
	public void display(String a) {
		System.out.println(a);
	}

}
