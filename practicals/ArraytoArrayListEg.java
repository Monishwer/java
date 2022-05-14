package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ArraytoArrayListEg {
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

	System.out.println("List to array ");
	String arr[] = al.toArray(new String[al.size()]);
	for(String s : arr)
	{
	System.out.println(s);
	}

	System.out.println("Array to List");
	List<String> all = new ArrayList<String>();
	all = Arrays.asList(arr);
	System.out.println(all);
	}
}



