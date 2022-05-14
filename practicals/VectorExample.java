package collections;

import java.util.Vector;

public class VectorExample {
	public static void main(String args[]) {
	Vector<String> vc = new Vector<String>();
	vc.add("dog");
	vc.add("cat");
	vc.add(0,"tiger");
	vc.add("lion");
	
	System.out.println(vc);
	if(vc.contains("cat")) {
		System.out.println("element present");
	}
	else {
		System.out.println("element not present");
	}
	}
}
