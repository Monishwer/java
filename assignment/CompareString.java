package Assignment2;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1 = "world";
		String n2 = "World";
		boolean Result = n1.equalsIgnoreCase(n2);
		System.out.println(Result);
		
		
		
		if(Result == true) {
			System.out.println(n1 + " is equal to "+n2);
		}
		else {
			System.out.println(n1 + "is not equal to "+n2);
		}
	}

}
