package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortEg {

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
		System.out.println("String sorted List : ");
		//sorting al
		Collections.sort(al);
		for(String a : al) {
			System.out.println(a);
		}
		
		
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(20);
		al1.add(60);
		al1.add(20);
		al1.add(10);
		al1.add(67);
		al1.add(98);
		al1.add(5);
		al1.add(94);
		System.out.println("Integer sorted List : ");
		//sorting al1
		Collections.sort(al1);
		for(Integer i : al1) {
			System.out.println(i);
		}
		//sorting al1 in decending
		Collections.reverse(al1);
		System.out.println(al1);
		
	}

}
