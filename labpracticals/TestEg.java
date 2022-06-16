package com.MavenLabEg;

import java.sql.SQLException;
import java.util.Scanner;

public class TestEg {
		
		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			StudentEg st = new StudentEg();
			Scanner s = new Scanner(System.in);
			int ch;
			do {
				System.out.println("1. INSERT \n 2. DISPLAY \n 3. UPDATE \n 4. DELETE \n 5. EXIT");
				System.out.println("enter your choice from 1 - 5");
				ch = Integer.parseInt(s.nextLine());
				System.out.println("----------------");
				
				switch(ch) {
				case 1:
					st.saveStudent();
				case 2:
					st.fetchStudent();
				case 3:
					st.updateStudent();
				case 4:
					st.deleteStudent();
				case 5:
					System.exit(0);
				}		
			}
			while(ch!=5);
		}
	}


