package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		s.add("pen");
		s.add("pencil");
		s.add("mouse");
		s.add("phone");
		s.add(null);
		s.add("ac");
		s.add("bottle");
		s.add("earphone");
		s.add(null);
		s.add("pen");  // duplicate not allowed
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		s.remove("ac");
		System.out.println(s);
	}

}
