package collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCompareEg {
	public static void main(String args[])
	{
	List<String> al = new ArrayList<String>();
	al.add("Rose");
	al.add("Sunflower");
	al.add("Lily");
	al.add("Daisy");
	al.add("Marigold");
	al.add("Tupil");
	al.add("Jasmine");
	System.out.println(al);

	List<String> al1 = new ArrayList<String>();
	al1.add("Rose");
	al1.add("Sunflower");
	al1.add("Lily");
	al1.add("Daisy");
	al1.add("Marigold");
	al1.add("Tupil");
	al1.add("Jasmine");
	System.out.println(al1);

	boolean b = al.equals(al1);
	System.out.println(b);
	
	al1.add("redrose");
	System.out.println(al1);
	
	boolean b1 = al.equals(al1);
	System.out.println(b1);
	}
}



