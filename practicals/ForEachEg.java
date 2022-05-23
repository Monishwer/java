package java8Eg;

import java.util.ArrayList;
import java.util.List;

public class ForEachEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> flower = new ArrayList<String>();
		flower.add("rose");
		flower.add("jasmine");
		flower.add("sunflower");
		flower.add("marigold");
		flower.add("lilly");
		//flower.forEach(show -> System.out.println(show));// iterating with lambda expression
		flower.forEach(System.out::println); // iterating with method reference

	}

}
