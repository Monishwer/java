package collections;

import java.util.Comparator;

public class BookPriceCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		
		if(b1.bookPrice == b2.bookPrice)
			return 0;
		else if(b1.bookPrice > b2.bookPrice)
			return 1;
		else
			return -1;
	}
	
}
