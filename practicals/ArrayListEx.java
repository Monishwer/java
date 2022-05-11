package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arrayList
		List<String> al = new ArrayList<String>();
		
		//adding object to arrayList
		al.add("rose");
		al.add("sunflower");
		al.add("rose"); //duplicate
		al.add(0, "lily");
		al.add(2, "daisy");
		al.add("marigold");
		al.add(6, "tulip");
		al.add("jasmine");
		al.add("orchid");
		al.add("lotus");
		al.add(5,"lavender");
		
		//printing arrayList object
		System.out.println(al);
		System.out.println("size of arrayList : "+ al.size());
		
		//removing element at index 5
		al.remove(5);
		
		//printing arrayList after remove
		System.out.println(al);
		System.out.println("size of arrayList : "+ al.size());
		
		al.add("lavendor");
		al.add("lotus");
		System.out.println(al);
		System.out.println("size of arrayList : "+ al.size());
		System.out.println("element of index value is : "+ al.get(6));
			

	}

}
