package Assignment2;

public class CharOfAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		int n = ch;
		System.out.println("Ascii value of "+ch+" is "+n);
		
		char value1 = 'A';
		char value2 = 'a';
		
		for(int i = 'A'; i<= 'Z'; i++) {
			System.out.print(value1+" ");
			System.out.print(i);
			value1++;
		}
		
	}

}
