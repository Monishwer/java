package Assignment2;

public class FirstNonRepChar {

	public static void main(String args[]) {
		String word = "hello world";
		
		for(int i = 0; i<word.length(); i++) {
			char ch = word.charAt(i);
			boolean repeat = false;
			for(int j = i+1; j < word.length(); j++) {
				if(ch == word.charAt(j)) {
					System.out.println(ch + "repeated");
					repeat = true;
					break;
				}
			}
			if(repeat == false) {
				System.out.println(" the first non repeated character in string is : "+ch);
				break;
			}
		}
	}
}

