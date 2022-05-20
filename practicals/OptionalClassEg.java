package java8Eg;

import java.util.Optional;

public class OptionalClassEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = new String[5];
		str[3] = "anudip"; // value of index 3
		Optional<String> c = Optional.ofNullable(str[3]);
		/*
		if(c.isPresent()) { // check for value present or not
			String l = str[3].toUpperCase();
			System.out.println(l);
		}
		else {
			System.out.println("value not there");
			
		}
		*/
		
		//------------------------
		
		System.out.println(c.isPresent());
		System.out.println(c.orElse("value is not present"));
		}
	}


