
//it works only in console not in ide
import java.io.Console;

public class ConsoleClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = System.console();
		System.out.println("Enter your name");
		String n = c.readLine();
		System.out.println("welcome "+n);
		System.out.println("Enter password");
		char [] ch = c.readPassword();
		String p = String.valueOf(ch);
		System.out.println("Password is "+p);
	}

}
