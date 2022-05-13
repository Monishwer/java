package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListUsingIteratorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		
		
		al.add("rose");
		al.add("sunflower");
		al.add("rose"); //duplicate
		al.add(0, "lily");
		al.add(2, "daisy");
		al.add("marigold");
		al.add(6, "tulip");
		al.add("jasmine");
		
		System.out.println("traversing using for loop");
		for(int i = 0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("traversing using for each");
		for(String i : al) {
			System.out.println(i);
		}
		System.out.println("traversing using iterator");
		Iterator<String> itr =  al.iterator();//getting the iterator
		while(itr.hasNext()) { //checking iterator has elements
			System.out.println(itr.next()); //printing & move to next
		}
		System.out.println("traversing using List iterator - forward");
		ListIterator<String> itr1 = al.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("traversing using List iterator  - backward");
		ListIterator<String> itr2 = al.listIterator(al.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		
	}

}
