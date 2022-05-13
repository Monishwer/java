package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		al.add("rose");
		al.add("sunflower");
		al.add("rose");
		al.add("lily");
		al.add("daisy");
		al.add("marigold");
		al.add("tulip");
		al.add("jasmine");
		
		System.out.println("before reversing");
		System.out.println(al.toString());
		
		Collections.reverse(al);
		System.out.println("After Reversing");
		System.out.println(al);
	}

}
