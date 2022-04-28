package com;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomExceptionEg {
	ArrayList<String> languages = new ArrayList<String>(Arrays.asList("english","tamil","telugu","hindi","marati"));
	
	public void check(String language) throws LanguageCheckException{
		if(languages.contains(language)) {
			
			throw new LanguageCheckException(language + " language already exists in list");
			
		}
		else
			languages.add(language);
		System.out.println("language added in list "+languages);
	}
	public static void main(String[] args) throws LanguageCheckException{
		// TODO Auto-generated method stub
		CustomExceptionEg cp = new CustomExceptionEg();
		cp.check("german");
		cp.check("tamil");
	}

}
