package java8Eg;

@FunctionalInterface
public interface Sample1 {
	
	void display(String a); // abstract method
	
	default void display1() { // default method
		System.out.println("i am default method");
	}
	
	static void my() { //static method
		System.out.println("i am static method");
	
	}
	
	//void abc();
}
